package com.decagonhq.clads.dialogs


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.EditText
import android.widget.RadioGroup
import androidx.fragment.app.DialogFragment
import com.decagonhq.clads.R
import com.decagonhq.clads.databinding.AddSpecialtyDialogFragmentLayoutBinding
import com.decagonhq.clads.databinding.DeliveryLeadTimeFragmentLayoutBinding
import com.decagonhq.clads.databinding.ObiomaTrainedDialogFragmentLayoutBinding


class DialogFragments private constructor(private var layoutId: Int) : DialogFragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setStyle(STYLE_NO_TITLE, android.R.style.Theme_DeviceDefault_Light_Dialog_MinWidth)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutId, container)

    }


    companion object {

        fun createFragment(layoutId: Int): DialogFragments {

            return DialogFragments(layoutId)

        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        super.onViewCreated(view, savedInstanceState)


        when (layoutId) {
            R.layout.add_specialty_dialog_fragment_layout -> {
                val binding = AddSpecialtyDialogFragmentLayoutBinding.bind(view)
                binding.addSpecialtyButton.apply {
                    setOnClickListener {

                    }
                }
            }
            R.layout.delivery_lead_time_fragment_layout -> {
                val binding = DeliveryLeadTimeFragmentLayoutBinding.bind(view)
            }
            R.layout.obioma_trained_dialog_fragment_layout -> {
                val binding = ObiomaTrainedDialogFragmentLayoutBinding.bind(view)
                binding.obiomaTrainedRadioGroup.apply {
                    setOnCheckedChangeListener{
                            group, checkedId ->

                    }
                }
            }


        }

    }
}