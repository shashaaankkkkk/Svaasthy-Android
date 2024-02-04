package com.example.svaasthy

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ResetPasswordVerifyCodeScreen : AppCompatActivity() {

    private lateinit var codeTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password_verify_code)



        // Additional configurations and UI updates can be done here
    }

    // Handle Verify button click
    fun onVerifyClick() {
        // Implement the logic for Verify button click here
    }

    // Handle Resend link click
    fun onResendClick() {
        // Implement the logic for Resend link click here
    }
}
