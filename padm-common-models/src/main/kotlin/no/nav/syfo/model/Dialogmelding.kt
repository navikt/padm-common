package no.nav.syfo.model

import java.time.LocalDateTime


data class Dialogmelding(
    val id: String,
    val dialogmeldingHenvendelseFraLege: DialogmeldingHenvendelseFraLege?,
    val dialogmeldingInnkallingDialogmote: DialogmeldingInnkallingDialogmote?,
    val dialogmeldingForesporselOmPasier: DialogmeldingForesporselOmPasient?,
    val navnHelsepersonell: String,
    val signaturDato: LocalDateTime
)

data class DialogmeldingForesporselOmPasient(
    val teamakode: TemaKode,
    val tekstNotatInnhold: String,
    val dokIdNotat: String,
    val foresporsel: Foresporsel
)

data class DialogmeldingInnkallingDialogmote(
    val teamakode: TemaKode,
    val tekstNotatInnhold: String,
    val dokIdNotat: String,
    val foresporsel: Foresporsel
)

data class DialogmeldingHenvendelseFraLege(
    val teamakode: TemaKode,
    val tekstNotatInnhold: String,
    val dokIdNotat: String?,
    val datoNotat: LocalDateTime?
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