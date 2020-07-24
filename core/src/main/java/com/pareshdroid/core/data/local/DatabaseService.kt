package com.pareshdroid.core.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import com.pareshdroid.core.data.local.dao.DummyDao
import com.pareshdroid.core.data.local.entity.DummyEntity
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
@Database(
    entities = [
        DummyEntity::class
    ],
    exportSchema = false,
    version = 1
)
abstract class DatabaseService : RoomDatabase() {

    abstract fun dummyDao(): DummyDao
}