package eu.marcocattaneo.testdagger

import android.app.Activity
import android.app.Application
import dagger.android.HasActivityInjector
import dagger.android.DispatchingAndroidInjector
import eu.marcocattaneo.testdagger.di.DaggerApplicationComponent
import eu.marcocattaneo.testdagger.di.StoreModule
import javax.inject.Inject



class MyApplication: Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()
        DaggerApplicationComponent.builder()
            .application(this)
            .storeModule(StoreModule())
            .build()
            .inject(this)
    }

    override fun activityInjector() = this.dispatchingActivityInjector
}