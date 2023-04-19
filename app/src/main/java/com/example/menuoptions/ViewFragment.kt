package com.example.menuoptions

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.fragment.app.Fragment

class ViewFragment : Fragment(R.layout.fragment_view) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val progressBar:ProgressBar = view.findViewById(R.id.progressBar)

        val progressValue = 10
        progressBar.progress = progressValue
    }
}