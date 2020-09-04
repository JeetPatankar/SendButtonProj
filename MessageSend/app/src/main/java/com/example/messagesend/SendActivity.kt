package com.example.messagesend

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE"

class SendActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        val MessageEdit = findViewById<EditText>(R.id.editTextTextPersonName)
        val ToSendMessage = MessageEdit.text.toString()
        val intent = Intent(this, DisplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, ToSendMessage)
        }
        startActivity(intent)
    }
}