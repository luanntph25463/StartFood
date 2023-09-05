package com.example.startfood

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.startfood.ui.theme.StartFoodTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StartFoodTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    banner()
                }
            }
        }
    }
}

@Composable
fun banner(modifier: Modifier = Modifier.background(Color.Yellow)) {
    Column(modifier = modifier ) {
        Row(modifier = modifier) {
            Text(
                text = "It’s time for a",
                modifier
                    .padding(top = 40.dp)
                    .weight(2f),
                style = MaterialTheme.typography.titleLarge,
                fontSize = 36.sp,
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(R.drawable.background2),
                contentScale = ContentScale.Crop,
                modifier = modifier
                    .size(150.dp)
                    .clip(CircleShape),
                contentDescription = null
            )
        }
        Column(modifier = modifier.padding(start = 20.dp, end = 10.dp)) {
            Text(
                text = "Drink",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 30.sp,
                color = Color.Magenta,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "The one-stop to find amazing drink mixes for any occassion.",
                style = MaterialTheme.typography.titleLarge,
                fontSize = 14.sp,
                color = Color.Gray,
            )
            Button(onClick = { }, modifier.padding(5.dp)) {
                Text(
                    text = "Get Started   >",
                    style = MaterialTheme.typography.titleLarge,
                    fontSize = 14.sp,
                    color = Color.White,
                )
            }
            Box(modifier = Modifier.fillMaxSize()) {
                Image(

                    painter = painterResource(R.drawable.background1),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )
                Image(

                    painter = painterResource(R.drawable.background3),
                    contentDescription = "",
                    modifier = Modifier.fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    StartFoodTheme {
        banner()
    }
}