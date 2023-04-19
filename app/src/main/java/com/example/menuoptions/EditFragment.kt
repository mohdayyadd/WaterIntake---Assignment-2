package com.example.menuoptions

import android.os.Bundle
import android.widget.*
import android.view.View
import androidx.fragment.app.Fragment




class EditFragment : Fragment(R.layout.fragment_edit) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val btsv:Button = view.findViewById(R.id.buttonsSave)

        val waterTV: EditText = view.findViewById(R.id.intakeTV)
        val valTV:TextView = view.findViewById(R.id.valTV)
        var flag = "L"
        val spinnerVal : Spinner = view.findViewById(R.id.spinner)
        val options = arrayOf("mL","L","Oz")
        spinnerVal.adapter = ArrayAdapter(requireContext(),android.R.layout.simple_list_item_1,options )
        btsv.setOnClickListener{
            when (flag) {
                "mL" -> {
                    val concatStml: String = waterTV.text.toString() + " ml"
                    valTV.text = concatStml
                }
                "Oz" -> {
                    val concatStoz: String = waterTV.text.toString() + " Oz"
                    valTV.text = concatStoz
                }
                else -> {
                    val concatStL: String = waterTV.text.toString() + " L"
                    valTV.text = concatStL
                }
            }
        }
        spinnerVal.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2) //p2 is the index of selected item
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }
    }
}