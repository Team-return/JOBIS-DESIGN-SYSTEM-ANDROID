package team.returm.jobisdesignsystem.textfield

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.onFocusChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import team.returm.jobisdesignsystem.R
import team.returm.jobisdesignsystem.colors.JobisColor
import team.returm.jobisdesignsystem.colors.JobisTextFieldColor
import team.returm.jobisdesignsystem.colors.TextFieldColor
import team.returm.jobisdesignsystem.icon.JobisIcon
import team.returm.jobisdesignsystem.theme.Body4
import team.returm.jobisdesignsystem.theme.Caption
import team.returm.jobisdesignsystem.theme.JobisTypography
import team.returm.jobisdesignsystem.util.JobisSize
import team.returm.jobisdesignsystem.util.jobisClickable

@Composable
fun JobisBasicTextField(
    modifier: Modifier,
    fieldText: String?,
    helperText: String?,
    errorText: String?,
    value: String,
    hint: String,
    color: TextFieldColor,
    onValueChanged: (String) -> Unit,
    imeAction: ImeAction,
    keyboardType: KeyboardType,
    textFieldType: TextFieldType?,
    onIconClick: (() -> Unit)?,
    keyboardActions: KeyboardActions,
    enabled: Boolean,
    error: Boolean,
    divider: @Composable (() -> Unit)? = null,
    isFocused: Boolean,
    icon: @Composable (() -> Unit)?,
) {

    var passwordVisible by remember { mutableStateOf(false) }

    val fieldTextColor = if (!enabled) color.disabledColor.fieldTextColor
    else if (error) color.errorColor.fieldTextColor
    else if (isFocused) color.focusedColor.fieldTextColor
    else color.unFocusedColor.fieldTextColor

    val helperTextColor = if (error) color.errorColor.helperTextColor
    else color.unFocusedColor.helperTextColor

    val textFieldWidth = if (textFieldType != null) 0.9f else 1f

    val changePasswordVisibility = { passwordVisible = !passwordVisible }

    Box {
        Column {
            if (fieldText != null) {
                Body4(
                    color = fieldTextColor,
                    text = fieldText,
                )
                if (divider == null) {
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
            Row(
                modifier = modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                BasicTextField(
                    value = value,
                    onValueChange = onValueChanged,
                    modifier = Modifier.fillMaxWidth(textFieldWidth),
                    singleLine = true,
                    visualTransformation = if (!passwordVisible && textFieldType == TextFieldType.PASSWORD) PasswordVisualTransformation()
                    else VisualTransformation.None,
                    maxLines = 1,
                    keyboardOptions = KeyboardOptions(
                        keyboardType = keyboardType,
                        imeAction = imeAction,
                    ),
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
                if (textFieldType != null) {
                    when (textFieldType) {
                        TextFieldType.PASSWORD -> {
                            if (value.isNotEmpty()) {
                                Image(
                                    modifier = Modifier.jobisClickable(onClick = changePasswordVisibility),
                                    painter = painterResource(
                                        id = if (passwordVisible) JobisIcon.VisibleOn
                                        else JobisIcon.VisibleOff
                                    ),
                                    contentDescription = stringResource(id = R.string.content_description_icon_password_visibility),
                                )
                            }
                        }

                        TextFieldType.SEARCH -> {
                            Image(
                                modifier = Modifier.jobisClickable(onClick = { onIconClick?.invoke() }),
                                painter = painterResource(id = JobisIcon.Search),
                                contentDescription = stringResource(id = R.string.content_description_icon_text_field),
                            )
                        }
                    }
                }
                icon?.invoke()
            }
            divider?.invoke()
            if (enabled && (helperText != null || errorText != null)) {
                Spacer(modifier = Modifier.height(2.dp))
                Caption(
                    text = if (error) errorText ?: ""
                    else helperText ?: "",
                    color = helperTextColor,
                )
            }
        }
    }
}

@Composable
fun JobisBoxTextField(
    color: TextFieldColor = JobisTextFieldColor.MainColor,
    onValueChanged: (String) -> Unit,
    value: String,
    error: Boolean = false,
    enabled: Boolean = true,
    hint: String,
    textFieldType: TextFieldType? = null,
    onIconClick: (() -> Unit)? = null,
    imeAction: ImeAction = ImeAction.Done,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardType: KeyboardType = KeyboardType.Text,
    fieldText: String? = null,
    helperText: String? = null,
    errorText: String? = null,
    icon: @Composable (() -> Unit)? = null,
) {

    var isFocused by remember { mutableStateOf(false) }

    val outLineColor = if (!enabled) color.disabledColor.outLineColor
    else if (error) color.errorColor.outLineColor
    else if (isFocused) color.focusedColor.outLineColor
    else color.unFocusedColor.outLineColor

    val backgroundColor = if (enabled) JobisColor.Gray100
    else JobisColor.Gray300

    JobisBasicTextField(
        modifier = JobisSize.TextFieldSize.Main
            .border(
                width = 1.dp,
                shape = JobisSize.Shape.Tiny,
                color = outLineColor,
            )
            .background(
                color = backgroundColor,
                shape = JobisSize.Shape.Tiny,
            )
            .onFocusChanged {
                isFocused = it.isFocused
            },
        fieldText = fieldText,
        helperText = helperText,
        errorText = errorText,
        value = value,
        hint = hint,
        color = color,
        onValueChanged = onValueChanged,
        imeAction = imeAction,
        keyboardType = keyboardType,
        onIconClick = onIconClick,
        textFieldType = textFieldType,
        keyboardActions = keyboardActions,
        enabled = enabled,
        error = error,
        isFocused = isFocused,
        icon = icon,
    )
}

@Composable
fun JobisUnderLineTextField(
    color: TextFieldColor = JobisTextFieldColor.UnderLineColor,
    onValueChanged: (String) -> Unit,
    value: String,
    error: Boolean = false,
    enabled: Boolean = true,
    hint: String,
    textFieldType: TextFieldType? = null,
    onIconClick: (() -> Unit)? = null,
    imeAction: ImeAction = ImeAction.Done,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    keyboardType: KeyboardType = KeyboardType.Text,
    fieldText: String? = null,
    helperText: String? = null,
    errorText: String? = null,
    icon: @Composable (() -> Unit)? = null,
) {

    var isFocused by remember { mutableStateOf(false) }

    val outLineColor = if (!enabled) color.disabledColor.outLineColor
    else if (error) color.errorColor.outLineColor
    else if (isFocused) color.focusedColor.outLineColor
    else color.unFocusedColor.outLineColor

    JobisBasicTextField(
        modifier = JobisSize.TextFieldSize.Main
            .onFocusChanged {
                isFocused = it.isFocused
            },
        fieldText = fieldText,
        helperText = helperText,
        errorText = errorText,
        value = value,
        hint = hint,
        color = color,
        onValueChanged = onValueChanged,
        imeAction = imeAction,
        keyboardType = keyboardType,
        onIconClick = onIconClick,
        textFieldType = textFieldType,
        keyboardActions = keyboardActions,
        enabled = enabled,
        error = error,
        divider = {
            Divider(
                modifier = JobisSize.TextFieldSize.UnderLine
                    .border(
                        width = 1.dp,
                        color = outLineColor,
                    )
            )
        },
        isFocused = isFocused,
        icon = icon,
    )
}