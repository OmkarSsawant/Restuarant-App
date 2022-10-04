package com.visiondev.ccthrusdaytrivia4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import com.visiondev.ccthrusdaytrivia4.ui.theme.CCThrusdayTrivia4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CCThrusdayTrivia4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        SearchBar()

                    }
                }
            }
        }
    }

}


@Composable
private fun SearchBar() {
    var query  by remember{ mutableStateOf("") }

        OutlinedTextField(modifier = Modifier
            .fillMaxWidth(.8f)
            .padding(12.dp)
            ,value = query , onValueChange = {
                query = it }, placeholder = {
                Text("Restaurant name or a dish")
            }, shape = RoundedCornerShape(12.dp), leadingIcon = {                Icon(Icons.Default.Search,"search_icon")
            })



}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CCThrusdayTrivia4Theme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {

            SearchBar()
        }
    }

}