package com.decagonhq.clads.fragments.profilemanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decagonhq.clads.R
import com.decagonhq.clads.databinding.FragmentDashboardMessagesBinding


class DashboardMessagesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return FragmentDashboardMessagesBinding.inflate(inflater).root
    }

}