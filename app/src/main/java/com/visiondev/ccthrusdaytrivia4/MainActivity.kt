package com.visiondev.ccthrusdaytrivia4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.visiondev.ccthrusdaytrivia4.data.mock.MOCK_HOTELS
import com.visiondev.ccthrusdaytrivia4.data.models.Hotel
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

                    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize()) {
                        SearchBar()
                        HotelListing(MOCK_HOTELS)
                    }
                }
            }
        }
    }

}
@Composable
fun HotelListing(hotels: List<Hotel>) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        contentPadding = PaddingValues(12.dp)
    ){
        items(hotels){hotel->
            Card(elevation = 12.dp, modifier = Modifier.fillMaxSize(), shape = RoundedCornerShape(12.dp)) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(text = hotel.name,style= TextStyle(fontWeight = FontWeight.Bold, fontSize = 32.sp, fontFamily = FontFamily.SansSerif))
                    Image(painter = painterResource(id = hotel.imgRes), contentDescription = "Hotel Image")
                    Text(text = hotel.address,style= TextStyle(fontWeight = FontWeight.Thin, fontSize = 14.sp, fontFamily = FontFamily.SansSerif))
                    IconButton(onClick = { /*TODO*/ },Modifier
                        .padding(12.dp)
                        .background(Color.Red)) {
                        Row(
                            modifier = Modifier.padding(12.dp)
                        ){
                            Icon(painter = painterResource(id = R.drawable.ic_baseline_book_online_24), contentDescription = "book online", tint = Color.White)
                            Spacer(modifier = Modifier
                                .size(12.dp))
                            Text(text = "Book Online", color = Color.White)
                        }

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
            Column(horizontalAlignment = Alignment.CenterHorizontally,   modifier = Modifier.fillMaxSize(),) {
                SearchBar()
                HotelListing(MOCK_HOTELS)
            }
        }
    }

}