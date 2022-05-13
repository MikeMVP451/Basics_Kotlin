package com.example.basics_kotlin

import java.lang.Math.abs

fun main(){
    sayHello()
    newTopic("Argumentos")
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")

    newTopic("Infix")
    val c = -3
    println(c.enableAbs(true))
    println("$a + $c = ${sum(a,c.enableAbs(false))}")
    println("$a + $c = ${sum(a,c.enableAbs(true))}")

    newTopic("Sobrecarga")
    showProduct("Soda","10%")
    showProduct("Icecream","15%","5 de Julio")
    showProduct("Jelly Beans")
    showProduct(name = "Nerds", promo = "20%", validity = "30 de mayo")

}

private fun sayHello(): Unit {  //private means qeu solo se puede usar en este archivo el metodo y unit es equivalente a void
    println("Hi!")
}

fun sum(a:Int, b:Int): Int{
    return a+b
}

fun sub(a: Int,b: Int) = a -b //esta opcion tiene el return implicito sin embargo solo es conveniente para fun muy simples

infix fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this

fun showProduct(name: String, promo: String = "Sin promo", validity:String= "agotar existencias"){
    println("$name = $promo ;Hasta $validity")
}