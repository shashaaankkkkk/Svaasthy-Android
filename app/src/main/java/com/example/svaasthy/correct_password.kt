package com.example.svaasthy

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginCorrectPasswordScreen : AppCompatActivity() {

    private lateinit var emailController: EditText
    private lateinit var locationController: EditText
    private lateinit var formKey: LinearLayout

     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_correct_password_screen)

         fun buildEmail() {
             emailController.hint = "Enter your email"
         }

         fun buildlocation() {
             locationController.hint = "Enter your location"
         }


         lateinit var formKey: LinearLayout


         formKey.setOnClickListener {
            // Handle form key click
        }
    }

    private fun buildAppBar() {
        // Implement the logic for building the app bar
    }

    private fun buildEmail() {
        // Implement the logic for building the email field
    }

    private fun buildLocation() {
        // Implement the logic for building the location field
    }

    private fun buildLoginButton() {
        // Implement the logic for building the login button
    }

    private fun buildOrButton() {
        // Implement the logic for building the OR button
    }

    private fun buildOrStack() {
        // Implement the logic for building the OR stack
    }

    private fun buildSignInWithGoogleButton() {
        // Implement the logic for building the "Sign in with Google" button
    }

    private fun buildSignInWithAppleButton() {
        // Implement the logic for building the "Sign in with Apple" button
    }

    private fun buildSignInWithFacebookButton() {
        // Implement the logic for building the "Sign in with Facebook" button
    }
}

