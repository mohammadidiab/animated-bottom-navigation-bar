package com.md.animatedbottomnavigationbar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.md.animatedbottomnavigationbarlib.ABottomNavigation


class MyFragmentPagerAdapter(
    manager: FragmentManager,
    models: ArrayList<ABottomNavigation.Model>
) : FragmentPagerAdapter(manager) {
var  myModels = models;
    override fun getItem(position: Int): Fragment {
        return  MyFrament.newInstance(myModels.get(position).title)
    }

    override fun getCount(): Int {
        return myModels.size
    }


    override fun getPageTitle(position: Int): CharSequence? {
        return myModels.get(position).title
    }
}