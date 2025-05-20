package com.manishprp.cred_mock_ui.presentation.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import com.manishprp.cred_mock_ui.ui.theme.borderColor
import com.manishprp.cred_mock_ui.ui.theme.offWhiteColor

@Composable
fun IconWithBorder(modifier: Modifier = Modifier, imageVector: ImageVector, contentDescription:String, size: Double){
    Icon(
        modifier = modifier
            .size(size.dp).clip(shape = RoundedCornerShape(size = (size/2).dp,),).border(
                shape = RoundedCornerShape(size = (size/2).dp,),
        border = BorderStroke(width = 1.dp, color = borderColor)
    ).padding(5.dp),
        imageVector = imageVector,
        contentDescription = contentDescription,
        tint =offWhiteColor
    )
}