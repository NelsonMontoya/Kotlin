package com.example.app

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt: EditText = findViewById(R.id.kilo_edt)
        val btn : Button = findViewById(R.id.btn_convert)
        val btn_intent: Button = findViewById(R.id.btn_intent)
        val btn_google:Button = findViewById(R.id.btn_google)
        val result: TextView = findViewById(R.id.result_txt)

        btn.setOnClickListener(){
            val kilos:Double = edt.text.toString().toDouble()
            result.setText("Los "+kilos +" kilogramos equivalen a: "+convertToPounds(kilos))
        }

        btn_intent.setOnClickListener(){
            var intent: Intent = Intent(this,MainActivity2::class.java)
            val kilos:Double = edt.text.toString().toDouble()
            intent.putExtra("libras",convertToPounds(kilos))
            startActivity(intent)
        }

        btn_google.setOnClickListener(){
            val webpage:Uri = Uri.parse("https://www.google.com")
            val intent = Intent(Intent.ACTION_VIEW)
            intent.setData(webpage)
            startActivity(intent)
        }
    }



    fun convertToPounds (kilos:Double):Double{
        return kilos*2.20462
    }
}