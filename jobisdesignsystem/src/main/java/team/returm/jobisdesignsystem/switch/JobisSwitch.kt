package team.retum.jobisui.switch

import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.runtime.Composable
import team.retum.jobisui.colors.SwitchColor

@Composable
fun JobisSwitch(
    color: SwitchColor,
    enabled: Boolean = true,
    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit,
) {
    Switch(
        checked = isChecked,
        onCheckedChange = onCheckedChange,
        colors = SwitchDefaults.colors(
            checkedThumbColor = color.checkedColor.thumbColor,
            checkedTrackColor = color.checkedColor.trackColor,
            uncheckedThumbColor = color.unCheckedColor.thumbColor,
            uncheckedTrackColor = color.unCheckedColor.trackColor,
            disabledCheckedThumbColor = color.disabledColor.thumbColor,
            disabledCheckedTrackColor = color.disabledColor.trackColor,
            disabledUncheckedThumbColor = color.disabledColor.thumbColor,
            disabledUncheckedTrackColor = color.disabledColor.trackColor,
        ),
        enabled = enabled,
    )
}

