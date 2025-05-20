package com.manishprp.cred_mock_ui.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manishprp.cred_mock_ui.ui.theme.borderColor
import com.manishprp.cred_mock_ui.ui.theme.color7b7a7b
import com.manishprp.cred_mock_ui.ui.theme.colore1e1e0
import com.manishprp.cred_mock_ui.ui.theme.lightmedWhite

@Composable
fun SingleLineTitleDescWithSeparator(modifier: Modifier = Modifier,
                                     titleText:String,
                                     subtitleText:String,
                                     icon: ImageVector,
                                     iconDescription:String,
                                     gap:Int = 15,
                                     iconSize: Dp = 24.dp,
                                     isSeparatorVisible:Boolean = true) {
    Column(modifier = modifier) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    titleText, color = colore1e1e0, fontSize = 12.sp,
                    style = TextStyle(platformStyle = PlatformTextStyle(includeFontPadding = false))
                )
                Text(subtitleText, color = color7b7a7b, fontSize = 10.sp)
            }
            Icon(
                modifier = Modifier
                    .size(iconSize),
                imageVector =icon,
                contentDescription = iconDescription,
                tint = lightmedWhite
            )
        }
       if(isSeparatorVisible) Gap(size = gap)
        // separation line
       if(isSeparatorVisible) Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(color = borderColor))
    }
}