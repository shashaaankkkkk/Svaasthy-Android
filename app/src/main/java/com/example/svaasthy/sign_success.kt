package com.example.svaasthy

import android.app.ActionBar
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.LinearLayout.LayoutParams
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


private var Nothing?.background: Drawable?
    get() {
        TODO("Not yet implemented")
    }
    set(value) {}

private var Nothing?.layoutParams: ActionBar.LayoutParams
    get() {
        TODO("Not yet implemented")
    }
    set(value) {}


class SignUpSuccessDialog : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_success_dialog)

        // Set up the success dialog UI
        setUpDialogUI()

        // Set up the login button click listener
        val loginButton = null
        loginButton.setOnClickListener {
            // Perform login logic here
            Toast.makeText(this, "Login button clicked", Toast.LENGTH_SHORT).show()
            // Close the success dialog
            finish()
        }
    }

    private fun setUpDialogUI() {
        // Customize the dialog appearance

        val layoutParams = ActionBar.LayoutParams(

            LayoutParams.WRAP_CONTENT
        )
        layoutParams.gravity = Gravity.CENTER
        val dialogContainer = null
        dialogContainer.layoutParams = layoutParams
        dialogContainer.background = ContextCompat.getDrawable(this, R.drawable.dialog_background)

        // Customize other UI elements as needed
    }
}
