package com.manishprp.cred_mock_ui.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun RoundProfile(modifier: Modifier = Modifier, imageVector: ImageVector, size: Double) {
    Image(
        imageVector = imageVector,
        contentDescription = "profile_image",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .size(size.dp)
            .clip(
                shape = RoundedCornerShape(size = (size/2).dp)
            )
    )
}