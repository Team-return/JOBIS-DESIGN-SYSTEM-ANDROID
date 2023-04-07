package team.returm.jobisdesignsystem.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import team.retum.jobisui.util.jobisClickable

@Composable
fun JobisImage(
    modifier: Modifier = Modifier,
    drawable: Int,
    onClick: (() -> Unit)? = null,
) {
    Image(
        painterResource(id = drawable),
        modifier = modifier
            .jobisClickable(
                interactionSource = remember { MutableInteractionSource() },
                onClick = onClick ?: {},
            ),
        contentDescription = null,
    )
}