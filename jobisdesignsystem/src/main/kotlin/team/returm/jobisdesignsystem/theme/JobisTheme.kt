package team.returm.jobisdesignsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import team.retum.jobisui.ui.theme.Shapes
import team.returm.jobisdesignsystem.colors.JobisColor

private val darkColorPalette = darkColors(

)

private val lightColorPalette = lightColors(
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
        darkColorPalette
    } else {
        lightColorPalette
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
