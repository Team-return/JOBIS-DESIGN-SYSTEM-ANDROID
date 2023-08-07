package team.retum.jobisui.colors

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color
import team.returm.jobisdesignsystem.colors.JobisColor

object JobisButtonColor {

    @Stable
    val MainSolidColor = ButtonColor(
        unPressedColor = UnPressedColor.MainSolidUnPressedColor,
        pressedColor = PressedColor.MainSolidPressedColor,
        disabledColor = ButtonDisabledColor.MainSolidDisabledColor,
    )

    @Stable
    val MainGhostColor = ButtonColor(
        unPressedColor = UnPressedColor.MainGhostUnPressedColor,
        pressedColor = PressedColor.MainGhostPressedColor,
        disabledColor = ButtonDisabledColor.MainGhostDisabledColor,
    )

    @Stable
    val MainLightColor = ButtonColor(
        unPressedColor = UnPressedColor.MainLightUnPressedColor,
        pressedColor = PressedColor.MainLightPressedColor,
        disabledColor = ButtonDisabledColor.MainLightDisabledColor,
    )

    @Stable
    val MainGrayColor = ButtonColor(
        unPressedColor = UnPressedColor.MainGrayUnPressedColor,
        pressedColor = PressedColor.MainGrayPressedColor,
        disabledColor = ButtonDisabledColor.MainGrayDisabledColor,
    )

    @Stable
    val MainShadowColor = ButtonColor(
        unPressedColor = UnPressedColor.MainShadowUnPressedColor,
        pressedColor = PressedColor.MainShadowPressedColor,
        disabledColor = ButtonDisabledColor.MainGrayDisabledColor,
    )

}

data class ButtonColor(
    var unPressedColor: ButtonColorSet,
    var pressedColor: ButtonColorSet,
    var disabledColor: ButtonColorSet,
)

data class ButtonColorSet(
    val background: Color,
    val outLine: Color,
    val text: Color,
)

object UnPressedColor {

    @Stable
    val MainSolidUnPressedColor = ButtonColorSet(
        background = JobisColor.LightBlue,
        outLine = JobisColor.LightBlue,
        text = JobisColor.Gray100,
    )

    @Stable
    val MainGhostUnPressedColor = ButtonColorSet(
        background = JobisColor.Gray100,
        outLine = JobisColor.LightBlue,
        text = JobisColor.LightBlue,
    )

    @Stable
    val MainLightUnPressedColor = ButtonColorSet(
        background = JobisColor.Gray300,
        outLine = JobisColor.Gray300,
        text = JobisColor.LightBlue,
    )

    @Stable
    val MainGrayUnPressedColor = ButtonColorSet(
        background = JobisColor.Gray300,
        outLine = JobisColor.Gray300,
        text = JobisColor.Gray900,
    )

    @Stable
    val MainShadowUnPressedColor = ButtonColorSet(
        background = JobisColor.Gray100,
        outLine = JobisColor.Gray100,
        text = JobisColor.Gray900,
    )
}

object PressedColor {

    @Stable
    val MainSolidPressedColor = ButtonColorSet(
        background = JobisColor.DarkBlue,
        outLine = JobisColor.DarkBlue,
        text = JobisColor.Gray100,
    )

    @Stable
    val MainGhostPressedColor = ButtonColorSet(
        background = JobisColor.Blue,
        outLine = JobisColor.Blue,
        text = JobisColor.Gray100,
    )

    @Stable
    val MainLightPressedColor = ButtonColorSet(
        background = JobisColor.LightBlue,
        outLine = JobisColor.LightBlue,
        text = JobisColor.Gray100,
    )

    @Stable
    val MainGrayPressedColor = ButtonColorSet(
        background = JobisColor.Gray600,
        outLine = JobisColor.Gray600,
        text = JobisColor.Gray100,
    )

    @Stable
    val MainShadowPressedColor = ButtonColorSet(
        background = JobisColor.LightBlue,
        outLine = JobisColor.LightBlue,
        text = JobisColor.Gray100,
    )
}

object ButtonDisabledColor {

    @Stable
    val MainSolidDisabledColor = ButtonColorSet(
        background = JobisColor.Gray500,
        outLine = JobisColor.Gray500,
        text = JobisColor.Gray100,
    )

    @Stable
    val MainGhostDisabledColor = ButtonColorSet(
        background = JobisColor.Gray100,
        outLine = JobisColor.Gray400,
        text = JobisColor.Gray500,
    )

    @Stable
    val MainLightDisabledColor = ButtonColorSet(
        background = JobisColor.Gray300,
        outLine = JobisColor.Gray300,
        text = JobisColor.Gray500,
    )

    @Stable
    val MainGrayDisabledColor = ButtonColorSet(
        background = JobisColor.Gray300,
        outLine = JobisColor.Gray300,
        text = JobisColor.Gray500,
    )

    @Stable
    val MainShadowDisabledColor = ButtonColorSet(
        background = JobisColor.Gray300,
        outLine = JobisColor.Gray300,
        text = JobisColor.Gray500,
    )
}