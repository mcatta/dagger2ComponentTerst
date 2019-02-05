package eu.marcocattaneo.testdagger.di

import android.app.Application
import android.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class StoreModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(application: Application) = PreferenceManager.getDefaultSharedPreferences(application.applicationContext)

}