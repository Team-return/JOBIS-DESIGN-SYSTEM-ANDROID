package team.returm.jobisdesignsystem.util

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color

@Stable
fun Modifier.jobisClickable(
    rippleEnabled: Boolean = false,
    enabled: Boolean = true,
    onClick: () -> Unit,
) = composed {
    Modifier.clickable(
        onClick = onClick,
        enabled = enabled,
        interactionSource = remember { MutableInteractionSource() },
        indication = rememberRipple(
            color = Color.Unspecified,
        ).takeIf {
            rippleEnabled
        },
    )
}