package team.retum.jobisui.button

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import team.retum.jobisui.colors.CheckBoxColor
import team.returm.jobisdesignsystem.util.JobisSize
import team.retum.jobisui.util.jobisClickable

@Composable
fun JobisRadioButton(
    color: CheckBoxColor,
    enabled: Boolean = true,
    isChecked: Boolean,
    onClick: (Boolean) -> Unit,
) {

    val outLineColor: Color
    val backgroundColor: Color

    if (!enabled) {
        outLineColor = color.disabledColor.outLine
        backgroundColor = if (isChecked) color.disabledColor.outLine
        else color.disabledColor.background
    } else if (isChecked) {
        outLineColor = color.checkedColor.outLine
        backgroundColor = color.checkedColor.background
    } else {
        outLineColor = color.unCheckedColor.outLine
        backgroundColor = color.unCheckedColor.background
    }

    Box(
        modifier = JobisSize.CheckBoxSize.Default
            .clip(shape = JobisSize.Shape.Circle)
            .jobisClickable(
                rippleEnabled = true,
                enabled = enabled,
                interactionSource = remember { MutableInteractionSource() }
            ) {
                onClick(!isChecked)
            }
            .border(
                width = 1.5.dp,
                color = outLineColor,
                shape = JobisSize.Shape.Circle,
            ),
        contentAlignment = Alignment.Center,
    ) {
        if (enabled || isChecked) {
            Divider(
                modifier = Modifier
                    .size(10.dp)
                    .clip(shape = JobisSize.Shape.Circle)
                    .background(
                        color = backgroundColor,
                        shape = JobisSize.Shape.Circle,
                    )
            )
        }
    }
}