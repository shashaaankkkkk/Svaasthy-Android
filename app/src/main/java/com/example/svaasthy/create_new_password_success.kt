package com.example.svaasthy

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class CreateNewPasswordSuccessDialog : Dialog(AppCompatActivity()) {

    private lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dialog_create_new_password_success)


        loginButton.setOnClickListener {
            // Implement the logic for the Login button click here
        }

        // Additional configurations and UI updates can be done here
    }
}
