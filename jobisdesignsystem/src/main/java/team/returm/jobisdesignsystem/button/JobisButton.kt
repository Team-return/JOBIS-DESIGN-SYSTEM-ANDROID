package team.returm.jobisdesignsystem.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import team.retum.jobisui.colors.ButtonColor
import team.retum.jobisui.ui.theme.JobisTypography
import team.retum.jobisui.util.jobisClickable
import team.returm.jobisdesignsystem.util.JobisSize

@Composable
fun BasicButton(
    modifier: Modifier = Modifier,
    color: ButtonColor,
    shape: Shape,
    leftIcon: @Composable (() -> Unit)? = null,
    rightIcon: @Composable (() -> Unit)? = null,
    centerIcon: @Composable (() -> Unit)? = null,
    onClick: () -> Unit,
    text: String?,
    style: TextStyle,
    enabled: Boolean,
    shadow: Boolean,
) {

    val interactionSource = remember { MutableInteractionSource() }

    val isPressed by interactionSource.collectIsPressedAsState()

    val backgroundColor: Color?
    val outLineColor: Color?
    val textColor: Color?

    if (!enabled) {
        backgroundColor = color.disabledColor.background
        outLineColor = color.disabledColor.outLine
        textColor = color.disabledColor.text
    } else if (isPressed) {
        backgroundColor = color.pressedColor.background
        outLineColor = color.pressedColor.outLine
        textColor = color.pressedColor.text
    } else {
        backgroundColor = color.unPressedColor.background
        outLineColor = color.unPressedColor.outLine
        textColor = color.unPressedColor.text
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .shadow(
                elevation = if (shadow) 6.dp
                else 0.dp,
                shape = shape,
            )
            .clip(shape = shape)
            .jobisClickable(
                interactionSource = interactionSource,
                onClick = onClick,
            )
            .border(
                width = 1.5.dp,
                color = outLineColor,
                shape = shape,
            )
            .background(
                color = backgroundColor,
                shape = shape,
            ),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (leftIcon != null) {
            leftIcon()
            Spacer(modifier = Modifier.width(4.dp))
        }
        if (text != null) {
            Text(
                text = text,
                style = style,
                color = textColor,
            )
        } else if (centerIcon != null) {
            centerIcon()
        }
        if (rightIcon != null) {
            Spacer(modifier = Modifier.width(4.dp))
            rightIcon()
        }
    }
}

@Composable
fun JobisSmallButton(
    text: String,
    color: ButtonColor,
    leftIcon: @Composable (() -> Unit)? = null,
    rightIcon: @Composable (() -> Unit)? = null,
    enabled: Boolean = true,
    shadow: Boolean = false,
    onClick: () -> Unit,
) {
    BasicButton(
        modifier = JobisSize.ButtonSize.Default.Small,
        text = text,
        style = JobisTypography.body2,
        color = color,
        enabled = enabled,
        shape = JobisSize.Shape.Circle,
        onClick = onClick,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        shadow = shadow,
    )
}

@Composable
fun JobisMediumButton(
    text: String,
    color: ButtonColor,
    leftIcon: @Composable (() -> Unit)? = null,
    rightIcon: @Composable (() -> Unit)? = null,
    enabled: Boolean = true,
    shadow: Boolean = false,
    onClick: () -> Unit,
) {
    BasicButton(
        modifier = JobisSize.ButtonSize.Default.Medium,
        text = text,
        style = JobisTypography.h6,
        color = color,
        enabled = enabled,
        shape = JobisSize.Shape.Medium,
        onClick = onClick,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        shadow = shadow,
    )
}

@Composable
fun JobisLargeButton(
    text: String,
    color: ButtonColor,
    leftIcon: @Composable (() -> Unit)? = null,
    rightIcon: @Composable (() -> Unit)? = null,
    enabled: Boolean = true,
    shadow: Boolean = false,
    onClick: () -> Unit,
) {
    BasicButton(
        modifier = JobisSize.ButtonSize.Default.Large,
        text = text,
        style = JobisTypography.h6,
        color = color,
        enabled = enabled,
        shape = JobisSize.Shape.Large,
        onClick = onClick,
        leftIcon = leftIcon,
        rightIcon = rightIcon,
        shadow = shadow,
    )
}