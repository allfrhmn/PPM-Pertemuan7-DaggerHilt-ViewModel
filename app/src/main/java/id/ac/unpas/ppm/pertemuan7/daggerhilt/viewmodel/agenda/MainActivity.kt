package id.ac.unpas.ppm.pertemuan7.daggerhilt.viewmodel.agenda

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import id.ac.unpas.ppm.pertemuan7.daggerhilt.viewmodel.agenda.ui.screens.TodoScreen
import id.ac.unpas.ppm.pertemuan7.daggerhilt.viewmodel.agenda.ui.theme.AgendaKeduaTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AgendaKeduaTheme {
                // A surface container using the 'background' color from the theme
                TodoScreen()
            }
        }
    }
}