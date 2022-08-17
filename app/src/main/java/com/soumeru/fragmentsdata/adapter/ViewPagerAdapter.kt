package com.soumeru.fragmentsdata.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.soumeru.fragmentsdata.FragmentOne
import com.soumeru.fragmentsdata.FragmentTwo

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        var fragment: Fragment? = null
        if (position == 0) {
            fragment = FragmentOne()
        } else if (position == 1) {
            fragment = FragmentTwo()
        }
        return fragment!!
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title: String? = null
        if (position == 0) {
            title = "Tab - 1"
        } else if (position == 1) {
            title = "Tab - 2"
        }
        return title
    }
}