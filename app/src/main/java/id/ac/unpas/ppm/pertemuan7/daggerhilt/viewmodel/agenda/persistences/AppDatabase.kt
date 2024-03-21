package id.ac.unpas.ppm.pertemuan7.daggerhilt.viewmodel.agenda.persistences

import androidx.room.Database
import androidx.room.RoomDatabase
import id.ac.unpas.ppm.pertemuan7.daggerhilt.viewmodel.agenda.models.Todo

// Allfiandi Rahman
// 213040052
// Praktikum Pemrograman Mobile [Kelas A]
// Pertemuan 7 = Dagger Hilt & ViewModel
// 22 Maret 2024

@Database(entities = [Todo::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {
    abstract fun todoDao(): TodoDao

    companion object {
        const val DATABASE_NAME = "agenda-database"
    }
}