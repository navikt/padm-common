package no.nav.syfo.model

import java.time.LocalDate
import java.time.LocalDateTime


data class Dialogmelding(
    val id: String,
    val dialogmeldingNotat: DialogmeldingNotat?,
    val dialogmeldingSvar: DialogmeldingSvar?,
    val dialogmeldingForesporsel: DialogmeldingForesporsel?,
    val helsepersonell: Helsepersonell,
    val signaturDato: LocalDateTime
)
data class Helsepersonell(
    val navn: Navn,
    val hpr: String?,
    val tlf: String?
)

data class Navn(
    val fornavn: String,
    val mellomnavn: String?,
    val etternavn: String
)

data class DialogmeldingForesporsel(
    val teamakode: TemaKode,
    val tekstNotatInnhold: String,
    val dokIdNotat: String,
    val foresporsel: Foresporsel
)

data class DialogmeldingSvar(
    val teamakode: TemaKode,
    val tekstNotatInnhold: String
)

data class DialogmeldingNotat(
    val teamakode: TemaKode,
    val tekstNotatInnhold: String,
    val dokIdNotat: String,
    val datoNotat: LocalDate
)

data class TemaKode(
    val dn: String,
    val ot: String?,
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