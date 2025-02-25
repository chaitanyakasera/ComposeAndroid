package com.cnm.firstandroidapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.cnm.firstandroidapp.ui.theme.FirstAndroidAppTheme

@Composable
fun TaskManager(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.ic_task_completed)
    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = image, contentDescription = null,
        )
        Text(
            text = "All tasks completed",
        )
        Text(
            text = "Nice work!",
        )
    }
}

@Preview
@Composable
fun showTaskMananger() {
    FirstAndroidAppTheme {
        TaskManager(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        )

    }
}