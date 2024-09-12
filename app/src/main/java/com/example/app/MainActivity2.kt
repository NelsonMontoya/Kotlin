package com.example.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val pounds: TextView = findViewById(R.id.textSecond)

        //recibir los datos

        val bundle: Bundle? = intent.extras
        val libras = bundle?.get("libras")
        pounds.setText(libras.toString())

    }
}