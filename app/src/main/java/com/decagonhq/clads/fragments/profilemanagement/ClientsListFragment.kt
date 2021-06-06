package com.decagonhq.clads.fragments.profilemanagement

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.decagonhq.clads.databinding.FragmentAddMeasurementBinding
import com.decagonhq.clads.databinding.FragmentClientsListBinding


class ClientsListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return FragmentClientsListBinding.inflate(inflater).root
    }

    
}