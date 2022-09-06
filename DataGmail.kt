package ro.exemplu.gmailcopy.model

data class DataGmail(
    val mailId:Int,
    val userName:String,
    val subject: String,
    val body:String,
    val timeStamp:String = ""
)
