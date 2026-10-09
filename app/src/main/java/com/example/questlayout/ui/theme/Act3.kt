package com.example.questlayout.ui.theme

import androidx.compose.ui.Modifier


@Composable
fun ActivitasPertama(modifier: Modifier) {
    Column(
        modifier = Modifier
            .padding(top = 100.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            stringResource(id = R.string.univ),
            fontSize = 22.sp
        )
    }
}