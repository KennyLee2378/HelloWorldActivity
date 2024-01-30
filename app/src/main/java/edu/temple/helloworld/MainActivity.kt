package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties - the first one is done for you
    lateinit var displayTextView: TextView
    lateinit var nameText : EditText
    lateinit var buttonPress :  Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize with views defined in Layout - the first one is done for you
        displayTextView = findViewById(R.id.displayTextView)
        buttonPress = findViewById(R.id.clickMeButton)
        nameText = findViewById(R.id.nameEditText)

        // Respond to button click event per specifications
        buttonPress.setOnClickListener{
            displayTextView.text = "Hello ${nameText.text}"
        }

    }
}