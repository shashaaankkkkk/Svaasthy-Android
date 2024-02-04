package com.example.svaasthy

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class CreateNewPasswordScreen : AppCompatActivity() {

    private lateinit var confirmpasswordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_new_password)



        // Additional configurations and UI updates can be done here
    }

    // Handle Create Password button click
    fun onCreatePasswordClick() {
        // Implement the logic for Create Password button click here
    }
}
