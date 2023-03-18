package team.retum.jobisui.colors

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

object JobisDropDownColor{
    @Stable
    val MainColor = DropDownColor(
        disabledColor = DropDownDisabledColor.MainColor,
        enabledColor = DropDownEnabledColor.MainColor,
    )
}

data class DropDownColor(
    val disabledColor: DropDownColorSet,
    val enabledColor: DropDownColorSet,
)

data class DropDownColorSet(
    val background: Color,
    val outLine: Color,
)

object DropDownEnabledColor{
    @Stable
    val MainColor = DropDownColorSet(
        background = JobisColor.Gray100,
        outLine = JobisColor.Gray400,
    )
}

object DropDownDisabledColor{
    @Stable
    val MainColor = DropDownColorSet(
        background = JobisColor.Gray500,
        outLine = JobisColor.Gray500,
    )
}

