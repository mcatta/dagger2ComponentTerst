package eu.marcocattaneo.testdagger.main.di

import dagger.Subcomponent
import dagger.android.AndroidInjector
import eu.marcocattaneo.testdagger.main.MainActivity

@MainModule.MainScope
@Subcomponent
interface MainSubComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

}