package com.example.koindemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.koindemo.logic.Controller
import com.example.koindemo.ui.main.PageViewModel
import com.example.koindemo.ui.main.SectionsPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.viewModel
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    val controller: Controller by inject()

    val model: PageViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)
        val fab: FloatingActionButton = findViewById(R.id.fab)

        controller.showHello()

        fab.setOnClickListener { view ->
            model.setIndex(Random.nextInt(100))
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
        }
    }
}