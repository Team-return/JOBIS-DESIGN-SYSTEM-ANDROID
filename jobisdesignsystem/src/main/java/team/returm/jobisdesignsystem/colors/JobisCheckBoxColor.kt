package team.returm.jobisdesignsystem.colors

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

object JobisCheckBoxColor {
    @Stable
    val MainColor = CheckBoxColor(
        checkedColor = CheckedColor.MainCheckedColor,
        unCheckedColor = UnCheckedColor.MainUnCheckedColor,
        disabledColor = DisabledColor.MainDisabledColor,
    )
}

data class CheckBoxColor(
    var checkedColor: CheckBoxColorSet,
    var unCheckedColor: CheckBoxColorSet,
    var disabledColor: CheckBoxColorSet,
)

data class CheckBoxColorSet(
    val background: Color,
    val outLine: Color,
)

object CheckedColor {

    @Stable
    val MainCheckedColor = CheckBoxColorSet(
        background = JobisColor.ToastBlue,
        outLine = JobisColor.ToastBlue,
    )
}

object UnCheckedColor {

    @Stable
    val MainUnCheckedColor = CheckBoxColorSet(
        background = JobisColor.Gray100,
        outLine = JobisColor.Gray400,
    )
}

object DisabledColor {

    @Stable
    val MainDisabledColor = CheckBoxColorSet(
        background = JobisColor.Gray400,
        outLine = JobisColor.Gray500,
    )
}