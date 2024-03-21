package id.ac.unpas.ppm.pertemuan7.daggerhilt.viewmodel.agenda.models

import androidx.room.Entity
import androidx.room.PrimaryKey

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 7 = Dagger Hilt & ViewModel
// 22 Maret 2024

@Entity
data class Todo(
    @PrimaryKey
    val id: String,
    val title: String,
    val description: String,
    val dueDate: String
)
