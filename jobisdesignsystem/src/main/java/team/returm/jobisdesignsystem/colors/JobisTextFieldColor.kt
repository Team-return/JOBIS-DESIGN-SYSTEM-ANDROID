package team.retum.jobisui.colors

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

object JobisTextFieldColor{

    @Stable
    val MainColor = TextFieldColor(
        focusedColor = FocusedColor.MainColor,
        unFocusedColor = UnFocusedColor.MainColor,
        disabledColor = TextFieldDisabledColor.MainColor,
        errorColor = ErrorColor.MainColor,
    )

    @Stable
    val UnderLineColor = TextFieldColor(
        focusedColor = FocusedColor.UnderLineColor,
        unFocusedColor = UnFocusedColor.MainColor,
        disabledColor = TextFieldDisabledColor.MainColor,
        errorColor = ErrorColor.MainColor,
    )
}

data class TextFieldColor(
    var focusedColor: TextFieldColorSet,
    var unFocusedColor: TextFieldColorSet,
    var disabledColor: TextFieldColorSet,
    var errorColor: TextFieldColorSet
)

data class TextFieldColorSet(
    var outLineColor: Color,
    var backgroundColor: Color,
    var textColor: Color,
    var fieldTextColor: Color,
    var helperTextColor: Color,
)

object FocusedColor{
    @Stable
    val MainColor = TextFieldColorSet(
        outLineColor = JobisColor.Gray600,
        backgroundColor = JobisColor.Gray100,
        textColor = JobisColor.Gray900,
        fieldTextColor = JobisColor.Gray700,
        helperTextColor = JobisColor.Gray600,
    )

    @Stable
    val UnderLineColor = TextFieldColorSet(
        outLineColor = JobisColor.LightBlue,
        backgroundColor = JobisColor.Gray100,
        textColor = JobisColor.Gray900,
        fieldTextColor = JobisColor.Gray700,
        helperTextColor = JobisColor.Gray600,
    )
}

object UnFocusedColor{
    @Stable
    val MainColor = TextFieldColorSet(
        outLineColor = JobisColor.Gray400,
        backgroundColor = JobisColor.Gray100,
        textColor = JobisColor.Gray900,
        fieldTextColor = JobisColor.Gray700,
        helperTextColor = JobisColor.Gray600,
    )
}

object TextFieldDisabledColor {
    @Stable
    val MainColor = TextFieldColorSet(
        outLineColor = JobisColor.Gray400,
        backgroundColor = JobisColor.Gray300,
        textColor = JobisColor.Gray500,
        fieldTextColor = JobisColor.Gray500,
        helperTextColor = JobisColor.Gray600,
    )
}

object ErrorColor{
    @Stable
    val MainColor = TextFieldColorSet(
        outLineColor = JobisColor.Red,
        backgroundColor = JobisColor.Gray100,
        textColor = JobisColor.Gray900,
        fieldTextColor = JobisColor.Red,
        helperTextColor = JobisColor.Red,
    )
}
