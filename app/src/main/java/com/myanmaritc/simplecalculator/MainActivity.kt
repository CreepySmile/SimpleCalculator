package com.myanmaritc.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.myanmaritc.simplecalculator.calculation.Calculation
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calVM = ViewModelProvider(this).get(Calculation::class.java)
        inputNumberOne.setText(calVM.getNum1())
        inputNumberTwo.setText(calVM.getNum2())

        btnSum.setOnClickListener {
            calVM.sum()
            txtResult.text = calVM.getResult().toString()
        }
        btnMinus.setOnClickListener {
            calVM.minus()
            txtResult.text = calVM.getResult().toString()
        }
        btnMulti.setOnClickListener {
            calVM.multi()
            txtResult.text = calVM.getResult().toString()
        }
        btnDiv.setOnClickListener {
            calVM.div()
            txtResult.text = calVM.getResult().toString()
        }
    }
}