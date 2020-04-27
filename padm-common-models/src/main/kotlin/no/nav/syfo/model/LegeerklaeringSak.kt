package no.nav.syfo.model

data class DialogmeldingSak(
    val receivedDialogmelding: ReceivedDialogmelding,
    val validationResult: ValidationResult
)