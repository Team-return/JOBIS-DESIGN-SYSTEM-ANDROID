package team.returm.jobisdesignsystem.toast

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import team.returm.jobisdesignsystem.R
import team.returm.jobisdesignsystem.colors.JobisColor
import team.returm.jobisdesignsystem.icon.JobisIcon
import team.returm.jobisdesignsystem.theme.Body3
import team.returm.jobisdesignsystem.theme.Body4
import team.returm.jobisdesignsystem.util.JobisSize
import team.returm.jobisdesignsystem.util.jobisClickable

@Composable
internal fun BasicToast(
    title: String? = null,
    message: String,
    dismissToToast: () -> Unit,
    textColor: Color,
    @DrawableRes drawable: Int,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .shadow(
                elevation = 6.dp,
                shape = JobisSize.Shape.Big,
            )
            .background(
                color = JobisColor.Gray100,
                shape = JobisSize.Shape.Big,
            )
            .clip(
                shape = JobisSize.Shape.Big,
            ),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Spacer(modifier = Modifier.width(20.dp))
        Image(
            painter = painterResource(id = drawable),
            contentDescription = stringResource(id = R.string.content_description_icon_toast),
        )
        Spacer(modifier = Modifier.width(18.dp))
        Column(modifier = Modifier.fillMaxWidth(0.85f)) {
            if (title != null) {
                Body3(
                    text = title,
                    color = textColor,
                )
                Body4(
                    text = message,
                    color = JobisColor.Gray600,
                )
            } else {
                Body3(
                    text = message,
                    color = textColor,
                )
            }
        }
        Image(
            modifier = Modifier.jobisClickable(onClick = dismissToToast),
            painter = painterResource(id = JobisIcon.Close),
            contentDescription = stringResource(id = R.string.content_description_icon_toast_close),
        )
    }
}