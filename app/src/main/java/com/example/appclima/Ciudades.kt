package com.example.appclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Ciudades : AppCompatActivity() {

    val TAG = "com.example.appclima.ciudades.CIUDAD"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ciudades)

        val bMexico= findViewById<Button>(R.id.bMexico)
        val bBerlin= findViewById<Button>(R.id.bBerlin)
        val bFCP= findViewById<Button>(R.id.bFCP)

        bMexico.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-mexico")
            startActivity(intent)
        })
        bFCP.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-fcp")
            startActivity(intent)
        })


        bBerlin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra(TAG, "ciudad-berlin")
            startActivity(intent)
        })
    }
}