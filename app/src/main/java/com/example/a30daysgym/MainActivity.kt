package com.example.a30daysgym

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandLess
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysgym.ui.theme._30DaysGymTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            _30DaysGymTheme {
                ThirtyDaysOfGym()
            }
        }
    }
}
@Composable
fun ThirtyDaysOfGym() {
    Scaffold(
        topBar = {
            TitleBar()
        }
    ) { it ->

        LazyColumn(contentPadding = it) {
            items(gymList) { gy ->
                Cardlayout(
                    gym = gy
                )
            }
        }
    }
}

@Composable
fun Cardlayout(gym: gym,modifier: Modifier= Modifier) {

    var gymrem by remember { mutableStateOf(false) }
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 18.dp),
        modifier = modifier
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioNoBouncy,
                    stiffness = Spring.StiffnessMediumLow
                )
            )
            .padding(15.dp)
            .clip(RoundedCornerShape(25.dp))
    ) {
        Column(modifier = modifier.padding(12.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier =modifier

                    .fillMaxWidth()

            ) {
                if (gymrem == false) {
                    Image(
                        modifier = modifier
                            .size(72.dp)
                            .clip(RoundedCornerShape(15.dp)),
                        painter = painterResource(gym.imageRes),
                        contentDescription = stringResource(gym.head),
                        contentScale = ContentScale.Crop
                    )
                }
                Column(
                    modifier=Modifier
                        .weight(1f)
                        .padding(8.dp)

                ) {
                    Text(text=stringResource(gym.day),style= MaterialTheme.typography.displaySmall)
                    Text(text = stringResource(gym.head),style= MaterialTheme.typography.labelSmall)
                }
                GymIconButton(gym=gym,gymrem,{gymrem=!gymrem})
            }
            if (gymrem) {
                Spacer(modifier = Modifier.height(8.dp))
                CenterImage(gym=gym,modifier)
                Spacer(modifier = Modifier.height(8.dp))
                description(gym=gym)
            }
        }

    }
}

@Composable
fun CenterImage(gym:gym,modifier: Modifier = Modifier) {
    Image(
        alignment = Alignment.Center,
        modifier = modifier
            .fillMaxWidth()
            .height(450.dp)
            .padding(vertical = 8.dp)
            .clip(RoundedCornerShape(12.dp))
        ,
        painter = painterResource(gym.imageRes),
        contentDescription = stringResource(gym.head),
        contentScale = ContentScale.Crop
    )
}

@Composable
fun description(gym: gym,modifier: Modifier = Modifier) {
    Column (modifier = modifier) {
        Text(
            text=stringResource(gym.desc),
            style= MaterialTheme.typography.bodySmall,
            modifier =modifier.padding(start=8.dp)
        )
    }
}

@Composable
fun GymIconButton(gym:gym,gymrem: Boolean,oncClick:()-> Unit) {
    IconButton(
        onClick = oncClick
    ) {
        Icon(
            imageVector =  if (!gymrem) Icons.Filled.ExpandMore else Icons.Filled.ExpandLess,
            contentDescription = null
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TitleBar() {
    CenterAlignedTopAppBar(
        title = {
            Row() {
                Text(
                    text= stringResource(com.example.a30daysgym.R.string._30_days_of_gym_workouts),
                    style = MaterialTheme.typography.displayLarge
                )
            }
        }
    )
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    _30DaysGymTheme {
        ThirtyDaysOfGym()
    }
}