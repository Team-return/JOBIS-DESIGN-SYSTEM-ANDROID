package team.retum.jobisui.util

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
            val Small = Modifier
                .size(
                    width = 70.dp,
                    height = 30.dp,
                )

            @Stable
            val Medium = Modifier
                .size(
                    width = 130.dp,
                    height = 44.dp,
                )

            @Stable
            val Large = Modifier
                .size(
                    width = 320.dp,
                    height = 50.dp,
                )
        }

        object Icon {
            @Stable
            val Small = Modifier.size(30.dp)

            @Stable
            val Medium = Modifier.size(44.dp)
        }
    }

    object TextFieldSize{
        @Stable
        val Main = Modifier.size(
            width = 380.dp,
            height = 44.dp,
        )

        @Stable
        val UnderLine = Modifier.size(
            width = 380.dp,
            height = 1.dp,
        )
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

    object CheckBoxSize{
        @Stable
        val Default = Modifier.size(24.dp)
    }
}