package com.berkeerkec.rota_compose.presentation.food_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.berkeerkec.rota_compose.R
import com.berkeerkec.rota_compose.presentation.ui.theme.Poppins

@Composable
fun StatusBar(){
    Box {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .padding(horizontal = 15.dp, vertical = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Find the best food",
                fontFamily = Poppins,
                fontWeight = FontWeight.SemiBold,
                fontSize = 26.sp
            )

            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = Color(0xFFD6D3D3),
                modifier = Modifier
                    .size(40.dp)
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.ic_filter),
                    contentDescription = "Filter",
                    modifier = Modifier
                        .size(18.dp))
            }

        }
    }
}

@Preview
@Composable
fun StatusBarPreview(){
    StatusBar()
}