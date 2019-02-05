package eu.marcocattaneo.testdagger.main.di

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import eu.marcocattaneo.testdagger.main.MainActivity
import javax.inject.Scope

@Module(subcomponents = [MainSubComponent::class])
abstract class MainModule {

    @Binds
    @IntoMap
    @ClassKey(MainActivity::class)
    internal abstract fun bindYourActivityInjectorFactory(builder: MainSubComponent.Builder): AndroidInjector.Factory<*>

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    @MainScope
    internal abstract fun contributeMainActivity(): MainActivity

    @Scope
    annotation class MainScope
}