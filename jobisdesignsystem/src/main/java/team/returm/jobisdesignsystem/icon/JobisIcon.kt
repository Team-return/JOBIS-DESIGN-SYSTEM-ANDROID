package team.returm.jobisdesignsystem.icon

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import team.retum.jobisui.image.JobisImage
import team.returm.jobisdesignsystem.util.JobisSize
import team.returm.jobisdesignsystem.R

object JobisIcon {

    @Composable
    fun BasicIcon(
        modifier: Modifier = JobisSize.IconSize.Small,
        drawable: Int,
    ) {
        JobisImage(
            modifier = modifier,
            drawable = drawable,
        )
    }

    @Composable
    fun SearchIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_search,
        )
    }

    @Composable
    fun DateIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_date,
        )
    }

    @Composable
    fun FileDownloadIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_file_download,
        )
    }

    @Composable
    fun UploadIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_upload,
        )
    }

    @Composable
    fun FilePlusIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_file_plus,
        )
    }

    @Composable
    fun DownBarIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_bar_down,
        )
    }

    @Composable
    fun VisibleOffIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_visible_off,
        )
    }

    @Composable
    fun VisibleOnIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_visible_on,
        )
    }

    @Composable
    fun CheckIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_check,
        )
    }

    @Composable
    fun CloseIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_close,
        )
    }

    @Composable
    fun DownArrowIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_arrow_down,
        )
    }

    @Composable
    fun UpArrowIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_arrow_up,
        )
    }

    @Composable
    fun RightArrowIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_arrow_right,
        )
    }

    @Composable
    fun LeftArrowIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_arrow_left,
        )
    }

    @Composable
    fun DownLoadIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_download,
        )
    }

    @Composable
    fun LogOutIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_logout,
        )
    }

    @Composable
    fun PlusIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_plus,
        )
    }

    @Composable
    fun MenuIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_menu,
        )
    }

    @Composable
    fun TrashIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_trash,
        )
    }

    @Composable
    fun SnackBarChatIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_snack_bar_chat,
        )
    }

    @Composable
    fun SnackBarCheckIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_snack_bar_check,
        )
    }

    @Composable
    fun SnackBarErrorIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_snack_bar_error,
        )
    }

    @Composable
    fun SnackBarWarningIcon(
        modifier: Modifier = Modifier,
    ) {
        BasicIcon(
            modifier = modifier,
            drawable = R.drawable.ic_snack_bar_warning,
        )
    }
}