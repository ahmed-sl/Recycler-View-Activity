package com.example.recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var edName: EditText
    lateinit var edAddress: EditText
    lateinit var edLocation: EditText
    lateinit var edEmail: EditText
    lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edName=findViewById(R.id.edName)
        edAddress=findViewById(R.id.edAddress)
        edLocation=findViewById(R.id.edLocation)
        edEmail=findViewById(R.id.edEmail)

        btnSave=findViewById(R.id.btnSave)
        btnSave.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("Name",edName.text.toString())
            intent.putExtra("Address",edAddress.text.toString())
            intent.putExtra("Location",edLocation.text.toString())
            intent.putExtra("Email",edEmail.text.toString())
            startActivity(intent)
        }



    }
}