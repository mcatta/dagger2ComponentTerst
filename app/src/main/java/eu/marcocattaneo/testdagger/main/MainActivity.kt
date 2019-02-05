package eu.marcocattaneo.testdagger.main

import android.content.Intent
import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import eu.marcocattaneo.testdagger.R
import eu.marcocattaneo.testdagger.detail.DetailActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var pair: Pair<String, String>

    @Inject
    lateinit var prefs: SharedPreferences

    @Inject
    lateinit var mainActivityPresenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        open_detail.setOnClickListener { view ->
            startActivity(Intent(this, DetailActivity::class.java))
        }
    }
}
