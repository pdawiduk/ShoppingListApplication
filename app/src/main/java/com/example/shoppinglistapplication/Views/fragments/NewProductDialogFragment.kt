package com.example.shoppinglistapplication.Views.fragments

import android.app.Activity
import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.shoppinglistapplication.R

class NewProductDialogFragment :DialogFragment(){


    private lateinit var activity: Activity
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
         super.onCreateDialog(savedInstanceState)

        val dialog:AlertDialog = AlertDialog.Builder(context!!)
            .setView(view)
            .setTitle("New Product")
            .setCancelable(false)
            .setPositiveButton("Add", null)
            .create()

        dialog.setCanceledOnTouchOutside(true)
        dialog.setOnShowListener { onDialogShow(dialog) }

    return dialog

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
         super.onCreateView(inflater, container, savedInstanceState)


        return inflater.inflate(R.layout.new_product_dialog_fragment,container,false)

    }

    private fun onDialogShow(dialog:AlertDialog){

        val positveBtn:Button = dialog.getButton(AlertDialog.BUTTON_POSITIVE)

        positveBtn.setOnClickListener {  }
    }

    companion object{

        fun newInstance(activity:Activity):NewProductDialogFragment{
            val dialog = NewProductDialogFragment()
            dialog.activity = activity
            return dialog
        }
    }
}