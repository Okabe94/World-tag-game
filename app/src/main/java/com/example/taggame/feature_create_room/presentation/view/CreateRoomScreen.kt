package com.example.taggame.feature_create_room.presentation.view

import android.widget.Toast
import androidx.compose.animation.core.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun CreateRoomScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            val infiniteTransition = rememberInfiniteTransition()
            val rotationAnimation = infiniteTransition.animateFloat(
                initialValue = 0f,
                targetValue = 180f,
                animationSpec = infiniteRepeatable(tween(4000))
            )
            Image(
                modifier = Modifier.size(36.dp).rotate(rotationAnimation.value),
                imageVector = Icons.Default.Settings,
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color.Gray)
            )
        }
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "World Tag Game", style = MaterialTheme.typography.h4)
            Spacer(modifier = Modifier.height(100.dp))
            Button(
                onClick = { Toast.makeText(context, "Creating", Toast.LENGTH_SHORT).show() }
            ) {
                Text(text = "Create a room")
            }

            Button(
                onClick = { Toast.makeText(context, "Joining", Toast.LENGTH_SHORT).show() }
            ) {
                Text(text = "Join a room")
            }
        }
    }
}

@Composable
fun CreateRoomScreen(a: String) {

}
