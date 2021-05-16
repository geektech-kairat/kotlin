package com.example.kotlin.ui.form

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kotlin.App
import com.example.kotlin.databinding.FragmentFormBinding
import com.example.kotlin.room.Dao
import com.example.kotlin.ui.home.adapter.HomeModel

class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding;

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(layoutInflater, container, false)
        click()
        return binding.root
    }

    private fun click() {
        binding.saveButton.setOnClickListener {
            App().dateBase.dao().insert(HomeModel(
                
            )
        }
    }

}