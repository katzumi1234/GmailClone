package ro.exemplu.gmailcopy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.rememberScrollState
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ro.exemplu.gmailcopy.componente.*
import ro.exemplu.gmailcopy.model.DataGmail
import ro.exemplu.gmailcopy.ui.theme.GmailCopyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GmailCopyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    GmailCopy()
                }
            }
        }
    }
}

@Composable
fun GmailCopy() {

    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()
    val scrollState = rememberScrollState()
    val openDialog = remember{
        mutableStateOf(false)
    }

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {HomeBar(scaffoldState,coroutineScope,openDialog )},
        drawerContent = {
            GmailHomeMenu(scrollState)
        },
        bottomBar = {
            BottomMenu()
        },
        floatingActionButton = {
            GmailFtb(scrollState)
        }
        ) {
        MailLists(it, scrollState)
        }
        
    }


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    GmailCopyTheme {
        GmailCopy()
    }
}