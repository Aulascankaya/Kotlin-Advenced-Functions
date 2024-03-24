package com.ulas.kotlinadvancedfunctions

fun main(){
    val myNumList = listOf<Int>(1,3,5,7,9,11,13,15)


    //Filter

    /*val smallNumberList =myNumList.filter { num -> num <6 }
    for(num in smallNumberList){
        println(num)
    }

     */

    val smallNumberList =myNumList.filter {it < 6}
    for(num in smallNumberList){
        println(num)
    }
    //map

   val  mySquaredNumbers = myNumList.map { it*it }
    for(num in mySquaredNumbers){
        println(num)
    }


    val filterMap = myNumList.filter { it<6 }.map { it*it }
    for (num in filterMap){
        println(num)
    }

    val coopers = listOf<Cooper>(
        Cooper("Georgie",17,"salesman"),
        Cooper("Sheldon",13,"scientist"),
        Cooper("Missy",13,"student"),
        Cooper("Marry",34,"Baptist"),
        Cooper("George",42,"Coach")
    )

    val youngCoopersJob = coopers.filter { it.age<20 }.map {it.Job }

    for(element in youngCoopersJob){
        println(element)
    }


    }



data class Cooper(val name: String , val age : Int , val Job : String)