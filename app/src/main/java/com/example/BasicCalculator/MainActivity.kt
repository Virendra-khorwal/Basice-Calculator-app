package com.example.BasicCalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var Input1 : EditText
    lateinit var Input2 : EditText
    lateinit var Add : Button
    lateinit var Subtract : Button
    lateinit var Multiply : Button
    lateinit var Divide : Button
    lateinit var Average : Button
    lateinit var remainder : Button
    lateinit var output : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Add = findViewById(R.id.Add)
        Subtract = findViewById(R.id.Subtract)
        Multiply = findViewById(R.id.Multiply)
        Divide = findViewById(R.id.Divide)
        Average = findViewById(R.id.Average)
        remainder = findViewById(R.id.Remainder)

    }

    fun sum(view : View){
        Input1 = findViewById(R.id.Input1)
        Input2 = findViewById(R.id.Input2)
        output = findViewById(R.id.output)

        var a = Input1.text
        var b = Input2.text
        var c = a.toString().toDouble() + b.toString().toDouble()
        output.setText(c.toString())
    }

    fun subtract(view : View){
        Input1 = findViewById(R.id.Input1)
        Input2 = findViewById(R.id.Input2)
        output = findViewById(R.id.output)

        var a = Input1.text
        var b = Input2.text
        var c = a.toString().toDouble() - b.toString().toDouble()
        output.setText(c.toString())
    }

    fun multiply(view : View){
        Input1 = findViewById(R.id.Input1)
        Input2 = findViewById(R.id.Input2)
        output = findViewById(R.id.output)

        var a = Input1.text
        var b = Input2.text
        var c = a.toString().toDouble() * b.toString().toDouble()
        output.setText(c.toString())
    }

    fun divide(view : View){
        Input1 = findViewById(R.id.Input1)
        Input2 = findViewById(R.id.Input2)
        output = findViewById(R.id.output)

        var a = Input1.text
        var b = Input2.text
        var c = a.toString().toDouble() / b.toString().toDouble()
        output.setText(c.toString())
    }

    fun average(view : View){
        Input1 = findViewById(R.id.Input1)
        Input2 = findViewById(R.id.Input2)
        output = findViewById(R.id.output)

        var a = Input1.text
        var b = Input2.text
        var c = (a.toString().toDouble() + b.toString().toDouble())/2
        output.setText(c.toString())
    }

    fun remainder(view : View){
        Input1 = findViewById(R.id.Input1)
        Input2 = findViewById(R.id.Input2)
        output = findViewById(R.id.output)

        var a = Input1.text
        var b = Input2.text
        var c = a.toString().toDouble() % b.toString().toDouble()
        output.setText(c.toString())
    }
}