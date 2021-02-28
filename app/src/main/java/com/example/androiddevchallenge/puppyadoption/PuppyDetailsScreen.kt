/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.puppyadoption

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
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
            }
        )
    }
}

@Composable
private fun PuppyDetailsScreenAppBar(puppyItem: PuppyItem, navController: NavController) {
    TopAppBar(
        title = {
            Text(text = puppyItem.name)
        },
        navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    painter = painterResource(R.drawable.abc_ic_ab_back_material),
                    contentDescription = stringResource(R.string.content_description_back_icon)
                )
            }
        }
    )
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
        onClick = { },
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
