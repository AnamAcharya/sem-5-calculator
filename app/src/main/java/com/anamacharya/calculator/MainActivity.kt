package com.anamacharya.calculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var txtResult: TextView
    private lateinit var btnClear: TextView
    private lateinit var btnDelete: TextView
    private lateinit var btnPercent: TextView
    private lateinit var btnDivide: TextView
    private lateinit var btnInto: TextView
    private lateinit var btnMinus: TextView
    private lateinit var btnAdd: Button
    private lateinit var btnEquals: Button
    private lateinit var btnOne: Button
    private lateinit var btnTwo: Button
    private lateinit var btnThree: Button
    private lateinit var btnFour: Button
    private lateinit var btnFive: Button
    private lateinit var btnSix: Button
    private lateinit var btnSeven: Button
    private lateinit var btnEight: Button
    private lateinit var btnNine: Button
    private lateinit var btnZero: Button
    private lateinit var btnZeroZero: Button
    private lateinit var btnDot: Button
    private var value1 :Float = 0F;
    private var value2 :Float = 0F;
    private var sign : String = "="

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOne = findViewById(R.id.one)
        btnTwo = findViewById(R.id.two)
        btnThree= findViewById(R.id.three)
        btnFour= findViewById(R.id.four)
        btnFive= findViewById(R.id.five)
        btnSix= findViewById(R.id.six)
        btnSeven= findViewById(R.id.seven)
        btnEight= findViewById(R.id.eight)
        btnNine= findViewById(R.id.nine)
        btnZero= findViewById(R.id.zero)
        btnZeroZero= findViewById(R.id.zerozero)
        btnDot= findViewById(R.id.dot)

        txtResult = findViewById(R.id.result)
        btnClear= findViewById(R.id.clear)
        btnDelete= findViewById(R.id.delete)
        btnPercent= findViewById(R.id.percent)
        btnDivide= findViewById(R.id.divide)
        btnInto= findViewById(R.id.into)
        btnMinus= findViewById(R.id.minus)
        btnAdd= findViewById(R.id.plus)
        btnEquals=findViewById(R.id.equal)

        btnClear.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                txtResult.text = "0"
                sign = "="
                value1 = 0F
                value2 = 0F
            }
        })

        btnDelete.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "0"
                }else {
                    txtResult.text = txtResult.text.drop(1)
                }
            }
        })

        btnPercent.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                value1 = txtResult.text.toString().toFloat()
                sign = "%"
                txtResult.text = "0"
            }
        })

        btnDivide.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                value1 = txtResult.text.toString().toFloat()
                sign = "/"
                txtResult.text = "0"
            }
        })

        btnInto.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                value1 = txtResult.text.toString().toFloat()
                sign = "*"
                txtResult.text = "0"
            }
        })

        btnMinus.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                value1 = txtResult.text.toString().toFloat()
                sign = "-"
                txtResult.text = "0"
            }
        })

        btnAdd.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {

                value1 = txtResult.text.toString().toFloat()
                sign = "+"
                txtResult.text = "0"
            }
        })

        btnEquals.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                value2 = txtResult.text.toString().toFloat();
                when(sign){
                    "%"->{
                        value1 = value1 % value2;
                        txtResult.text = value1.toString();
                    }
                    "/"->{
                        value1 = value1 / value2;
                        txtResult.text = value1.toString();
                    }
                    "*"->{
                        value1 = value1 * value2;
                        txtResult.text = value1.toString();
                    }
                    "-"->{
                        value1 = value1 - value2;
                        txtResult.text = value1.toString();
                    }
                    "+"->{
                        value1 = value1 + value2;
                        txtResult.text = value1.toString()
                    }
                    "="->{
                        txtResult.text = value1.toString();
                    }

                }
                sign = "="
            }
        })

        btnOne.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "1"
                }else {
                    txtResult.text = txtResult.text.toString() + "1"
                }
            }
        })
        btnTwo.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "2"
                }else {
                    txtResult.text = txtResult.text.toString() + "2"
                }
            }
        })
        btnThree.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "3"
                }else {
                    txtResult.text = txtResult.text.toString() + "3"
                }
            }
        })
        btnFour.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "4"
                }else {
                    txtResult.text = txtResult.text.toString() + "4"
                }
            }
        })
        btnFive.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "5"
                }else {
                    txtResult.text = txtResult.text.toString() + "5"
                }
            }
        })
        btnSix.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "6"
                }else {
                    txtResult.text = txtResult.text.toString() + "6"
                }
            }
        })
        btnSeven.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "7"
                }else {
                    txtResult.text = txtResult.text.toString() + "7"
                }
            }
        })
        btnEight.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "8"
                }else {
                    txtResult.text = txtResult.text.toString() + "8"
                }
            }
        })
        btnNine.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "9"
                }else {
                    txtResult.text = txtResult.text.toString() + "9"
                }
            }
        })
        btnZero.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "0"
                }else {
                    txtResult.text = txtResult.text.toString() + "0"
                }
            }
        })
        btnZeroZero.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                if (txtResult.text == "0"){
                    txtResult.text = "0"
                }else {
                    txtResult.text = txtResult.text.toString() + "00"
                }
            }
        })
        btnDot.setOnClickListener(object: View.OnClickListener{
            override fun onClick(v: View?) {
                txtResult.text = txtResult.text.toString()+"."
            }
        })



    }
}