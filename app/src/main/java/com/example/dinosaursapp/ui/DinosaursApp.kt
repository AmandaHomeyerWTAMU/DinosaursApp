@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.dinosaursapp.ui

import android.text.Layout.Alignment
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dinosaursapp.R


@Composable
fun DinosaursApp() {
    Scaffold(
        topBar = { DinosaursTopAppBar()}
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            val dinosaursViewModel: DinosaursViewModel = viewModel()
            HomeScreen(
                dinosaurUiState = dinosaursViewModel.dinosaursUiState,
                retryAction = dinosaursViewModel::getDinosaurPhotos
                )

        }
    }
}

@Composable
fun DinosaursTopAppBar(modifier: Modifier = Modifier) {
    TopAppBar(
        title = {
            Text(
                text = stringResource(R.string.app_name),
                style = MaterialTheme.typography.headlineSmall,
            )
        },
        modifier = modifier
    )
}