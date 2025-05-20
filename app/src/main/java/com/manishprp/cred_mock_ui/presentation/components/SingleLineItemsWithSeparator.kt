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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manishprp.cred_mock_ui.ui.theme.borderColor
import com.manishprp.cred_mock_ui.ui.theme.colore2e2e3
import com.manishprp.cred_mock_ui.ui.theme.greenish
import com.manishprp.cred_mock_ui.ui.theme.lightmedWhite

@Composable
fun SingleLineItemsWithSeparator(modifier: Modifier = Modifier,
                                 leftText:String,
                                 greenText:String?=null,
                                 rightText: String,
                                 leftIconImageVector: ImageVector,
                                 rightIconImageVector: ImageVector,
                                 isGreenTextVisible:Boolean = false,
                                 isSeparatorVisible:Boolean = true
                                ) {
    Column(modifier = modifier) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconWithBorder(
                    imageVector = leftIconImageVector,
                    contentDescription =leftText,
                    size = 23.0
                )
                Gap(size = 5, isVertical = false)
                Text("$leftText ", fontSize = 12.sp, color = lightmedWhite)
                if(isGreenTextVisible) Text("•", fontSize = 12.sp, color = greenish)
                if(isGreenTextVisible) Text(" $greenText", fontSize = 12.sp, color = greenish)
            }
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(rightText, fontSize = 12.sp, color = colore2e2e3)
                Gap(size = 5, isVertical = false)
                Icon(
                    modifier = Modifier
                        .size(24.dp),
                    imageVector = rightIconImageVector,
                    contentDescription = rightText,
                    tint = lightmedWhite
                )
            }
        }
        if(isSeparatorVisible)Gap(size = 15)
        // separation line
        if(isSeparatorVisible)Box(modifier = Modifier.fillMaxWidth().height(1.dp).background(color = borderColor))
    }
}