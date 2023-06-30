package net.simplifiedcoding.ui.rating1

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import net.simplifiedcoding.R
import net.simplifiedcoding.navigation.ROUTE_HOME
import net.simplifiedcoding.navigation.ROUTE_HOMEXSCREEN
import net.simplifiedcoding.navigation.ROUTE_LOGIN
import net.simplifiedcoding.navigation.ROUTE_MESSAGESSCREEN
import net.simplifiedcoding.navigation.ROUTE_SIGNUP2SCREEN
import net.simplifiedcoding.ui.auth.AuthViewModel
import net.simplifiedcoding.ui.theme.spacing

@Preview
@Composable
fun RatingScreen() {
    val spacing = MaterialTheme.spacing






    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.yellow),
                contentScale = ContentScale.FillBounds
            )
        ,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

Text(text = "RATE THE COMPANY", modifier = Modifier.size(15.dp))


                Button(
                    onClick = {
                       // viewModel?.logout()
                       // navController.navigate(ROUTE_LOGIN) {
                           // popUpTo(ROUTE_HOME) { inclusive = true }
                     //   }
                    },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = spacing.extraLarge)
                ) {
                    Text(text = stringResource(id = R.string.logout))
                }


            }
        }
