package com.lukabakula.lv6_android


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.TextView
import androidx.fragment.app.FragmentTransaction



class TextViewFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_text_view, container, false)

        val textView : TextView = view.findViewById(R.id.textView2)
        textView.text = arguments?.getString("data").toString()

        val natragButton: Button = view.findViewById(R.id.natragButton)
        natragButton.setOnClickListener {
            val bundle = Bundle()
            val fragment = RadioFragment()
            fragment.arguments = bundle
            val fragmentTransaction: FragmentTransaction? =
                activity?.supportFragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.nav_container, fragment)
            fragmentTransaction?.commit()
        }
        return view
    }
}

