package com.myanmaritc.simplecalculator.calculation

import androidx.lifecycle.ViewModel

class Calculation: ViewModel() {
    private var result : Int = 0
    private var num1 :Int = 0
    private var num2 :Int =0
    fun getNum1() : Int = num1

    fun getNum2() : Int = num2
    fun getResult() : Int = result

    fun sum(): Int {
        result = getNum1() + getNum2()
        return result
    }
    fun minus(): Int{
        result = getNum1() - getNum2()
        return result
    }
    fun multi(): Int{
        result = getNum1() * getNum2()
        return result
    }
    fun div() :Int{
        result = getNum1() / getNum2()
        return result
    }


}