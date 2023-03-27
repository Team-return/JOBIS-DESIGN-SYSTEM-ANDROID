package team.returm.jobisdesignsystem.textfield

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Divider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import team.retum.jobisui.colors.JobisColor
import team.retum.jobisui.colors.TextFieldColor
import team.retum.jobisui.image.JobisImage
import team.retum.jobisui.ui.theme.Body4
import team.retum.jobisui.ui.theme.Caption
import team.retum.jobisui.ui.theme.JobisTypography
import team.retum.jobisui.util.JobisSize
import team.returm.jobisdesignsystem.R
import team.returm.jobisdesignsystem.util.Animated

@Composable
fun JobisTextField(
    modifier: Modifier = Modifier,
    fieldText: String? = null,
    helperText: String? = null,
    value: String,
    hint: String,
    color: TextFieldColor,
    onValueChanged: (String) -> Unit,
    imeAction: ImeAction = ImeAction.Done,
    keyboardType: KeyboardType = KeyboardType.Text,
    keyboardOptions: KeyboardOptions = KeyboardOptions(
        keyboardType = keyboardType,
        imeAction = imeAction,
    ),
    isPassword: Boolean,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    enabled: Boolean,
    error: Boolean,
    divider: @Composable (() -> Unit)? = null,
    isFocused: Boolean,
    isBox: Boolean = false,
) {

    var passwordVisible by remember { mutableStateOf(false) }

    val fieldTextColor = if (!enabled) color.disabledColor.fieldTextColor
    else if (error) color.errorColor.fieldTextColor
    else if (isFocused) color.focusedColor.fieldTextColor
    else color.unFocusedColor.fieldTextColor

    val helperTextColor = if (error) color.errorColor.helperTextColor
    else color.unFocusedColor.helperTextColor

    val textColor = if (!enabled) color.disabledColor.textColor
    else if (error) color.errorColor.textColor
    else color.unFocusedColor.textColor


    Column {
        if (fieldText != null) {
            Body4(
                color = fieldTextColor,
                text = fieldText,
            )
            if(isBox) {
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
        Row(
            modifier = modifier,
            verticalAlignment = Alignment.CenterVertically,
        ) {
            BasicTextField(
                value = value,
                onValueChanged,
                modifier = Modifier.fillMaxWidth(0.9f),
                singleLine = true,
                visualTransformation = if (!passwordVisible && isPassword) PasswordVisualTransformation() else VisualTransformation.None,
                maxLines = 1,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                textStyle = JobisTypography.subtitle2,
                enabled = enabled,
            ) { innerTextField ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth(0.8f)
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Box {
                        if (value.isEmpty()) {
                            Body4(
                                color = JobisColor.Gray500,
                                text = hint,
                            )
                        }
                        innerTextField()
                    }
                }
            }
            if (isPassword && value.isNotEmpty()) {
                JobisImage(
                    onClick = { passwordVisible = !passwordVisible },
                    drawable = if (passwordVisible) R.drawable.ic_visible_on
                    else R.drawable.ic_visible_off
                )
            }
        }
        if (divider != null) {
            divider()
        }
        if (helperText != null && enabled) {
            Animated(
                visible = error,
            ) {
                Spacer(modifier = Modifier.height(8.dp))
                Caption(
                    color = helperTextColor,
                    text = helperText,
                )
            }
        }
    }
}

@Composable
fun JobisBoxTextField(
    color: TextFieldColor,
    onValueChanged: (String) -> Unit,
    value: String,
    error: Boolean = false,
    enabled: Boolean = true,
    hint: String,
    isPassword: Boolean = false,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardType: KeyboardType = KeyboardType.Text,
    fieldText: String? = null,
    helperText: String? = null,
) {

    var isFocused by remember { mutableStateOf(false) }

    val outLineColor = if (!enabled) color.disabledColor.outLineColor
    else if (error) color.errorColor.outLineColor
    else if (isFocused) color.focusedColor.outLineColor
    else color.unFocusedColor.outLineColor

    JobisTextField(
        modifier = JobisSize.TextFieldSize.Main
            .border(
                width = 1.dp,
                shape = JobisSize.Shape.Tiny,
                color = outLineColor,
            )
            .onFocusChanged {
                isFocused = it.isFocused
            },
        onValueChanged = onValueChanged,
        value = value,
        hint = hint,
        enabled = enabled,
        fieldText = fieldText,
        helperText = helperText,
        error = error,
        isFocused = isFocused,
        color = color,
        isPassword = isPassword,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        keyboardType = keyboardType,
        isBox = true,
    )
}

@Composable
fun JobisUnderLineTextField(
    color: TextFieldColor,
    onValueChanged: (String) -> Unit,
    value: String,
    error: Boolean = false,
    enabled: Boolean = true,
    hint: String,
    isPassword: Boolean = false,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardType: KeyboardType = KeyboardType.Text,
    fieldText: String? = null,
    helperText: String? = null,
) {

    var isFocused by remember { mutableStateOf(false) }

    val outLineColor = if (!enabled) color.disabledColor.outLineColor
    else if (error) color.errorColor.outLineColor
    else if (isFocused) color.focusedColor.outLineColor
    else color.unFocusedColor.outLineColor

    JobisTextField(
        modifier = JobisSize.TextFieldSize.Main
            .onFocusChanged {
                isFocused = it.isFocused
            },
        onValueChanged = onValueChanged,
        value = value,
        hint = hint,
        enabled = enabled,
        fieldText = fieldText,
        helperText = helperText,
        error = error,
        isFocused = isFocused,
        color = color,
        isPassword = isPassword,
        keyboardActions = keyboardActions,
        keyboardOptions = keyboardOptions,
        keyboardType = keyboardType,
        divider = {
            Divider(
                modifier = JobisSize.TextFieldSize.UnderLine
                    .border(
                        width = 1.dp,
                        color = outLineColor,
                    )
            )
        }
    )
}