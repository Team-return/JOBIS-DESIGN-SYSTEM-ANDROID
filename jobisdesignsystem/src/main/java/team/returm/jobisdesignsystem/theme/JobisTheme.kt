package team.retum.jobisui.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import team.retum.jobisui.colors.JobisColor

private val DarkColorPalette = darkColors(

)

private val LightColorPalette = lightColors(
    primary = JobisColor.LightBlue,
    primaryVariant = JobisColor.Blue,
    secondary = JobisColor.DarkBlue,
    background = JobisColor.Gray900,
    surface = JobisColor.Gray100,
    onPrimary = JobisColor.Gray500,
    onSecondary = JobisColor.Gray300,
    onBackground = JobisColor.Gray200,
    onSurface = JobisColor.Gray600,
    error = JobisColor.Red,
)

@Composable
fun JobisTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        shapes = Shapes,
        content = content,
    )
}

@Stable
object JobisTheme {

    val colors: Colors
        @Composable
        @ReadOnlyComposable
        get() = LocalColors.current
}

val LocalColors = staticCompositionLocalOf { lightColors() }

val LocalTypography = staticCompositionLocalOf { JobisTypography }
