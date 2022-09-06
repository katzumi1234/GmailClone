package ro.exemplu.gmailcopy.model

data class Account (
    val icon :Int? = null,
    val userName: String,
    val email: String,
    val UnReadMails: Int
    )

