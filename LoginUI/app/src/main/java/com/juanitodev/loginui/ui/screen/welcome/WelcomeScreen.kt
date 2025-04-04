package com.juanitodev.loginui.ui.screen.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.juanitodev.loginui.R
import com.juanitodev.loginui.ui.components.ActionButton
import com.juanitodev.loginui.ui.theme.DarkTextColor
import com.juanitodev.loginui.ui.theme.PrimaryPinkBlended
import com.juanitodev.loginui.ui.theme.PrimaryYellow
import com.juanitodev.loginui.ui.theme.PrimaryYellowDark
import com.juanitodev.loginui.ui.theme.PrimaryYellowLight

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onOpenLoginClicked: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryPinkBlended,
                    0.6f to PrimaryYellowLight,
                    1f to PrimaryYellow
                )
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.senati_logo),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(top = 32.dp)
        )
        Spacer(
            modifier = Modifier.height(24.dp)
        )
        Text(
            text = "Siempre unidos!",
            style = MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Black,
            modifier = Modifier.padding(horizontal = 24.dp),
            color = DarkTextColor
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = "App para la institucion usando Kotlin, Jetpack Compose y Material3.",
            modifier = Modifier.padding(horizontal = 24.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = DarkTextColor
        )
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        ActionButton(
            text = "INICIAR",
            isNavigationArrowVisible = true,
            onClicked = onOpenLoginClicked,
            colors = ButtonDefaults.buttonColors(
                containerColor = PrimaryYellowDark,
                contentColor = DarkTextColor
            ),
            shadowColor = PrimaryYellowDark,
            modifier = Modifier.padding(24.dp)
        )
    }
}