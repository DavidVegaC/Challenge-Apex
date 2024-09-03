package com.davega.data.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.davega.data.room.dao.RecipeDao
import com.davega.data.room.entity.RecipeEntity

@Database(
    version = 1,
    entities = [RecipeEntity::class]
)
abstract class ApexDataBase : RoomDatabase() {

    abstract fun recipeDao(): RecipeDao
}
