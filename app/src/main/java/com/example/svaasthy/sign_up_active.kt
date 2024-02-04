package com.example.svaasthy

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SignUpActiveScreen : AppCompatActivity() {
    private lateinit var fullNameController: EditText
    private lateinit var emailController: EditText
    private lateinit var passwordController: EditText
    private lateinit var checkboxButton: CustomCheckboxButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_active)



        // Set up the app bar
        val appBar = buildAppBar()
        setSupportActionBar(appBar)

        // Set up the sign-up button click listener
        val signUpButton = null
        signUpButton.setOnClickListener {
            if (validateForm()) {
                // Perform sign-up logic here
                Toast.makeText(this, "Sign Up button clicked", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun setSupportActionBar(appBar: CustomAppBar) {
        TODO("Not yet implemented")
    }

    private fun buildAppBar(): CustomAppBar {
        val appBar = CustomAppBar(this)
        appBar.setLeading(
            AppbarLeadingImage(
                this,
                ImageConstant.imgIconChevronLeft,
                Margin(32.h, 16.v, 0.h, 0.v)
            )
        )
        appBar.setCenterTitle(true)
        appBar.setTitle(AppbarTitle(this, "Sign Up"))
        return appBar
    }

    private fun AppbarLeadingImage(
        loginScreen: SignUpActiveScreen,
        imgIconChevronLeft: Any,
        margin: Margin
    ) {

    }

    private fun CustomAppBar(signUpScreen: SignUpActiveScreen): CustomAppBar {
        TODO("Not yet implemented")
    }

    private fun AppbarTitle(signUpScreen: SignUpActiveScreen, s: String): AppbarTitle {
        TODO("Not yet implemented")
    }

    private fun validateForm(): Boolean {
        // Implement form validation logic here
        return true
    }
}
