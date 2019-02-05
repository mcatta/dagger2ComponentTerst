package eu.marcocattaneo.testdagger.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import eu.marcocattaneo.testdagger.MyApplication
import eu.marcocattaneo.testdagger.detail.di.DetailModule
import eu.marcocattaneo.testdagger.main.di.MainModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    StoreModule:: class,
    TestModule::class,
    MainModule::class,
    DetailModule::class
])
interface ApplicationComponent {

    fun inject(myApplication: MyApplication)

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun storeModule(storeModule: StoreModule): ApplicationComponent.Builder

        @BindsInstance
        fun application(application: Application): ApplicationComponent.Builder

        fun build(): ApplicationComponent
    }

}