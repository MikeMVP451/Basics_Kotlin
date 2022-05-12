package com.example.basics_kotlin

fun main(){
    sayHello()
    newTopic("Argumentos")
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")
}

private fun sayHello(): Unit {  //private means qeu solo se puede usar en este archivo el metodo y unit es equivalente a void
    println("Hi!")
}

fun sum(a:Int, b:Int): Int{
    return a+b
}

fun sub(a: Int,b: Int) = a -b //esta opcion tiene el return implicito sin embargo solo es conveniente para fun muy simples