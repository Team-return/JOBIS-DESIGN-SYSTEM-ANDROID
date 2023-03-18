package team.retum.jobisui.colors

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

object JobisSwitchColor{
    @Stable
    val MainColor = SwitchColor(
        unCheckedColor = SwitchUnCheckedColor.MainColor,
        checkedColor = SwitchCheckedColor.MainColor,
        disabledColor = SwitchDisabledColor.MainColor,
    )
}

data class SwitchColor(
    var unCheckedColor: SwitchColorSet,
    var checkedColor: SwitchColorSet,
    var disabledColor: SwitchColorSet,
)

data class SwitchColorSet(
    val thumbColor: Color,
    val trackColor: Color,
)

object SwitchUnCheckedColor{
    @Stable
    val MainColor = SwitchColorSet(
        thumbColor = JobisColor.Gray500,
        trackColor = JobisColor.Gray500,
    )
}

object SwitchCheckedColor{
    @Stable
    val MainColor = SwitchColorSet(
        thumbColor = JobisColor.Checked,
        trackColor = JobisColor.Gray500,
    )
}

object SwitchDisabledColor{
    @Stable
    val MainColor = SwitchColorSet(
        thumbColor = JobisColor.Gray500,
        trackColor = JobisColor.Gray400,
    )
}