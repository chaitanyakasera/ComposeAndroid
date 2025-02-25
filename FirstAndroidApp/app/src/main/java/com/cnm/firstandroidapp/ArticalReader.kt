package com.cnm.firstandroidapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.cnm.firstandroidapp.ui.theme.FirstAndroidAppTheme


@Composable
fun ArticleScreen(
    image: Int = R.drawable.bg_compose_background,
    title: String,
    description1: String,
    description2: String,
    modifier: Modifier
) {
    Column(modifier = modifier) {
        val banner = painterResource(image)
        Image(painter = banner, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = modifier.padding(16.dp)
        )
        Text(
            text = description1,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(horizontal = 16.dp)
        )
        Text(
            text = description2,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = modifier.padding(16.dp)
        )

    }
}

@Composable
@Preview
fun showArtical() {
    FirstAndroidAppTheme {
        ArticleScreen(
            title = stringResource(R.string.jetpack_compose_tutorial),
            description1 = stringResource(R.string.desc1),
            description2 = stringResource(R.string.desc2),
            modifier = Modifier.fillMaxSize()
        )
    }
}