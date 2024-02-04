package com.example.svaasthy

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.textfield.TextInputEditText

class ResetPasswordPhonePage : AppCompatActivity() {

    private lateinit var codeController: TextInputEditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password_phone)



        // Additional configurations and UI updates can be done here
    }

    // Handle Reset Password button click
    fun onResetPasswordClick(view: View) {
        // Implement the logic for Reset Password button click here
    }
}
