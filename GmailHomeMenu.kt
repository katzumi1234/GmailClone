package ro.exemplu.gmailcopy.componente

import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ro.exemplu.gmailcopy.model.DataMenu

@Composable
fun GmailHomeMenu(scrollState: ScrollState){

    val menuList = listOf(
        DataMenu.Divider,
        DataMenu.AllInboxes,
        DataMenu.Divider,
        DataMenu.Primary,
        DataMenu.Social,
        DataMenu.Promotions,
        DataMenu.HeaderOne,
        DataMenu.Starred,
        DataMenu.Snoozed,
        DataMenu.Important,
        DataMenu.Send,
        DataMenu.Schedule,
        DataMenu.Outbox,
        DataMenu.Draft,
        DataMenu.Gmail,
        DataMenu.HeaderTwo,
        DataMenu.Calendar,
        DataMenu.Contacts,
        DataMenu.Divider,
        DataMenu.Settings,
        DataMenu.Help
    )

        Column(Modifier.verticalScroll(scrollState)){
            Text(text = "Tedy Gmail", color = Color.Blue,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
            menuList.forEach{
                item->


                when{
                    item.isDivider->{
                        Divider(modifier = Modifier.padding(bottom = 20.dp, top = 20.dp))
                    }
                    item.isHeader->{
                        Text(text = item.title!!, fontWeight = FontWeight.Light,
                        modifier = Modifier.padding(start=20.dp,bottom=20.dp,
                        top = 20.dp))
                    }else->
                        {
                            GmailItem(item=item)

                        }

                }


            }
        }
}

@Composable
fun GmailItem(item: DataMenu){
    Row(
        modifier = Modifier.fillMaxWidth().height(50.dp).padding(top = 16.dp)
    ){
        Image(imageVector = item.icon!!,
            contentDescription = item.title!!,
            modifier = Modifier.weight(0.5f)
        )
        Text(text = item.title, modifier =  Modifier.weight(2.0f))
    }
}
