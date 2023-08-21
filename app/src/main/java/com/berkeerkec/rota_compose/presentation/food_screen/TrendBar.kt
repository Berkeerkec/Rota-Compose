package com.berkeerkec.rota_compose.presentation.food_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.berkeerkec.rota_compose.R
import com.berkeerkec.rota_compose.presentation.ui.theme.Poppins

@Composable
fun TrendBar(){
    Row {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {

            Row(
                modifier = Modifier
                    .padding(vertical = 5.dp, horizontal = 15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Row{
                    Text(
                        text = "Trending now",
                        fontSize = 22.sp,
                        fontFamily = Poppins,
                        fontWeight = FontWeight.SemiBold
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.ic_fire),
                        contentDescription = "",
                        modifier = Modifier
                            .size(24.dp, 24.dp)
                            .padding(top = 4.dp)
                    )
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = "See all",
                        fontSize = 16.sp,
                        color = Color(0xFFE23E3E),
                        fontFamily = Poppins,
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(modifier = Modifier.width(5.dp))

                    Image(
                        imageVector = ImageVector.vectorResource(R.drawable.ic_arrow_right),
                        contentDescription = "See all",
                        modifier= Modifier
                            .size(22.dp)
                            .padding(top = 2.dp)
                    )
                }

            }

            val horizontalScroll = rememberScrollState()

            Row(
                modifier = Modifier
                    .horizontalScroll(horizontalScroll)
            ) {
                TrendRow()
                TrendRow()
                TrendRow()
                TrendRow()
                TrendRow()
            }
        }
    }
}

@Composable
fun TrendRow(){

    Column {

        Box(){
            Card(
                colors = CardDefaults.cardColors(Color.White),
                shape = RoundedCornerShape(12.dp),
                modifier = Modifier
                    .height(220.dp)
                    .width(300.dp)
                    .padding(start = 15.dp, top = 5.dp, bottom = 5.dp)
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                ) {
                    Image(
                        bitmap = ImageBitmap.imageResource(R.drawable.restaurant_food),
                        contentDescription = "",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxSize()
                    )

                    Row(
                        modifier = Modifier
                            .padding(horizontal = 10.dp, vertical = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Column {
                            Box(
                                modifier = Modifier,
                                contentAlignment = Alignment.Center
                            ) {

                                Image(
                                    painter = ColorPainter(color = Color(0xFFC0BEBE)),
                                    contentDescription = "Rating",
                                    modifier = Modifier
                                        .size(80.dp, 35.dp)
                                        .clip(RoundedCornerShape(12.dp))
                                        .blur(10.dp,10.dp)
                                )
                                Row {
                                    Image(
                                        imageVector = ImageVector.vectorResource(R.drawable.ic_star),
                                        contentDescription = "Rating",
                                        modifier = Modifier.size(20.dp)
                                    )
                                    Spacer(modifier = Modifier.width(10.dp))
                                    Text(
                                        text = "4,5",
                                        fontFamily = Poppins,
                                        fontWeight = FontWeight.Medium,
                                        color = Color.White,
                                        fontSize = 14.sp
                                    )
                                }
                            }
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End
                        ) {

                            FloatingActionButton(
                                onClick = { /*TODO*/ },
                                modifier = Modifier
                                    .size(40.dp),
                                shape = CircleShape,
                                containerColor = Color.White
                            ) {
                                Image(
                                    imageVector = ImageVector.vectorResource(R.drawable.ic_favourite),
                                    contentDescription = "Favourite"
                                )
                            }
                        }
                    }

                }
            }
        }

        TitleUserScreen()
    }
}

@Composable
fun TitleUserScreen(){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 15.dp, top = 5.dp, bottom = 5.dp)
            .width(300.dp)
    ) {

        Text(
            text = "Mekanda yiyebileceğiniz en iyi şey olabilir",
            fontFamily = Poppins,
            fontWeight = FontWeight.SemiBold,
            overflow = TextOverflow.Ellipsis,
            maxLines = 1
        )

        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                bitmap = ImageBitmap.imageResource(R.drawable.profile_photo),
                contentDescription = "Profile Photo",
                modifier = Modifier
                    .size(35.dp, 35.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.width(10.dp))

            Text(
                text = "By Niki Samantha",
                fontFamily = Poppins,
                fontWeight = FontWeight.Medium,
                color = Color(0xFFA9A9A9),
                fontSize = 13.sp
            )
        }
    }
}


@Composable
@Preview
fun TrendBarPreview(){
    TrendBar()
}