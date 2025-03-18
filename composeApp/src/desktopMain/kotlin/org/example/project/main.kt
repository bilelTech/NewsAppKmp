package org.example.project

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.example.project.appcore.presentation.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "NewsAppKmp",
    ) {
        App()
    }
}