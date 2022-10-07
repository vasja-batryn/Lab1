package com.example.lab1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.round

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Text_e: EditText? = findViewById(R.id.enter)
        val But_Far = findViewById<Button>(R.id.far)
        val But_Cel = findViewById<Button>(R.id.cel)
        val Res: TextView? = findViewById(R.id.resault)
        But_Far.setOnClickListener{
            val degree: Float = (Text_e?.text.toString().toFloatOrNull() ?: 0) as Float
            if (degree<=110.0 && degree >= -50.0){
                Res?.setText("${round(degree * 1.8 + 32)} ℉")
            }
            else{
                Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
            }
            Text_e?.setText(" ")
        }
        But_Cel.setOnClickListener{
            val degree: Float = (Text_e?.text.toString().toFloatOrNull() ?: 0) as Float
            if (degree<=230.0 && degree >= -50.0){
                Res?.setText("${round((degree - 32) / 1.8)} °C")
            }
            else{
                Toast.makeText(this, getString(R.string.Error), Toast.LENGTH_SHORT).show()
            }
            Text_e?.setText(" ")
        }
    }

}