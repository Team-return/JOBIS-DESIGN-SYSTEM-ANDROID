package team.retum.jobisui.ui.theme

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.NonRestartableComposable
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.ExperimentalTextApi
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import team.retum.jobisui.colors.JobisColor
import team.returm.jobisdesignsystem.R

@Stable
val notosansFamily = FontFamily(
    Font(R.font.notosans_black, FontWeight.Black),
    Font(R.font.notosans_bold, FontWeight.Bold),
    Font(R.font.notosans_light, FontWeight.Light),
    Font(R.font.notosans_medium, FontWeight.Medium),
    Font(R.font.notosans_regular, FontWeight.Normal),
    Font(R.font.notosans_thin, FontWeight.Thin),
)

object JobisTypography {

    @OptIn(ExperimentalTextApi::class)
    private val platFormTextStyle = PlatformTextStyle(
        includeFontPadding = false,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val h1 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 40.sp,
        lineHeight = 60.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val h2 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp,
        lineHeight = 54.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val h3 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
        lineHeight = 48.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val h4 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 28.sp,
        lineHeight = 40.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val h5 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,
        lineHeight = 36.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val h6 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 28.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val body1 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        lineHeight = 26.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val body2 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val subtitle1 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val subtitle2 = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        platformStyle = platFormTextStyle,
    )

    @OptIn(ExperimentalTextApi::class)
    @Stable
    val caption = TextStyle(
        fontFamily = notosansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        platformStyle = platFormTextStyle,
    )
}

@Composable
@NonRestartableComposable
fun Heading1(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.h1,
    )
}

@Composable
@NonRestartableComposable
fun Heading2(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.h2,
    )
}

@Composable
@NonRestartableComposable
fun Heading3(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.h3,
    )
}

@Composable
@NonRestartableComposable
fun Heading4(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.h4,
    )
}

@Composable
@NonRestartableComposable
fun Heading5(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.h5,
    )
}

@Composable
@NonRestartableComposable
fun Heading6(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.h6,
    )
}

@Composable
@NonRestartableComposable
fun Body1(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.body1,
    )
}

@Composable
@NonRestartableComposable
fun Body2(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.body2,
    )
}

@Composable
@NonRestartableComposable
fun Body3(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.subtitle1,
    )
}

@Composable
@NonRestartableComposable
fun Body4(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.subtitle2,
    )
}

@Composable
@NonRestartableComposable
fun Caption(
    modifier: Modifier = Modifier,
    color: Color = JobisColor.Gray900,
    text: String,
) {
    Text(
        modifier = modifier,
        color = color,
        text = text,
        fontFamily = notosansFamily,
        style = JobisTypography.caption,
    )
}

