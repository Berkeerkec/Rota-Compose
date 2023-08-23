package com.berkeerkec.rota_compose.presentation.detail_screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import com.berkeerkec.rota_compose.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StatusBarDetail(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Scaffold(
            topBar = { DetailAppBar()},
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Column(modifier = Modifier.padding(it)) {

            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailAppBar(){
    TopAppBar(
        title = {
            Text(text = "")
        },
        navigationIcon = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_left_arrow),
                    contentDescription = "Back"
                )
            }
        },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_bookmark),
                    contentDescription = "Save"
                )
            }
        }
    )
}

@Preview
@Composable
fun StatusBarDetailPreview(){
    StatusBarDetail()
}