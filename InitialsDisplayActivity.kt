package com.example.awdk_initialsgeneratorproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InitialsDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_initials_display)

        val initialsTextView = findViewById<TextView>(R.id.initialsTextView)

        // Retrieve the Intent and its extras
        val firstInitial = intent.getStringExtra("FIRST_INITIAL")
        val lastInitial = intent.getStringExtra("LAST_INITIAL")

        // Combine the two received initials into a single string
        val combinedInitials = "$firstInitial$lastInitial"

        // Set the text property of your TextView to display the combined initials string
        initialsTextView.text = combinedInitials
    }
}