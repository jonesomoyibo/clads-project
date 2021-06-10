package com.decagonhq.clads.fragments.profilemanagement

import android.app.ProgressDialog.show
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.decagonhq.clads.R
import com.decagonhq.clads.adapters.SpecialtyListAdapter
import com.decagonhq.clads.databinding.FragmentTablayoutSpecialtyBinding
import com.decagonhq.clads.dialogs.DialogFragments
import com.decagonhq.clads.models.Specialty

class TablayoutSpecialtyFragment : Fragment() {


    private lateinit var fragmentTablayoutSpecialtyBinding:FragmentTablayoutSpecialtyBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        fragmentTablayoutSpecialtyBinding = FragmentTablayoutSpecialtyBinding.inflate(inflater)
        return fragmentTablayoutSpecialtyBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpUI()
    }

         fun setUpUI(){
             val layoutManager= LinearLayoutManager(requireActivity())
             layoutManager.apply {
                 orientation = LinearLayoutManager.VERTICAL
             }
             fragmentTablayoutSpecialtyBinding.specialtyRecyclerView.apply {
                this.layoutManager = layoutManager
                 adapter = SpecialtyListAdapter(requireActivity(),
                     mutableListOf(Specialty("Yoruba attires",true),
                         Specialty("Hausa attires",true),
                         Specialty("Embroidery",false),
                         Specialty("School uniforms",true),
                         Specialty("Military and paramiltary Uniforms",false),
                         Specialty("Igbo attires",false),
                         Specialty("Kaftans",false),
                         Specialty("Contemporary",false),
                         Specialty("Western fashion",false),
                         Specialty("Cops",false)

                         ))
             }

             fragmentTablayoutSpecialtyBinding.addNewSpecialty.apply {
                 setOnClickListener{
                   DialogFragments.createFragment(R.layout.add_specialty_dialog_fragment_layout)
                       .show(requireActivity().supportFragmentManager,null)
                 }
             }

             fragmentTablayoutSpecialtyBinding.deliveryLeadTime.apply {
                 setOnClickListener{
                     DialogFragments.createFragment(R.layout.delivery_lead_time_fragment_layout)
                         .show(requireActivity().supportFragmentManager,null)
                 }
             }
             fragmentTablayoutSpecialtyBinding.qualityAssuranceContent.apply{
                 setOnClickListener{
                     DialogFragments.createFragment(R.layout.obioma_trained_dialog_fragment_layout)
                         .show(requireActivity().supportFragmentManager,null)
                 }
             }

    }
}
