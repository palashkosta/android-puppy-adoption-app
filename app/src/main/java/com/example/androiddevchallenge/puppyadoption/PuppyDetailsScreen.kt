package com.example.androiddevchallenge.puppyadoption

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.androiddevchallenge.R

@Composable
fun PuppyDetailsScreen(navController: NavController, puppyId: Int?) {

    if (puppyId == null) {
        Text(text = "Invalid Puppy Id")
    } else {
        val puppyItem = PuppyAdoptionRepository.loadDummyPuppyDetails(puppyId)
        Scaffold(
            topBar = {
                PuppyDetailsScreenAppBar(
                    puppyItem = puppyItem,
                    navController = navController
                )
            },
            content = {
                PuppyDetailsScreenContent(puppyItem = puppyItem)
            })
    }
}

@Composable
private fun PuppyDetailsScreenAppBar(puppyItem: PuppyItem, navController: NavController) {
    TopAppBar(title = {
        Text(text = puppyItem.name)
    },
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    painter = painterResource(R.drawable.abc_ic_ab_back_material),
                    contentDescription = stringResource(R.string.content_description_back_icon)
                )
            }
        })
}

@Composable
private fun PuppyDetailsScreenContent(puppyItem: PuppyItem) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        PuppyDetailsHeaderSection(puppyItem = puppyItem)

        PuppyDetailsContentSection(puppyItem = puppyItem)

        PuppyDetailsContactSection(puppyItem = puppyItem)
    }
}

@Composable
private fun PuppyDetailsContactSection(puppyItem: PuppyItem) {
    Spacer(Modifier.height(24.dp))
    Button(
        onClick = {  },
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Adopt ${puppyItem.name}")
    }
    Spacer(Modifier.height(16.dp))
}

@Composable
private fun PuppyDetailsHeaderSection(puppyItem: PuppyItem) {
    val imageModifier = Modifier
        .heightIn(min = 180.dp)
        .fillMaxWidth()
        .clip(shape = MaterialTheme.shapes.medium)
    Image(
        painter = painterResource(puppyItem.imageId),
        contentDescription = null, // decorative
        modifier = imageModifier,
        contentScale = ContentScale.Crop
    )
    Text(text = puppyItem.name, textAlign = TextAlign.Center, modifier = Modifier.fillMaxWidth())
}

@Composable
private fun PuppyDetailsContentSection(puppyItem: PuppyItem) {
    Spacer(Modifier.height(24.dp))
    Row {
        Text(text = "Dog Breed Group: ", fontWeight = FontWeight.Bold)
        Text(text = puppyItem.group)
    }
    Spacer(Modifier.height(8.dp))

    Row {
        Text(text = "Height: ", fontWeight = FontWeight.Bold)
        Text(text = puppyItem.height)
    }
    Spacer(Modifier.height(8.dp))
    Row {
        Text(text = "Weight: ", fontWeight = FontWeight.Bold)
        Text(text = puppyItem.weight)
    }
    Spacer(Modifier.height(8.dp))
    Row {
        Text(text = "Life Span: ", fontWeight = FontWeight.Bold)
        Text(text = puppyItem.lifeSpan)
    }
    Spacer(Modifier.height(16.dp))
    Text(
        text = "Description: ",
        style = MaterialTheme.typography.h6
    )
    Text(text = puppyItem.description)
}
