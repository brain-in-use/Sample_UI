package com.example.sampleui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.sampleui.ui.theme.SampleUITheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SampleUITheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                    SampleImage(
                        modifier = Modifier.padding(8.dp)
                    )
                }

                }
            }
        }
    }

@Composable
fun SampleImage(modifier: Modifier = Modifier){
    val image= painterResource(R.drawable.bg_compose_background)
    Column {
        Box(modifier) {
            Image(
                painter = image,
                contentDescription = null
            )
        }

        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 24.sp,
            modifier=Modifier.padding(16.dp)
            )

        Text(
                text= stringResource(R.string.first_line),
        modifier=Modifier.padding(start = 16.dp, end = 16.dp)
        )

        Text(
            text=" In this tutorial, you build a simple Ul component" +
                    "with declarative functions. You call Compose" +
                    "functions to say what elements you want and the" +
                    "Compose compiler does the rest. Compose is" +
                    "built around Composable functions. These" +
                    "functions let you define your app's Ul" +
                    "programmatically because they let you describe" +
                    "how" +
                    "it should look" +
                    "and provide data" +
                    "dependencies, rather than focus on the process of" +
                    "the Ul's construction, such as initializing an" +
                    "element and then attaching it to a parent. To" +
                    "create a Composable function, you add the" +
                    "@Composable annotation to the function name.",
            modifier=Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )

    }
}

@Preview(showBackground = true)
@Composable
fun SamplePreview() {
    SampleUITheme {
        SampleImage()
    }
}