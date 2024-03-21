package id.ac.unpas.ppm.pertemuan7.daggerhilt.viewmodel.agenda.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 7 = Dagger Hilt & ViewModel
// 22 Maret 2024

@Composable
fun TodoScreen() {

    Column(modifier = Modifier.padding(10.dp).fillMaxWidth()) {
        FormTodoScreen()
        ListTodoScreen()
    }
}