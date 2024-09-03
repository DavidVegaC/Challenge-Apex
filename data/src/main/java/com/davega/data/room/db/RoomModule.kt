package com.davega.data.room.db

import android.content.Context
import androidx.room.Room
import com.davega.data.room.dao.RecipeDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {
    private const val DATABASE_NAME = "Apex.db"

    @Singleton
    @Provides
    fun provideApexDataBase(@ApplicationContext context: Context): ApexDataBase {
        return Room.databaseBuilder(
            context = context,
            klass = ApexDataBase::class.java,
            name = DATABASE_NAME
        ).build()
    }

    @Singleton
    @Provides
    fun provideRecipeDao(db: ApexDataBase): RecipeDao = db.recipeDao()
}
