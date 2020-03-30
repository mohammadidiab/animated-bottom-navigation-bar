package com.md.animatedbottomnavigationbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.md.animatedbottomnavigationbarlib.ABottomNavigation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val ID_HOME = 0
        private const val ID_EXPLORE = 1
        private const val ID_MESSAGE = 2
        private const val ID_NOTIFICATION = 3
        private const val ID_ACCOUNT = 4
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initTabs()
        initViewPager()
    }


    private fun initViewPager() {

        val adapter = MyFragmentPagerAdapter(getSupportFragmentManager(), bottomNavigation.models)

        viewpager!!.adapter = adapter
        viewpager.currentItem = ID_HOME
        bottomNavigation.show(ID_HOME, true)
        viewpager?.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int,positionOffset: Float,positionOffsetPixels: Int) {

            }

            override fun onPageSelected(position: Int) {
                bottomNavigation.show(position, true)
            }

        })

    }

    private fun initTabs() {

        bottomNavigation.add(ABottomNavigation.Model(ID_HOME, R.drawable.ic_home, "HOME"))
        bottomNavigation.add(ABottomNavigation.Model(ID_EXPLORE, R.drawable.ic_explore, "EXPLORE"))
        bottomNavigation.add(ABottomNavigation.Model(ID_MESSAGE, R.drawable.ic_message, "MESSAGE"))
        bottomNavigation.add(ABottomNavigation.Model(ID_NOTIFICATION,R.drawable.ic_notification,"Notafications"))
        bottomNavigation.add(ABottomNavigation.Model(ID_ACCOUNT, R.drawable.ic_account, "ACCOUNT"))


        bottomNavigation.setCount(ID_NOTIFICATION, "5")


        bottomNavigation.setOnClickMenuListener {
            viewpager?.currentItem = it.id
        }
    }
}
