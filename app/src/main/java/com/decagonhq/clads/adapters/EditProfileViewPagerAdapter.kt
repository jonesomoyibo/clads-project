package com.decagonhq.clads.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.decagonhq.clads.fragments.profilemanagement.TablayoutAccountFragment
import com.decagonhq.clads.fragments.profilemanagement.TablayoutPaymentMethodFragment
import com.decagonhq.clads.fragments.profilemanagement.TablayoutSecurityFragment
import com.decagonhq.clads.fragments.profilemanagement.TablayoutSpecialtyFragment


class EditProfileViewPagerAdapter(fm:FragmentManager,lifeCycle: Lifecycle) : FragmentStateAdapter(fm,lifeCycle) {
    override fun getItemCount(): Int {
        return 4
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> {
                TablayoutAccountFragment()
            }
            1 -> {
                TablayoutSpecialtyFragment()
            }
            2 -> {
                TablayoutPaymentMethodFragment()
            }
            else -> {
                TablayoutSecurityFragment()
            }
        }
    }
}