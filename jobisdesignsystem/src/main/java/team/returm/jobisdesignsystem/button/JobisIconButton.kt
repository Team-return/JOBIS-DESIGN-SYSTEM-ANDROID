package team.retum.jobisui.button

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import team.retum.jobisui.colors.ButtonColor
import team.retum.jobisui.image.JobisImage
import team.retum.jobisui.ui.theme.JobisTypography
import team.returm.jobisdesignsystem.util.JobisSize
import team.returm.jobisdesignsystem.button.BasicButton

@Composable
fun JobisIconButton(
    drawable: Int,
    color: ButtonColor,
    enabled: Boolean = true,
    onClick: () -> Unit,
    modifier: Modifier,
    imageSize: Modifier,
    shape: Shape,
    shadow: Boolean = false,
) {
    BasicButton(
        modifier = modifier,
        text = null,
        centerIcon = {
            JobisImage(
                drawable = drawable,
                modifier = imageSize,
            )
        },
        color = color,
        enabled = enabled,
        onClick = onClick,
        shape = shape,
        style = JobisTypography.caption,
        shadow = shadow,
    )
}

@Composable
fun JobisSmallIconButton(
    drawable: Int,
    color: ButtonColor,
    enabled: Boolean = true,
    onClick: () -> Unit,
) {
    JobisIconButton(
        drawable = drawable,
        color = color,
        enabled = enabled,
        imageSize = JobisSize.IconSize.Small,
        modifier = JobisSize.ButtonSize.Icon.Medium,
        onClick = onClick,
        shape = JobisSize.Shape.Circle,
    )
}

@Composable
fun JobisMediumIconButton(
    drawable: Int,
    color: ButtonColor,
    enabled: Boolean = true,
    onClick: () -> Unit,
    shape: Shape,
) {
    JobisIconButton(
        drawable = drawable,
        color = color,
        enabled = enabled,
        imageSize = JobisSize.IconSize.Medium,
        modifier = JobisSize.ButtonSize.Icon.Large,
        onClick = onClick,
        shape = shape,
    )
}