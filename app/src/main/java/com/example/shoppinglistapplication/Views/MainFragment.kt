package com.example.shoppinglistapplication.Views


import android.app.Application
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

import com.example.shoppinglistapplication.R
import com.example.shoppinglistapplication.viewModels.WelcomeViewModel
import com.example.shoppinglistapplication.databinding.FragmentMainBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class MainFragment : Fragment() {

    private var param1: String? = null
    private var param2: String? = null

    private lateinit var mainActivity: MainActivity
    private lateinit var binding:FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentMainBinding>(inflater,R.layout.fragment_main,container,false)
        val mainViewModel: WelcomeViewModel = ViewModelProvider.AndroidViewModelFactory(Application()).create(WelcomeViewModel::class.java)

        binding.lifecycleOwner = activity
        binding.welcomeViewModel = mainViewModel
        return binding.root
    }



    companion object {

        @JvmStatic
        fun newInstance(activity: MainActivity) =
            MainFragment().apply {
                mainActivity =activity
            }
    }
}
