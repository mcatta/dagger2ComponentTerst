package eu.marcocattaneo.testdagger.detail.di

import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import eu.marcocattaneo.testdagger.detail.DetailActivity
import javax.inject.Scope

@Module(subcomponents = [DetailSubComponent::class])
abstract class DetailModule {

    @Binds
    @IntoMap
    @ClassKey(DetailActivity::class)
    internal abstract fun bindYourActivityInjectorFactory(builder: DetailSubComponent.Builder): AndroidInjector.Factory<*>

    @ContributesAndroidInjector(modules = [DetailActivityModule::class])
    @DetailScope
    internal abstract fun contributeMainActivity(): DetailActivity

    @Scope
    annotation class DetailScope

}