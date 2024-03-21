package com.mburu.mburu

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mburu.my.MainActivity

class MainActivit : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greetin()





        }
    }
}


@Preview(showBackground = true)
@Composable
fun Greetin() {
    Column(modifier = Modifier
        .background(Color.White)
        .fillMaxSize()

    ){
        Row(modifier = Modifier
            .background(Color.Magenta)
            .fillMaxWidth()
        ) {
            Text(text = "HOME",modifier = Modifier.background(Color.White),)
            Spacer(modifier = Modifier.width(30.dp))
            Text(text = "About",modifier = Modifier.background(Color.White))
            Spacer(modifier = Modifier.width(30.dp))
            Text(text = "service",modifier = Modifier.background(Color.White))
        }
        Spacer(modifier = Modifier.height(40.dp))

        Text(text = "The one and only app , where you can buy suppliments",modifier = Modifier.background(Color.White))
        Text(text = "Commodities are of various uses",modifier = Modifier.background(Color.White))
        Text(text = "Tonic green",modifier = Modifier.background(Color.White))
        Spacer(modifier = Modifier.height(50.dp))



        val about=LocalContext.current
        Button(onClick = {
            about.startActivity(Intent(about, MainActivity::class.java))


        },
            colors= ButtonDefaults.buttonColors(Color.Transparent),
//            shape = RectangleShape
            shape= RoundedCornerShape(13.dp),
            border = BorderStroke(1.dp, Color.DarkGray)


        ) {
            Text(text = "BUY", modifier = Modifier.background(Color.Magenta))

        }

        Spacer(modifier = Modifier.height(30.dp))

        val txt= AnnotatedString("click here to view the products")
        val licv= LocalContext.current
        ClickableText(text = txt , onClick ={
            licv.startActivity(Intent(licv, MainActivity::class.java))


        })

    }



}

