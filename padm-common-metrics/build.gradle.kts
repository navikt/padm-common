val prometheusVersion = "0.6.0"

plugins {
    id("java")
    id("maven-publish")
    id("org.sonarqube") version "2.7"
}

dependencies {
    api("io.prometheus:simpleclient_common:$prometheusVersion")
}

subprojects {
    properties["sonarHost"]?.let { host ->
        sonarqube {
            properties {
                property("sonar.sourceEncoding", "UTF-8")
                property("sonar.host.url", host)
            }
        }
    }
}

publishing {
    repositories {
        maven {
            url = uri("https://maven.pkg.github.com/navikt/padm-common")
            credentials {
                username = System.getenv("GITHUB_USERNAME")
                password = System.getenv("GITHUB_PASSWORD")
            }
        }
    }
    publications {
        create<MavenPublication>("mavenJava") {

            pom {
                name.set("padm-common-metrics")
                description.set("Bibliotek for felles metricer for dialogmeldinger doement")
                url.set("https://github.com/navikt/padm-common")
                licenses {
                    license {
                        name.set("MIT License")
                        url.set("https://opensource.org/licenses/MIT")
                    }
                }

                scm {
                    connection.set("scm:git:https://github.com/navikt/padm-common.git")
                    developerConnection.set("scm:git:https://github.com/navikt/padm-common.git")
                    url.set("https://github.com/navikt/padm-common")
                }
            }
            from(components["java"])
        }
    }
}