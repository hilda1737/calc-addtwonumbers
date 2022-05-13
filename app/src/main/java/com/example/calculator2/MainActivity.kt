package com.example.calculator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
lateinit var btnsubtract: Button
lateinit var btnadd: Button
lateinit var tvanswer: TextView
lateinit var btnmultiply:Button
lateinit var btnmodulus:Button
lateinit var etnum2:EditText
lateinit var etnum1:EditText

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    btnsubtract = findViewById(R.id.btnsubtract)
    etnum1 = findViewById(R.id.etnum1)
    etnum2 = findViewById(R.id.etnum2)
    tvanswer = findViewById(R.id.tvanswer)
    btnmultiply = findViewById(R.id.btnmultiply)
    btnmodulus = findViewById(R.id.btmmode)
    btnadd = findViewById(R.id.btnadd)


    btnadd.setOnClickListener {
        var num = etnum1.text.toString().toInt()
        var num2 = etnum2.text.toString().toInt()
        calculateaddition(num, num2)
    }
    btnsubtract.setOnClickListener {
        var num = etnum1.text.toString().toInt()
        var num2 = etnum2.text.toString().toInt()
        calculatesubtracttio(num, num2)


    }
    btnmultiply.setOnClickListener {
        var num = etnum1.text.toString().toInt()
        var num2 = etnum2.text.toString().toInt()
        calculatemultiply(num, num2)
    }

    btnmodulus.setOnClickListener {
        var num = etnum1.text.toString().toInt()
        var num2 = etnum2.text.toString().toInt()
        calculatemodulus(num, num2)
    }
}

    fun calculatemultiply(num: Int, num2: Int) {
        var multi = num + num2
        tvanswer.text = multi.toString()
    }

    fun calculatesubtracttio(num: Int, num2: Int) {
        var subtraction = num + num2
        tvanswer.text = subtraction.toString()
    }

    fun calculateaddition(num: Int, num2: Int) {
        var addition = num + num2
        tvanswer.text = addition.toString()
    }



     fun calculatemodulus(num: Int, num2: Int) {
        var modu = num + num2
        tvanswer.text = modu.toString()

    }


}