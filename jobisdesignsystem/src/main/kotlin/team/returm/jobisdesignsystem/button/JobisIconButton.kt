package team.returm.jobisdesignsystem.button

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import team.retum.jobisui.colors.ButtonColor
import team.retum.jobisui.colors.JobisButtonColor
import team.returm.jobisdesignsystem.theme.JobisTypography
import team.returm.jobisdesignsystem.util.JobisSize

@Composable
private fun JobisIconButton(
    @DrawableRes drawableRes: Int,
    color: ButtonColor,
    enabled: Boolean,
    onClick: () -> Unit,
    rippleEnabled: Boolean,
    bounceEnabled: Boolean,
    modifier: Modifier,
    shape: Shape,
    shadow: Boolean,
    imageContentDescription: String,
) {
    BasicButton(
        modifier = modifier,
        text = null,
        leftIcon = null,
        centerIcon = {
            Image(
                painter = painterResource(id = drawableRes),
                contentDescription = imageContentDescription,
            )
        },
        rightIcon = null,
        color = color,
        enabled = enabled,
        rippleEnabled = rippleEnabled,
        bounceEnabled = bounceEnabled,
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
    bounceEnabled: Boolean = true,
    shadow: Boolean = false,
    imageContentDescription: String,
    onClick: () -> Unit,
) {
    JobisIconButton(
        drawableRes = drawable,
        color = color,
        enabled = enabled,
        modifier = JobisSize.ButtonSize.Icon.Medium,
        onClick = onClick,
        rippleEnabled = rippleEnabled,
        bounceEnabled = bounceEnabled,
        shape = JobisSize.Shape.Circle,
        shadow = shadow,
        imageContentDescription = imageContentDescription,
    )
}

@Composable
fun JobisMediumIconButton(
    drawable: Int,
    color: ButtonColor = JobisButtonColor.MainSolidColor,
    enabled: Boolean = true,
    rippleEnabled: Boolean = false,
    pressed: Float = 0.99f,
    bounceEnabled: Boolean = true,
    shadow: Boolean = false,
    shape: Shape,
    imageContentDescription: String,
    onClick: () -> Unit,
) {
    JobisIconButton(
        drawableRes = drawable,
        color = color,
        enabled = enabled,
        rippleEnabled = rippleEnabled,
        bounceEnabled = bounceEnabled,
        modifier = JobisSize.ButtonSize.Icon.Large,
        onClick = onClick,
        shape = shape,
        shadow = shadow,
        imageContentDescription = imageContentDescription,
    )
}