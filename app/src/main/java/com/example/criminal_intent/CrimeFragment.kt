package com.example.criminal_intent

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import androidx.fragment.app.FragmentActivity

class CrimeFragment: FragmentActivity {
    private lateinit var crime: Crime

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        crime = Crime()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater(R.layout.fragment_crime, container, false)

        titleField = view.findViewById(R.id.crime_title) as EditText

        return view
    }
}