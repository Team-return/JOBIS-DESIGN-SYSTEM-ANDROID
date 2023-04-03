package team.returm.jobisdesignsystem.dropdown

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import team.retum.jobisui.colors.DropDownColor
import team.retum.jobisui.ui.theme.Caption
import team.returm.jobisdesignsystem.icon.JobisIcon
import team.returm.jobisdesignsystem.util.JobisSize

@Composable
fun JobisDropDown(
    modifier: Modifier = Modifier,
    color: DropDownColor,
    enabled: Boolean = true,
    itemList: List<String>,
    title: String,
) {

    var dropDownTitle by remember { mutableStateOf(title) }

    var isExpanded by remember { mutableStateOf(false) }

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

    Column(

    ) {
        Row(
            modifier = modifier
                .clip(
                    shape = JobisSize.Shape.Large,
                )
                .size(
                    width = 116.dp,
                    height = 30.dp,
                )
                .border(
                    width = 1.dp,
                    color = borderColor,
                    shape = JobisSize.Shape.Large,
                )
                .background(
                    color = backgroundColor,
                    shape = JobisSize.Shape.Large,
                ),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Caption(
                modifier = Modifier
                    .fillMaxWidth(0.76f)
                    .padding(start = 16.dp),
                text = dropDownTitle,
            )
            JobisIcon.DownArrowIcon()
        }

        Spacer(modifier = Modifier.height(8.dp))

        AnimatedVisibility(isExpanded) {
            Column(
                modifier = Modifier
                    .width(116.dp)
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
                LazyColumn(
                    horizontalAlignment = Alignment.CenterHorizontally,
                ) {
                    itemsIndexed(items = itemList) { index, item ->
                        DropDownItem(
                            text = item,
                            onItemSelected = {
                                isExpanded = false
                                dropDownTitle = item
                            },
                            outLineColor = borderColor,
                            last = index == itemList.size - 1
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
                    .size(
                        width = 148.dp,
                        height = 1.dp,
                    )
                    .background(
                        color = outLineColor
                    ),
            )
        }
    }
}