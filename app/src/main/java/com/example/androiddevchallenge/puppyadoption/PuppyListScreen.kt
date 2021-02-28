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
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Divider
import androidx.compose.material.LocalContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.R

@Composable
fun PuppyListScreen(navController: NavController) {
    Scaffold(
        topBar = { PuppyListScreenAppBar() },
        content = {
            PuppyListContent(navController = navController)
        }
    )
}

@Composable
private fun PuppyListScreenAppBar() {
    TopAppBar(
        title = {
            Text(text = stringResource(R.string.title_puppy_list))
        }
    )
}

@Composable
private fun PuppyListContent(navController: NavController) {
    LazyColumn(
        content = {
            val puppyList = PuppyAdoptionRepository.loadDummyPuppyList()
            items(puppyList) { puppyItem ->
                PuppyListItem(puppyItem = puppyItem, navController = navController)
                PuppyDivider()
            }
        }
    )
}

// puppy row item composable
@Composable
private fun PuppyListItem(puppyItem: PuppyItem, navController: NavController) {
    Row(
        modifier = Modifier
            .clickable(onClick = { navController.navigate("puppy_details/${puppyItem.id}") })
            .padding(16.dp)
    ) {
        PuppyListItemImage(puppyItem = puppyItem)
        PuppyListItemContent(
            puppyItem = puppyItem,
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
    }
}

@Composable
private fun PuppyListItemImage(puppyItem: PuppyItem) {
    Image(
        painter = painterResource(puppyItem.imageId),
        contentDescription = puppyItem.name,
        modifier = Modifier
            .size(50.dp, 50.dp)
            .clip(MaterialTheme.shapes.small)
    )
}

@Composable
private fun PuppyListItemContent(puppyItem: PuppyItem, modifier: Modifier) {
    Column(
        modifier = modifier
            .padding(start = 8.dp)
    ) {
        Text(puppyItem.name, fontWeight = FontWeight.Bold, style = MaterialTheme.typography.h6)
        CompositionLocalProvider(LocalContentAlpha provides ContentAlpha.medium) {
            Text("${puppyItem.group} | ${puppyItem.lifeSpan}", style = MaterialTheme.typography.body2)
        }
    }
}

@Composable
private fun PuppyDivider() {
    Divider(
        modifier = Modifier.padding(start = 16.dp)
    )
}
