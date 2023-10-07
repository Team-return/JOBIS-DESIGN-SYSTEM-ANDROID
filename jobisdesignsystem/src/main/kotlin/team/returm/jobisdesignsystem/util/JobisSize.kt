package team.returm.jobisdesignsystem.util

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Stable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

object JobisSize {

    object ButtonSize {

        object Default {
            @Stable
            val Small = Modifier.height(30.dp)

            @Stable
            val Medium = Modifier.height(44.dp)

            @Stable
            val Large = Modifier.height(50.dp)
        }

        object Icon {

            @Stable
            val Small = Modifier.size(24.dp)

            @Stable
            val Medium = Modifier.size(30.dp)

            @Stable
            val Large = Modifier.size(44.dp)
        }
    }

    object TextFieldSize {
        @Stable
        val Main = Modifier.height(44.dp)

        @Stable
        val UnderLine = Modifier.height(1.dp)
    }

    object Shape {

        @Stable
        val Tiny = RoundedCornerShape(4.dp)

        @Stable
        val Small = RoundedCornerShape(8.dp)

        @Stable
        val Medium = RoundedCornerShape(12.dp)

        @Stable
        val Large = RoundedCornerShape(16.dp)

        @Stable
        val Big = RoundedCornerShape(20.dp)

        @Stable
        val Circle = CircleShape

        @Stable
        val CheckBoxShape = RoundedCornerShape(2.dp)
    }

    object IconSize {
        @Stable
        val Small = Modifier.size(20.dp)

        @Stable
        val Medium = Modifier.size(26.dp)
    }

    object CheckBoxSize {
        @Stable
        val Default = Modifier.size(24.dp)
    }
}