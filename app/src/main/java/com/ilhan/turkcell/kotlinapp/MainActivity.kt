package com.ilhan.turkcell.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Örnek değişken
        var exampleVar = 5

        //Sayısal, Tamsayı (Int)
        var exampleInt : Int
        exampleInt = 7

        //Sayısal, Kesirli sayı (Float-Double)
        var exampleFloat : Float = 32.5f
        var exampleDouble : Double = 61.5

        //Metinsel (String)
        var exampleString : String = "Test"
        var exampleString2 : String = "Done"
        var mixedVar : String = exampleString + exampleString2

        //Mantıksal (Boolean)
        var exampleBoolean : Boolean //= true
        exampleBoolean = 3 < 5 //true döndürür
        //exampleBoolean = 3 > 5 //false döndürür

        //Logcat'a yazdırma
        println(exampleVar)
        println(exampleInt)
        println(exampleFloat)
        println(exampleDouble)
        println(exampleString + " " + exampleString2)
        println(mixedVar)
        println(exampleBoolean)

    }
}