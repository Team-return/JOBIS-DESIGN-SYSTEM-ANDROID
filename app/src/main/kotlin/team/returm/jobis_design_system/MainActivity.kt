package team.returm.jobis_design_system

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import team.returm.jobisdesignsystem.colors.JobisColor
import team.returm.jobisdesignsystem.util.jobisClickable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val context = LocalContext.current

            LaunchedEffect(Unit){

            }

            var stringValue by remember { mutableStateOf("") }
            var booleanValue by remember { mutableStateOf(false) }
            var intValue by remember { mutableStateOf(0) }

            val onStringChanged = { value: String ->
                stringValue = value
            }

            val onBooleanChanged = {
                booleanValue = !booleanValue
            }

            val onIntChanged = { value: Int ->
                intValue = value
            }

            val onButtonClicked = {
                Toast.makeText(context, "클릭!", Toast.LENGTH_SHORT).show()
            }

            Box(
                modifier = Modifier
                    .size(84.dp)
                    .background(JobisColor.Gray200)
                    .jobisClickable(
                        rippleEnabled = true
                    ) {
                        onButtonClicked()
                    },
                contentAlignment = Alignment.Center,
            ) {
                /* ... */
            }
        }
    }
}