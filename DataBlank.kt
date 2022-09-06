package ro.exemplu.gmailcopy.componente

import ro.exemplu.gmailcopy.model.Account
import ro.exemplu.gmailcopy.model.DataGmail
import ro.exemplu.gmailcopy.R

val mailList = listOf(
    DataGmail(
        mailId = 1,
        userName = "Iancu",
        subject = "Gmail Legat de Locul de muncă actual",
        body = "This is a spam Gmail !",
        timeStamp = "01:39"
    ),
    DataGmail(
        mailId = 2,
        userName = "Cristy",
        subject = "Gmail Legat de jantele de pe Audi",
        body = "Am pus niște jante noi pe masina, ti-am trimis pe wapp niște poze să îmi zici cum sunt",
        timeStamp = "02:14"
    ),
    DataGmail(
        mailId = 3,
        userName = "By Criss",
        subject = "Gmail Legat de jantele de pe Audi",
        body = "Am pus niște jante noi pe masina, ti-am trimis pe wapp niște poze să îmi zici cum sunt",
        timeStamp = "03:30"
    ),
    DataGmail(
        mailId = 4,
        userName = "Emil",
        subject = "Gmail Legat de jantele de pe Audi",
        body = "Am pus niște jante noi pe masina, ti-am trimis pe wapp niște poze să îmi zici cum sunt",
        timeStamp = "04:10"
    ),
    DataGmail(
        mailId = 5,
        userName = "Victor",
        subject = "Gmail Legat de jantele de pe Audi",
        body = "Am pus niște jante noi pe masina, ti-am trimis pe wapp niște poze să îmi zici cum sunt",
        timeStamp = "05:13"
    ),
    DataGmail(
        mailId = 6,
        userName = "Dița",
        subject = "Gmail Legat de jantele de pe Audi",
        body = "Am pus niște jante noi pe masina, ti-am trimis pe wapp niște poze să îmi zici cum sunt",
        timeStamp = "06:01"
    ),
    DataGmail(
        mailId = 7,
        userName = "Radu",
        subject = "Gmail Legat de jantele de pe Audi",
        body = "Am pus niște jante noi pe masina, ti-am trimis pe wapp niște poze să îmi zici cum sunt",
        timeStamp = "08:36"
    ),
    DataGmail(
        mailId = 1,
    userName = "Iancu",
    subject = "Gmail Legat de Locul de muncă actual",
    body = "This is a spam Gmail !",
    timeStamp = "09:34"
)
)
val accountList = listOf<Account>(
    Account(icon = R.drawable.tedy,userName = "Tedy Account",
        email="TedyAccont864@gmail.com",UnReadMails = 99),
    Account(userName = "Cristi Popescu",email = "cristipopescu140@gmail.com",UnReadMails = 99),
    Account(userName = "Ion Ilie",email = "ionilie417@gmail.com",UnReadMails = 99)
)