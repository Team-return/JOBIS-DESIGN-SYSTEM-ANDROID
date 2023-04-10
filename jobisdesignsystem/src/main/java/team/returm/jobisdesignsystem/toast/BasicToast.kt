package team.returm.jobisdesignsystem.toast

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
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
import androidx.compose.ui.unit.dp
import team.retum.jobisui.colors.JobisColor
import team.retum.jobisui.ui.theme.Body3
import team.retum.jobisui.ui.theme.Body4
import team.returm.jobisdesignsystem.icon.JobisIcon
import team.returm.jobisdesignsystem.image.JobisImage
import team.returm.jobisdesignsystem.util.Animated
import team.returm.jobisdesignsystem.util.JobisSize

@Composable
fun BasicToast(
    title: String? = null,
    message: String,
    onCloseClick: () -> Unit,
    messageColor: Color,
    icon: @Composable () -> Unit,
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
        Spacer(
            modifier = Modifier.width(20.dp),
        )

        icon()

        Spacer(
            modifier = Modifier.width(18.dp)
        )

        Column(
            modifier = Modifier.fillMaxWidth(0.85f),
        ) {
            if (title != null) {
                Body3(
                    text = title,
                )
                Body4(
                    text = message,
                    color = messageColor,
                )
            } else {
                Body3(
                    text = message,
                    color = messageColor,
                )
            }
        }

        JobisImage(
            drawable = JobisIcon.Close,
            onClick = onCloseClick,
        )
    }
}

@Composable
fun JobisToast(
    isShowToast: Boolean,
    title: String? = null,
    message: String,
    messageColor: Color,
    drawable: Int,
    onCloseClick: () -> Unit,
) {

    Box(
        modifier = Modifier.height(96.dp),
    ) {
        Column {
            Animated(
                visible = isShowToast,
            ) {
                BasicToast(
                    title = title,
                    message = message,
                    onCloseClick = onCloseClick,
                    messageColor = messageColor,
                ) {
                    JobisImage(
                        drawable = drawable,
                    )
                }
            }
        }
    }
}

