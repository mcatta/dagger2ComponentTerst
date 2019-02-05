package eu.marcocattaneo.testdagger.main.di

import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import eu.marcocattaneo.testdagger.main.MainActivityPresenter

@Module
abstract class MainActivityModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivityPresenter::class)
    @MainModule.MainScope
    abstract fun mainActivityPresenter(mainActivityPresenter: MainActivityPresenter) : MainActivityPresenter

}