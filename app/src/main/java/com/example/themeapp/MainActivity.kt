package com.example.themeapp

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.shapes
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.themeapp.data.DataSource
import com.example.themeapp.model.DogDetails
import com.example.themeapp.ui.theme.ThemeAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ThemeAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    DogApp(dogDetails = DataSource().loaddata())
                }
            }
        }
    }
}
@Composable
fun DogApp(dogDetails: List<DogDetails>) {

        LazyColumn(Modifier.padding(3.dp)) {
            items(dogDetails) { dog ->
                DogListItem(dogIcon = dog.dogIcon, dogname = dog.dogname, dogage = dog.dogage)
            }
        }

}

@Composable
fun DogListItem(dogIcon:Int,dogname: Int,dogage: Int){
    Card() {
        Row() {
            DogIcon(IconId = dogIcon)
            DogInformation(dogname = dogname, dogage =dogage)
        }
        
    }
}
@Composable
fun DogInformation(@StringRes dogname:Int,@StringRes dogage:Int,modifier: Modifier=Modifier){
    Column(modifier) {
        Text(text = stringResource(dogname),modifier=Modifier.padding(top=3.dp), fontSize = 16.sp, fontFamily = FontFamily.Monospace)
        Text(text = stringResource(id = dogage))
    }
}
@Composable
fun DogIcon(@DrawableRes IconId:Int,modifier: Modifier=Modifier){
    Image(contentScale= ContentScale.Crop, painter= painterResource(IconId),
    contentDescription= null, modifier = Modifier
            .size(40.dp, 40.dp)
            .padding(7.dp)
            .clip(shapes.small))
}
