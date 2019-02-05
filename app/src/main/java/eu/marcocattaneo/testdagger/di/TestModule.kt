package eu.marcocattaneo.testdagger.di

import dagger.Module
import dagger.Provides

@Module
class TestModule {

    @Provides
    fun providePair() = Pair<String, String>("a", "b")

}