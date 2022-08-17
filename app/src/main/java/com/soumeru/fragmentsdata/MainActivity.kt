package com.soumeru.fragmentsdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.soumeru.fragmentsdata.adapter.ViewPagerAdapter

class MainActivity : AppCompatActivity(), SendDataInterface {

    lateinit var tabLayout: TabLayout
    lateinit var viewPager: ViewPager
    lateinit var viewPagerAdapter: ViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager = findViewById(R.id.viewPager)
        viewPager.adapter = viewPagerAdapter

        tabLayout = findViewById(R.id.tabLayout)
        tabLayout.setupWithViewPager(viewPager)

    }

    override fun sendData(message: String) {
        val tag = "android:switcher:" + R.id.viewPager + ":" + 1
        val fragmentTwo: FragmentTwo = supportFragmentManager.findFragmentByTag(tag) as FragmentTwo
        fragmentTwo.displayReceivedData(message)
    }
}