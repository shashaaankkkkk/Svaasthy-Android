package com.example.svaasthy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment


class LoginSuccessDialog : DialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login_success_dialog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Set up the views
        setupViews()
    }

    private fun setupViews() {
        // Set dimensions and padding
        dialog?.window?.setLayout(327.h as Int, ViewGroup.LayoutParams.WRAP_CONTENT)
        dialog?.window?.setBackgroundDrawableResource(android.R.color.transparent)

        val containerLayout = null
        containerLayout.setPadding(26.h.toInt(), 40.v.toInt(), 26.h.toInt(), 40.v.toInt())

        // Set up the checkmark image
        val checkmarkImageView = null
        checkmarkImageView.setPadding(29.h.toInt(), 34.v.toInt(), 29.h.toInt(), 34.v.toInt())

        // Set up the button click listener
        val goToHomeButton = null
        goToHomeButton.setOnClickListener {
            // Perform logic to go to the home screen
        }
    }
}

private fun Nothing?.setPadding(toInt: Int, toInt1: Int, toInt2: Int, toInt3: Int) {
    TODO("Not yet implemented")
}
