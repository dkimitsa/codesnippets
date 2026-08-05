package com.example.composedemo

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.*
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import demo.shared.generated.resources.Res
import demo.shared.generated.resources.compose_multiplatform
import demo.shared.generated.resources.mobivmlogo
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview
fun DemoWidget() {
    MaterialTheme {
        var showContent by remember { mutableStateOf(false) }
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { showContent = !showContent }) {
                Text("Click me!")
            }
            Spacer(modifier = Modifier.height(16.dp))
            AnimatedVisibility(showContent, enter = fadeIn(), exit = fadeOut()) {
                LazyColumn(Modifier.fillMaxWidth().weight(1f), horizontalAlignment = Alignment.CenterHorizontally) {
                    item { Text("Compose: hello from RoboVM!") }
                    item { Image(painterResource(Res.drawable.mobivmlogo), null) }
                    item { Text(text = "+", fontSize = 100.sp, color = Color.Red , modifier = Modifier.rotatePermanently()) }
                    item { Image( painterResource(Res.drawable.compose_multiplatform), null) }
                    items(10) { idx -> Text("...", fontSize = 30.sp) }
                    item { Text("End of the list.") }
                }
            }
        }
    }
}

fun Modifier.rotatePermanently(durationMillis: Int = 20000): Modifier = composed {
    val infiniteTransition = rememberInfiniteTransition()
    val rotation by infiniteTransition.animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ),
    )

    this.graphicsLayer { rotationZ = rotation }
}