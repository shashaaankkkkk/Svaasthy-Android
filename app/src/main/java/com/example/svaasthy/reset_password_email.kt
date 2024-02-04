package com.example.svaasthy

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class ResetPasswordEmailPage : AppCompatActivity() {

    private val emailController = EditText(this)
    private val formKey = View.generateViewId()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password_email)


        val resetPasswordButton = null
        resetPasswordButton.setOnClickListener {
            val email = emailController.text.toString()

            // Perform reset password logic here
        }
    }
}
