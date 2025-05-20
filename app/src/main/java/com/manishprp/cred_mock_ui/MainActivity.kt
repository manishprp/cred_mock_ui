package com.manishprp.cred_mock_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.manishprp.cred_mock_ui.core.constants.allTransactions
import com.manishprp.cred_mock_ui.core.constants.bankBalance
import com.manishprp.cred_mock_ui.core.constants.cashbackBalance
import com.manishprp.cred_mock_ui.core.constants.check
import com.manishprp.cred_mock_ui.core.constants.coins
import com.manishprp.cred_mock_ui.core.constants.credGarage
import com.manishprp.cred_mock_ui.core.constants.creditScore
import com.manishprp.cred_mock_ui.core.constants.editIcon
import com.manishprp.cred_mock_ui.core.constants.lifetimeCashback
import com.manishprp.cred_mock_ui.core.constants.memberSince
import com.manishprp.cred_mock_ui.core.constants.refreshAvailable
import com.manishprp.cred_mock_ui.core.constants.getToKnowYourVehicle
import com.manishprp.cred_mock_ui.core.constants.transactionsAndSupport
import com.manishprp.cred_mock_ui.core.constants.username
import com.manishprp.cred_mock_ui.core.constants.vehicleIcon
import com.manishprp.cred_mock_ui.core.constants.winUpto1000
import com.manishprp.cred_mock_ui.core.constants.yourRewardsAnd
import com.manishprp.cred_mock_ui.presentation.components.Gap
import com.manishprp.cred_mock_ui.presentation.components.IconWithBorder
import com.manishprp.cred_mock_ui.presentation.components.RoundProfile
import com.manishprp.cred_mock_ui.presentation.components.SingleLineItemsWithSeparator
import com.manishprp.cred_mock_ui.presentation.components.SingleLineTitleDescWithSeparator
import com.manishprp.cred_mock_ui.ui.theme.Cred_mock_uiTheme
import com.manishprp.cred_mock_ui.ui.theme.borderColor
import com.manishprp.cred_mock_ui.ui.theme.color525352
import com.manishprp.cred_mock_ui.ui.theme.colore1e1e0
import com.manishprp.cred_mock_ui.ui.theme.darkishhlack
import com.manishprp.cred_mock_ui.ui.theme.greyishColor
import com.manishprp.cred_mock_ui.ui.theme.lightTextColor
import com.manishprp.cred_mock_ui.ui.theme.lightishBlack
import com.manishprp.cred_mock_ui.ui.theme.lightmedWhite
import com.manishprp.cred_mock_ui.ui.theme.mediumishlack
import com.manishprp.cred_mock_ui.ui.theme.offWhiteColor

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Cred_mock_uiTheme {
                Scaffold(modifier = Modifier.fillMaxSize(),
                    topBar ={
                        TopAppBar(
                        title = {Text("Profile", fontSize = 16.sp)},
                        navigationIcon = {    Icon(
                            modifier = Modifier
                                .size(24.dp),
                            imageVector =ImageVector.vectorResource(R.drawable.back_icon),
                            contentDescription = "Navigate to",
                            tint = lightmedWhite
                        )},
                        actions = {Row(modifier = Modifier.border(
                            shape = RoundedCornerShape(size = 30.dp,),
                            border = BorderStroke(width = 1.dp, color = borderColor)
                        ).padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
                            Icon(
                                modifier = Modifier
                                    .size(24.dp),
                                imageVector =ImageVector.vectorResource(R.drawable.support),
                                contentDescription = "Navigate to",
                                tint = lightmedWhite
                            )
                            Gap(size = 5, isVertical = false)
                            Text("Support", fontSize = 14.sp)
                        }},
                        colors = TopAppBarDefaults.topAppBarColors().copy(
                            containerColor = lightishBlack
                        ),
                    )}
                ) { innerPadding ->
                    ProfileScreen(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun ProfileScreen( modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.verticalScroll(state = rememberScrollState()).background(color = darkishhlack)) {
        Column(modifier = Modifier
            .background(color = lightishBlack)
            .padding(20.dp)) {
            // Profile Row
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RoundProfile(
                        imageVector = ImageVector.vectorResource(R.drawable.ic_launcher_background),
                        size = 60.0
                    )
                    Gap(
                        size = 10, isVertical = false
                    )
                    Column {
                        Text(username, color = offWhiteColor, fontSize = 16.sp)
                        Text(memberSince, color = greyishColor, fontSize = 12.sp)
                    }
                }
                Gap(size = 20, isVertical = false)
                IconWithBorder(
                    imageVector = ImageVector.vectorResource(R.drawable.edit_24),
                    contentDescription = editIcon,
                    size = 30.0
                )
            }
            //Cred Garage
            Gap(size = 20)
            Row(
                verticalAlignment = Alignment.CenterVertically, modifier = Modifier
                    .fillMaxWidth()
                    .background(color = mediumishlack)
                    .border(
                        shape = RectangleShape,
                        border = BorderStroke(width = 1.dp, color = borderColor)
                    )
                    .padding(16.dp)
            ) {
                IconWithBorder(
                    imageVector = ImageVector.vectorResource(R.drawable.vehicle_24),
                    contentDescription = vehicleIcon,
                    size = 30.0
                )
                Gap(size = 16, isVertical = false)
                Column {
                    Text(getToKnowYourVehicle, color = offWhiteColor, fontSize = 12.sp)
                    Row {
                        Text(credGarage, color = lightTextColor, fontSize = 16.sp)
                        Icon(
                            modifier = Modifier
                                .size(30.dp),
                            imageVector = ImageVector.vectorResource(R.drawable.right_24),
                            contentDescription = "Edit icon",
                            tint = lightTextColor
                        )
                    }
                }
            }
            // cashback, balance and all ui
            Spacer(modifier = Modifier.height(40.dp))
            SingleLineItemsWithSeparator(
                leftText = creditScore,
                greenText = refreshAvailable,
                rightText = "757",
                leftIconImageVector = ImageVector.vectorResource(R.drawable.baseline_credit_score_24),
                rightIconImageVector = ImageVector.vectorResource(R.drawable.right_24),
                isGreenTextVisible = true
            )
            Gap(size = 15)
            SingleLineItemsWithSeparator(
                leftText = lifetimeCashback,
                rightText = "$3",
                leftIconImageVector = ImageVector.vectorResource(R.drawable.money_24),
                rightIconImageVector = ImageVector.vectorResource(R.drawable.right_24),
            )
            Gap(size = 15)
            SingleLineItemsWithSeparator(
                leftText = bankBalance,
                rightText = check,
                isSeparatorVisible = false,
                leftIconImageVector = ImageVector.vectorResource(R.drawable.money_100_24),
                rightIconImageVector = ImageVector.vectorResource(R.drawable.right_24),
            )
           Gap(size = 15)

        }
        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp,).background(color = darkishhlack)) {
            Gap(size = 15)
            Text(yourRewardsAnd, color = color525352, fontSize = 14.sp)
            Gap(size = 20)
            SingleLineTitleDescWithSeparator(
                titleText = cashbackBalance,
                subtitleText = "$0",
                icon =ImageVector.vectorResource(R.drawable.baseline_arrow_forward_ios_24),
                iconDescription = "Navigate To",
            )
            Gap(size = 20)
            SingleLineTitleDescWithSeparator(
                titleText = coins,
                subtitleText = "26,46,583",
                icon =ImageVector.vectorResource(R.drawable.baseline_arrow_forward_ios_24),
                iconDescription = "Navigate To",
            )
            Gap(size = 20)
            SingleLineTitleDescWithSeparator(
                titleText = winUpto1000,
                subtitleText = "refer and earn",
                isSeparatorVisible = false,
                icon =ImageVector.vectorResource(R.drawable.baseline_arrow_forward_ios_24),
                iconDescription = "Navigate To",
            )
            Gap(size = 40)
            Text(transactionsAndSupport, color = color525352, fontSize = 14.sp)
            Gap(size = 20)
           Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween,
               verticalAlignment = Alignment.CenterVertically) {
               Text(
                   allTransactions, color = colore1e1e0, fontSize = 12.sp,
               )
               Icon(
                   modifier = Modifier
                       .size(24.dp),
                   imageVector =ImageVector.vectorResource(R.drawable.baseline_arrow_forward_ios_24),
                   contentDescription = "Navigate to",
                   tint = lightmedWhite
               )
           }

        }
    }
}

@Preview(showBackground = true)
@PreviewLightDark
@Composable
fun GreetingPreview() {
    Cred_mock_uiTheme {
        ProfileScreen()
    }
}