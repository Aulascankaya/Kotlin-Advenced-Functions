package com.ulas.kotlinadvancedfunctions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.LifecycleOwner

class KotlinDelegatesActivity() : AppCompatActivity(), LifecycleLogger by LifecycleLoggerImplementation (){


    //property delegayes
   private val myVariable by lazy {
       println("hello  this is a lazy imp.")
        10
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerLifecycleOwner(this)

        println(myVariable)

    }

}

interface LifecycleLogger {
    fun registerLifecycleOwner(owner : LifecycleOwner)
}
class  LifecycleLoggerImplementation: LifecycleLogger,LifecycleEventObserver{
    override fun registerLifecycleOwner(owner: LifecycleOwner) {
        owner.lifecycle.addObserver(this)
    }

    override fun onStateChanged(source: LifecycleOwner, event: Lifecycle.Event) {
        when (event){
            Lifecycle.Event.ON_RESUME -> println("onresume")
            Lifecycle.Event.ON_PAUSE -> println("onpause")
            Lifecycle.Event.ON_DESTROY -> println("onresume")
            else -> Unit
        }
    }

}

