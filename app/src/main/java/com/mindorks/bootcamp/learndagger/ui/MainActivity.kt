package com.mindorks.bootcamp.learndagger.ui

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.mindorks.bootcamp.learndagger.MyApplication
import com.mindorks.bootcamp.learndagger.R
import com.mindorks.bootcamp.learndagger.di.components.DaggerActivityComponent
import com.mindorks.bootcamp.learndagger.di.module.ActivityModule
import javax.inject.Inject

class MainActivity: AppCompatActivity() {

    @Inject
    lateinit var viewModel: MainViewModel

    private var tvData: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getDependencies()
        setContentView(R.layout.activity_main)
        tvData = findViewById(R.id.tvData)

    }

    fun getDependencies(){
        DaggerActivityComponent
                .builder()
                .applicationComponent((applicationContext as MyApplication).component)
                .activityModule(ActivityModule(this))
                .build()
                .inject(this)
    }
}