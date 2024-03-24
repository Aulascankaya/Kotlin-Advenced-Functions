package com.ulas.kotlinadvancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private var myInt: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myInt?.let {
            val num = it+1
        }

        val myNum = myInt?.let {
            it+1
        }?:0


        //also

        val gece = Animal("gece",8)
        val boby = Animal("boby",11)
        val paki = Animal("paki",4)

        val animals = listOf<Animal>(gece,boby,paki)
        animals.filter { it.age >5 }.also {
            for (animal in it ){
                println(animal.name)
            }
        }


        //apply

        val intentWithApply = Intent().apply {
            putExtra("","")
        }

        //with
         Animal("zeytın",3).apply {
             name="gece"
         }.also {
             print(it.name)
         }

        val newZeytin = Animal("zeyın",3).apply {
            name ="gece"
        }
        println(newZeytin.name)


        val anotherZeytin = with(Animal("zeytın",3)){
            name = "gece"
        }
        println(anotherZeytin)

        val withZeytin = Animal("zeytın",3)

        with(withZeytin){
            name="gece"
            age=4
        }
        println(withZeytin.name)









    }
}

data class Animal(var name:String, var age: Int)