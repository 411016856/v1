package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.example.myapplication.ui.theme.MyApplicationTheme
import com.google.android.filament.Box

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting("資管二B 洪詳華")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column() {
        Text(text = "作者: $name")
        Image(

            painter = painterResource(id = R.drawable.map),

            contentDescription = "地圖",

            alpha = 0.7f,

            modifier = Modifier
        )
    }


//    Box(
//
//        modifier = Modifier.fillMaxSize()
//
//    ){
//
//        Canvas(modifier = Modifier){
//
//            drawRect(Color.BLUE,Offset(x = 500,y=500), size())
//
//        }
//
//    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        Greeting("資管二B 洪詳華")
    }
}