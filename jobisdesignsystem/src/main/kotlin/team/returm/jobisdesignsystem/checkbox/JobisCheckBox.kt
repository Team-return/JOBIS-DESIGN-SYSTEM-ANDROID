package team.returm.jobisdesignsystem.checkbox

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import team.returm.jobisdesignsystem.R
import team.returm.jobisdesignsystem.colors.CheckBoxColor
import team.returm.jobisdesignsystem.icon.JobisIcon
import team.returm.jobisdesignsystem.util.JobisSize
import team.returm.jobisdesignsystem.util.jobisClickable

@Composable
fun JobisCheckBox(
    color: CheckBoxColor,
    enabled: Boolean = true,
    isChecked: Boolean,
    onChecked: () -> Unit,
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
            .clip(shape = JobisSize.Shape.CheckBoxShape)
            .jobisClickable(
                rippleEnabled = true,
                enabled = enabled,
            ) {
                onChecked()
            }
            .border(
                width = 1.5.dp,
                color = outLineColor,
                shape = JobisSize.Shape.CheckBoxShape,
            )
            .background(
                color = backgroundColor,
                shape = JobisSize.Shape.CheckBoxShape,
            ),
        contentAlignment = Alignment.Center,
    ) {
        if (isChecked) {
            Image(
                modifier = Modifier.jobisClickable(onClick = onChecked),
                painter = painterResource(id = JobisIcon.Check),
                contentDescription = stringResource(id = R.string.content_description_icon_checkbox_check),
            )
        }
    }
}