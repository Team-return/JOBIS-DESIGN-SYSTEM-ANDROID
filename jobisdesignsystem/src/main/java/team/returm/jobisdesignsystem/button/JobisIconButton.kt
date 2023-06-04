package team.returm.jobisdesignsystem.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import team.retum.jobisui.colors.ButtonColor
import team.retum.jobisui.colors.JobisButtonColor
import team.returm.jobisdesignsystem.theme.JobisTypography
import team.returm.jobisdesignsystem.image.JobisImage
import team.returm.jobisdesignsystem.util.JobisSize

@Composable
private fun JobisIconButton(
    drawable: Int,
    color: ButtonColor,
    enabled: Boolean,
    onClick: () -> Unit,
    rippleEnabled: Boolean,
    modifier: Modifier,
    imageSize: Modifier,
    shape: Shape,
    shadow: Boolean,
) {
    BasicButton(
        modifier = modifier,
        text = null,
        leftIcon = null,
        centerIcon = {
            JobisImage(
                drawable = drawable,
                modifier = imageSize,
                onClick = onClick,
                enabled = enabled,
                rippleEnabled = rippleEnabled,
            )
        },
        rightIcon = null,
        color = color,
        enabled = enabled,
        rippleEnabled = rippleEnabled,
        onClick = onClick,
        shape = shape,
        style = JobisTypography.caption,
        shadow = shadow,
    )
}

@Composable
fun JobisSmallIconButton(
    drawable: Int,
    color: ButtonColor = JobisButtonColor.MainSolidColor,
    enabled: Boolean = true,
    rippleEnabled: Boolean = false,
    shadow: Boolean = false,
    onClick: () -> Unit,
) {
    JobisIconButton(
        drawable = drawable,
        color = color,
        enabled = enabled,
        imageSize = JobisSize.IconSize.Small,
        modifier = JobisSize.ButtonSize.Icon.Medium,
        onClick = onClick,
        rippleEnabled = rippleEnabled,
        shape = JobisSize.Shape.Circle,
        shadow = shadow,
    )
}

@Composable
fun JobisMediumIconButton(
    drawable: Int,
    color: ButtonColor = JobisButtonColor.MainSolidColor,
    enabled: Boolean = true,
    rippleEnabled: Boolean = false,
    shadow: Boolean = false,
    shape: Shape,
    onClick: () -> Unit,
) {
    JobisIconButton(
        drawable = drawable,
        color = color,
        enabled = enabled,
        rippleEnabled = rippleEnabled,
        imageSize = JobisSize.IconSize.Medium,
        modifier = JobisSize.ButtonSize.Icon.Large,
        onClick = onClick,
        shape = shape,
        shadow = shadow,
    )
}