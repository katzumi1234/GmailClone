package ro.exemplu.gmailcopy.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class DataMenu (
    val icon: ImageVector? = null, val title: String? = null,
            val isDivider: Boolean = false, val isHeader:Boolean = false,
    ) {
    object AllInboxes: DataMenu(
        icon = Icons.Outlined.AllInbox,
        title = "Inboxes"
    )
    object Primary: DataMenu(
        icon = Icons.Outlined.Inbox,
        title = "Primary"
    )
    object Social: DataMenu(
        icon = Icons.Outlined.Person,
        title = "Social"
    )
    object Promotions: DataMenu(
        icon = Icons.Outlined.Tag,
        title = "Promotions"
    )
    object Starred: DataMenu(
        icon = Icons.Outlined.StarOutline,
        title = "Starred"
    )
    object Snoozed: DataMenu(
        icon = Icons.Outlined.Snooze,
        title = "Snoozed"
    )
    object Important: DataMenu(
        icon = Icons.Outlined.Label,
        title = "Important"
    )
    object Send: DataMenu(
        icon = Icons.Outlined.Send,
        title = "Send"
    )
    object Schedule: DataMenu(
        icon = Icons.Outlined.Schedule,
        title = "Schedule"
    )
    object Outbox: DataMenu(
        icon = Icons.Outlined.Outbox,
        title = "Outbox"
    )
    object Draft: DataMenu(
        icon = Icons.Outlined.Drafts,
        title = "Drafts"
    )
    object Gmail: DataMenu(
        icon = Icons.Outlined.Mail,
        title = "All Gmail-s"
    )
    object Calendar: DataMenu(
        icon = Icons.Outlined.CalendarToday,
        title = "Calendar"
    )
    object Contacts: DataMenu(
        icon = Icons.Outlined.Contacts,
        title = "Contacts"
    )
    object Settings: DataMenu(
        icon = Icons.Outlined.Settings,
        title = "Settings"
    )
    object Help: DataMenu(
        icon = Icons.Outlined.Help,
        title = "Help & FeedBack"
    )
    object Divider : DataMenu(
        isDivider = true
    )
    object HeaderOne: DataMenu(
        isHeader = true,
        title = "All Labels"
    )
    object HeaderTwo: DataMenu(
        isHeader = true,
        title = "Google Apps"
    )
}