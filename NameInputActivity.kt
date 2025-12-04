package com.example.awdk_initialsgeneratorproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class NameInputActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name_input)

        val firstNameEditText = findViewById<EditText>(R.id.firstNameEditText)
        val lastNameEditText = findViewById<EditText>(R.id.lastNameEditText)
        val createInitialsButton = findViewById<Button>(R.id.createInitialsButton)

        // Implement an onClickListener for the button
        createInitialsButton.setOnClickListener {
            // Get the text from both EditText views
            val firstName = firstNameEditText.text.toString().trim()
            val lastName = lastNameEditText.text.toString().trim()

            // Validate the input: Check that both fields are non-empty [cite: 19]
            if (firstName.isEmpty() || lastName.isEmpty()) {
                // If a field is empty, display a Toast message [cite: 20]
                Toast.makeText(this, "Both names are required.", Toast.LENGTH_SHORT).show()
            } else {
                // Extract the first character from each name string and convert to uppercase
                val firstInitial = firstName.first().uppercaseChar()
                val lastInitial = lastName.first().uppercaseChar()

                // Create an Intent to start the InitialsDisplayActivity [cite: 22]
                val intent = Intent(this, InitialsDisplayActivity::class.java)

                // Pass the two initial characters as String extras in the Intent [cite: 23]
                intent.putExtra("FIRST_INITIAL", firstInitial.toString())
                intent.putExtra("LAST_INITIAL", lastInitial.toString())

                // Launch the new activity [cite: 24]
                startActivity(intent)
            }
        }
    }
}