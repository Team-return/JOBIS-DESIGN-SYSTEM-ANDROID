package team.returm.jobisdesignsystem.toast

sealed class ToastType{
    object Success: ToastType()
    object Normal: ToastType()
    object Error: ToastType()
    object Warning: ToastType()
}