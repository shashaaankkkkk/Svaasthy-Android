package com.example.svaasthy

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class LoginWrongPasswordScreen : AppCompatActivity() {
    private lateinit var emailController: EditText
    private lateinit var locationController: EditText
    private lateinit var formKey: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_wrong_password)



        // Set up the app bar
        val appBar = buildAppBar()
        setSupportActionBar(appBar)

        // Set up the login button click listener
        val loginButton = null
        loginButton.setOnClickListener {
            if (validateForm()) {
                // Perform login logic here
                Toast.makeText(this, "Login button clicked", Toast.LENGTH_SHORT).show()
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
        appBar.setTitle(AppbarTitle(this, "Login"))
        return appBar
    }

    private fun AppbarTitle(signUpScreen: LoginWrongPasswordScreen, s: String): AppbarTitle {
        TODO("Not yet implemented")
    }

    private fun AppbarLeadingImage(
        loginScreen: LoginWrongPasswordScreen,
        imgIconChevronLeft: Any,
        margin: Margin
    ): AppbarLeadingImage {
        TODO("Not yet implemented")
    }

    private fun CustomAppBar(signUpScreen: LoginWrongPasswordScreen): CustomAppBar {
        TODO("Not yet implemented")
    }

    private fun validateForm(): Boolean {
        // Implement form validation logic here
        return true
    }
}
