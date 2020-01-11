package com.bluetech.viewpagerdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.ORIENTATION_VERTICAL

class MainActivity : AppCompatActivity() {

    var viewPager: ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager);

        val adapter =  ViewPagerAdapter(this);
        viewPager?.adapter = adapter
        viewPager?.orientation = ORIENTATION_VERTICAL;//comment if need horizontal scrolling
    }
}
