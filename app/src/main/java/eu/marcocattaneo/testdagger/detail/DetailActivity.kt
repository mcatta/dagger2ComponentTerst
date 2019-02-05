package eu.marcocattaneo.testdagger.detail

import android.content.SharedPreferences
import android.os.Bundle
import android.support.v7.app.AppCompatActivity;
import dagger.android.AndroidInjection
import eu.marcocattaneo.testdagger.R

import kotlinx.android.synthetic.main.activity_detail.*
import javax.inject.Inject

class DetailActivity : AppCompatActivity() {

    @Inject
    lateinit var pair: Pair<String, String>

    @Inject
    lateinit var prefs: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        setSupportActionBar(toolbar)

    }

}
