package team.returm.jobisdesignsystem.image

import androidx.compose.foundation.Image
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import team.returm.jobisdesignsystem.util.jobisClickable

@Composable
fun JobisImage(
    modifier: Modifier = Modifier,
    drawable: Int,
    onClick: (() -> Unit)? = null,
    enabled: Boolean = true,
    rippleEnabled: Boolean = false,
) {
    Image(
        painterResource(id = drawable),
        modifier = modifier
            .jobisClickable(
                enabled = enabled,
                rippleEnabled = rippleEnabled,
            ) {
                 onClick?.invoke()
            },
        contentDescription = null,
    )
}