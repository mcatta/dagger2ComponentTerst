package eu.marcocattaneo.testdagger.detail.di

import dagger.Subcomponent
import dagger.android.AndroidInjector
import eu.marcocattaneo.testdagger.detail.DetailActivity

@DetailModule.DetailScope
@Subcomponent
interface DetailSubComponent : AndroidInjector<DetailActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<DetailActivity>()

}