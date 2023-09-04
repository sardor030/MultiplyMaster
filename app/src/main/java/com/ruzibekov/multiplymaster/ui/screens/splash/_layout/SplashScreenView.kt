package com.ruzibekov.multiplymaster.ui.screens.splash._layout

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.ruzibekov.multiplymaster.R

object SplashScreenView {

    @Composable
    fun Default(){

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Image(
                painter = painterResource(id = R.drawable.image_splash),
                contentDescription = "app logo")
        }
    }
}