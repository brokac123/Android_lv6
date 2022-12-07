package com.lukabakula.lv6_android


import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction



class RadioFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_radio, container, false)
        val naprButton : Button = view.findViewById(R.id.naprijedButton)


        naprButton.setOnClickListener{
            val radioGroup = view.findViewById<RadioGroup>(R.id.radioGroup)
            val radioButton = view.findViewById<RadioButton>(radioGroup.checkedRadioButtonId)
            val fragment = TextViewFragment()
            val bundle = Bundle()
            bundle.putString("BUTTON", radioButton.text.toString())
            fragment.arguments = bundle
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container,fragment)?.commit()

        }
        return view
    }
}


