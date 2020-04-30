package com.example.first

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.first.MESSAGE"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /** Called when user presses enter button */
    fun submitName(view: View) {
        val name = findViewById<EditText>(R.id.editText)
        val message = "Hi there ${name.text}"
        val intent = Intent(this, DisplayMessageActivity::class.java).apply{
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}
