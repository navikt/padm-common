package no.nav.syfo.model


data class Dialogmelding(
    val id: String,
    val dialogmeldingNotat: DialogmeldingNotat?,
    val dialogmeldingSvar: DialogmeldingSvar?,
    val DialogmeldingForesporsel: DialogmeldingForesporsel?
)

data class DialogmeldingSvar(
    val svar: String
)

data class DialogmeldingForesporsel(
    val foresporsel: String
)

data class DialogmeldingNotat(
    val teamakode: TemaKode,
    val tekstNotatInnhold: String,
    val dokIdNotat: String,
    val foresporsel: Foresporsel
)

data class TemaKode(
    val dn: String,
    val ot: String,
    val s: String,
    val v: String
)

data class Foresporsel(
    val typeForesp: TypeForesp,
    val sporsmal: String,
    val dokIdForesp: String,
    val rollerRelatertNotat: RollerRelatertNotat
)

data class RollerRelatertNotat(
    val rolleNotat: RolleNotat,
    val person: Person
)

data class Person(
    val givenName: String,
    val familyName: String
)

data class RolleNotat(
    val s: String,
    val v: String
)

data class TypeForesp(
    val dn: String,
    val s: String,
    val v: String
)