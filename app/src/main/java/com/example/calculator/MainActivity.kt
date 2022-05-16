package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etFirstnum:EditText
    lateinit var etSecondnum:EditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus:Button
    lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etFirstnum=findViewById(R.id.etFirstnum)
        etSecondnum=findViewById(R.id.etSecondnum)
        btnAdd=findViewById(R.id.btnAdd)
        btnSubtract=findViewById(R.id.btnSubtract)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvResult=findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var num1=etFirstnum.text.toString().toDouble()
            var num2=etSecondnum.text.toString().toDouble()
            add(num1,num2)

            btnSubtract.setOnClickListener {
                var num1=etFirstnum.text.toString().toDouble()
                var num2=etSecondnum.text.toString().toDouble()
                subtract(num1,num2)
            }
            btnMultiply.setOnClickListener {
                var num1=etFirstnum.text.toString().toDouble()
                var num2=etSecondnum.text.toString().toDouble()
                multiply(num1,num2)
            }

            btnModulus.setOnClickListener {
                var num1=etFirstnum.text.toString().toDouble()
                var num2=etSecondnum.text.toString().toDouble()
                modulus(num1,num2)
            }
        }

    }
    fun add(num1:Double,num2:Double){
        var total=num1+num2
        tvResult.text=total.toString()
    }
    fun subtract(num1:Double,num2:Double){
        var total=num1-num2
        tvResult.text=total.toString()
    }

    fun multiply(num1:Double,num2:Double){
        var total=num1*num2
        tvResult.text=total.toString()
    }

    fun modulus(num1:Double,num2:Double){
        var total=num1%num2
        tvResult.text=total.toString()
    }
}