package com.lukabakula.lv6_android



import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import org.w3c.dom.Text

class TextViewFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_text_view, container, false)
        val prevButton : Button = view.findViewById(R.id.natragButton)
        val textView : TextView = view.findViewById(R.id.textView2)
        textView.text = arguments?.getString("BUTTON").toString()

        prevButton.setOnClickListener{

            val fragment = RadioFragment()
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.nav_container, fragment)?.commit()

        }
        return view
    }

}

