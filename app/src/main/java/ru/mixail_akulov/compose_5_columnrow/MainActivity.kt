package ru.mixail_akulov.compose_5_columnrow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAbsoluteAlignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloWord()
        }
    }
}

@Preview(
    showSystemUi = true
)
@Composable
fun HelloWord() {
    Column(
        horizontalAlignment = BiasAbsoluteAlignment.Horizontal(-1f),
        verticalArrangement = Arrangement.SpaceEvenly ,
        modifier = Modifier.background(Color.Yellow)
            .fillMaxSize()
    ) {
        Text("Такая вот\n херня",
            fontSize = 20.sp,
            color = Color.Red,
            modifier = Modifier
                .background(Color.Green)
                .padding(10.dp)
                .background(Color.Blue)
                .align(Alignment.End)
                .weight(2f)
        )
        Text(
            "Хрен\nкакойто",
            fontSize = 35.sp,
            color = Color.Blue,
            modifier = Modifier.background(Color.Red)
                .weight(4f)
        )
        Text(
            "69",
            fontSize = 31.sp,
            color = Color.Green,
            modifier = Modifier.background(Color.Blue)
                .weight(2f)
        )
    }
}