package team.returm.jobisdesignsystem.toast

import androidx.compose.runtime.Composable
import team.returm.jobisdesignsystem.colors.JobisColor
import team.returm.jobisdesignsystem.R

@Composable
fun JobisSuccessToast(
    message: String,
    title: String? = null,
    dismissToToast: () -> Unit,
){
    BasicToast(
        message = message,
        title = title,
        textColor = JobisColor.Green,
        drawable = R.drawable.ic_toast_success,
        dismissToToast = dismissToToast,
    )
}

@Composable
fun JobisNormalToast(
    message: String,
    title: String? = null,
    dismissToToast: () -> Unit,
){
    BasicToast(
        message = message,
        title = title,
        textColor = JobisColor.ToastBlue,
        drawable = R.drawable.ic_toast_normal,
        dismissToToast = dismissToToast,
    )
}

@Composable
fun JobisErrorToast(
    message: String,
    title: String? = null,
    dismissToToast: () -> Unit,
){
    BasicToast(
        message = message,
        title = title,
        textColor = JobisColor.Red,
        drawable = R.drawable.ic_toast_error,
        dismissToToast = dismissToToast,
    )
}

@Composable
fun JobisWarningToast(
    message: String,
    title: String? = null,
    dismissToToast: () -> Unit,
){
    BasicToast(
        message = message,
        title = title,
        textColor = JobisColor.Yellow,
        drawable = R.drawable.ic_toast_warning,
        dismissToToast = dismissToToast,
    )
}