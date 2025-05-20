package com.manishprp.cred_mock_ui.presentation.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Gap(size: Int, isVertical: Boolean = true) {
    if(isVertical)
        Spacer(modifier = Modifier.height(size.dp))
    else
        Spacer(modifier = Modifier.width(size.dp))
}