package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonLog: Button = findViewById(R.id.button_log)
        val buttonTimber: Button = findViewById(R.id.button_timber)
        val text: EditText = findViewById(R.id.editText)

        Timber.plant(Timber.DebugTree())

        buttonLog.setOnClickListener {
            Log.v("From EditText", text.getText().toString())
        }

        buttonTimber.setOnClickListener {
            Timber.v(text.getText().toString())
        }
    }
}