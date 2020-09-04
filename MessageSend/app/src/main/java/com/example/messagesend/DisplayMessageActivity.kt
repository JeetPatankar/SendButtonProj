package com.example.messagesend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val SentMessage = intent.getStringExtra(EXTRA_MESSAGE)
        val DisMessage = findViewById<TextView>(R.id.textView).apply {
            text = SentMessage
        }
    }
}