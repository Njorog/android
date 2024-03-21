package com.mburu.mburu

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.mburu.my.MainActivity

class AboutActivit : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { Greeting2()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting2() {
    Column (
        modifier = Modifier
            .background(Color.Cyan)
            .fillMaxSize(),

        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally





    ) {


        Text(text = "New activity", fontSize = 30.sp, fontFamily = FontFamily.Cursive,modifier = Modifier.background(
            Color.Green))
        Text(text = "IS ABOUT TO HAPPEN", fontSize = 30.sp, fontFamily = FontFamily.Serif, modifier = Modifier.background(
            Color.Yellow))


        val about= LocalContext.current
        Button(onClick = {   about.startActivity(Intent(about, MainActivity::class.java)) },




            ) {
            Text(text = "HERE")



        }



    }
}


