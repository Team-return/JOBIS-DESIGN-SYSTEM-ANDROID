package team.returm.jobisdesignsystem.dropdown

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import team.returm.jobisdesignsystem.R
import team.returm.jobisdesignsystem.colors.DropDownColor
import team.returm.jobisdesignsystem.icon.JobisIcon
import team.returm.jobisdesignsystem.theme.Caption
import team.returm.jobisdesignsystem.util.Animated
import team.returm.jobisdesignsystem.util.JobisSize
import team.returm.jobisdesignsystem.util.jobisClickable

@Composable
fun JobisDropDown(
    modifier: Modifier = Modifier,
    color: DropDownColor,
    enabled: Boolean = true,
    rippleEnabled: Boolean = false,
    itemList: List<String>,
    title: String,
    onItemSelected: (Int) -> Unit,
) {

    var dropDownTitle by remember { mutableStateOf(title) }

    var isExpanded by remember { mutableStateOf(false) }

    val changeIsExpanded = {
        isExpanded = !isExpanded
    }

    val rotateState by animateFloatAsState(
        targetValue = if (isExpanded) 180f else 0f
    )

    val borderColor: Color
    val backgroundColor: Color

    if (enabled) {
        borderColor = color.enabledColor.outLine
        backgroundColor = color.enabledColor.background
    } else {
        borderColor = color.disabledColor.outLine
        backgroundColor = color.enabledColor.background
    }

    Column {
        Row(
            modifier = modifier
                .clip(
                    shape = JobisSize.Shape.Large,
                )
                .fillMaxWidth()
                .height(30.dp)
                .border(
                    width = 1.dp,
                    color = borderColor,
                    shape = JobisSize.Shape.Large,
                )
                .background(
                    color = backgroundColor,
                    shape = JobisSize.Shape.Large,
                )
                .jobisClickable(
                    rippleEnabled = rippleEnabled,
                ) {
                    isExpanded = !isExpanded
                }
                .padding(
                    horizontal = 12.dp,
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
        ) {
            Caption(
                text = dropDownTitle,
            )
            Image(
                modifier = Modifier
                    .rotate(rotateState)
                    .jobisClickable(onClick = changeIsExpanded),
                painter = painterResource(id = JobisIcon.DownArrow),
                contentDescription = stringResource(id = R.string.content_description_icon_dropdown),
            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Animated(visible = isExpanded) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(
                        height = if (itemList.size >= 5) 94.dp
                        else (itemList.size * 26).dp
                    )
                    .border(
                        width = 1.dp,
                        color = borderColor,
                        shape = JobisSize.Shape.Large,
                    )
                    .background(
                        color = backgroundColor,
                        shape = JobisSize.Shape.Large,
                    )
                    .clip(
                        shape = JobisSize.Shape.Large,
                    ),
                verticalArrangement = Arrangement.Center,
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(
                            state = rememberScrollState(),
                        ),
                ) {
                    repeat(itemList.size) {
                        DropDownItem(
                            text = itemList[it],
                            onItemSelected = {
                                isExpanded = false
                                dropDownTitle = itemList[it]
                                onItemSelected(it)
                            },
                            outLineColor = borderColor,
                            last = it == itemList.size - 1,
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun DropDownItem(
    text: String,
    onItemSelected: () -> Unit,
    outLineColor: Color,
    last: Boolean,
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onItemSelected()
            }
            .padding(
                start = 16.dp,
                end = 16.dp,
            ),
        verticalArrangement = Arrangement.Center,
    ) {
        Caption(
            modifier = Modifier.padding(vertical = 4.dp),
            text = text,
        )
        if (!last) {
            Divider(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(
                        color = outLineColor
                    ),
            )
        }
    }
}