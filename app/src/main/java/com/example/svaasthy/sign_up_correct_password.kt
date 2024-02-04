package com.example.svaasthy

import android.os.Bundle
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class SignUpCorrectPasswordScreen : AppCompatActivity() {
    private lateinit var nameController: EditText
    private lateinit var emailController: EditText
    private lateinit var iconCheckCheckbox: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_correct_password)



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

        val leadingImageParams = ViewGroup.MarginLayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        leadingImageParams.setMargins(32.h.toInt(), 16.v.toInt(), 0.h.toInt(), 0.v.toInt())

        appBar.setLeading(
            AppbarLeadingImage(
                this,
                ImageConstant.imgIconChevronLeft,
                leadingImageParams
            )
        )

        appBar.setCenterTitle(true)
        appBar.setTitle(AppbarTitle(this, "Sign Up"))

        return appBar
    }

    private fun AppbarTitle(signUpScreen: SignUpCorrectPasswordScreen, s: String): AppbarTitle {
        TODO("Not yet implemented")
    }

    private fun AppbarLeadingImage(
        loginScreen: SignUpCorrectPasswordScreen,
        imgIconChevronLeft: Any,
        margin: ViewGroup.MarginLayoutParams
    ): AppbarLeadingImage {
        TODO("Not yet implemented")
    }

    private fun CustomAppBar(signUpScreen: SignUpCorrectPasswordScreen): CustomAppBar {
        TODO("Not yet implemented")
    }


    private fun validateForm(): Boolean {
        // Implement form validation logic here
        return true
    }
}
