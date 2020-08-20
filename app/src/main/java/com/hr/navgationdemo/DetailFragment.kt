package com.hr.navgationdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_detail.*


class DetailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bt_detail.setOnClickListener {
            //第一种方式
//            Navigation.createNavigateOnClickListener(R.id.action_detailFragment_to_homeFragment)
            //第二种方式
            var navController = Navigation.findNavController(it)
            navController.navigate(R.id.action_detailFragment_to_homeFragment)
        }
    }

}