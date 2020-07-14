package com.pareshdroid.nytimesmultimodule.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.pareshdroid.nytimesmultimodule.MyApplication
import com.pareshdroid.nytimesmultimodule.R
import com.pareshdroid.nytimesmultimodule.di.component.DaggerActivityComponent
import com.pareshdroid.nytimesmultimodule.di.module.ActivityModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel:MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        getSomeDependencies()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun getSomeDependencies(){
        DaggerActivityComponent
            .builder()
            .coreComponent(MyApplication.coreComponent(this))
            .activityModule(ActivityModule(this))
            .build()
            .inject(this);
    }
}