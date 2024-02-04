package com.example.svaasthy

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class ResetPasswordEmailTabContainerScreen : AppCompatActivity() {

    private lateinit var tabController: TabLayout
    private lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password_email_tab_container)



        val tabTitles = listOf("Email", "Phone")

        viewPager.adapter = TabPagerAdapter(this)

        TabLayoutMediator(tabController, viewPager) { tab, position ->
            tab.text = tabTitles[position]
        }.attach()

        // Additional configurations and UI updates can be done here
    }
}

class TabPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> EmailFragment()
            1 -> PhoneFragment()
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
}

class EmailFragment : Fragment(R.layout.fragment_email) {
    // Implement the Email tab fragment logic here
}

class PhoneFragment : Fragment(R.layout.fragment_phone) {
    // Implement the Phone tab fragment logic here
}
