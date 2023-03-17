package com.example.sudoku.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.sudoku.R
import com.example.sudoku.ui.mainTitle

@Composable
fun LoadingScreen(){
     Surface(
         color = MaterialTheme.colors.primary,
         modifier = Modifier
             .fillMaxWidth()
             .fillMaxHeight(0.8f)
     ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(painter = painterResource(id=R.drawable.ic_launcher_foreground),
                modifier = Modifier.size(128.dp),
                contentDescription = stringResource(id = R.string.logo_description)
            )
            LinearProgressIndicator(
                color = Color.Gray,
                modifier = Modifier
                    .width(128.dp)
                    .padding(16.dp)
            )
            Text(text = stringResource(id = R.string.loading),
                style = mainTitle.copy(color=MaterialTheme.colors.secondary),
                modifier = Modifier.wrapContentSize()
            )
        }
     }
}