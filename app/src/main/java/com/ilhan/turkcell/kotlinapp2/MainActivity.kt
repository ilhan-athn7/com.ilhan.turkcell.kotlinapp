package com.ilhan.turkcell.kotlinapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
        //Veri dizileri
        var exampleSet1 = arrayOf("value1","value2",3,4)
        var exampleSet2 = intArrayOf(3,7,2,1,4)

        println(exampleSet1[1])
        println(exampleSet2.get(2))

        exampleSet1[0] = "valueNew1"
        println(exampleSet1[0])

        exampleSet1.set(1,"valueNew2")
        println(exampleSet1[1])
*/

        //Sonradan veri girilebilen diziler
        var exampleSet3 = arrayListOf<String>()
        exampleSet3.add("value1")
        exampleSet3.add("value2")
        println(exampleSet3.get(0))

        exampleSet3.add(0,"value3")
        println(exampleSet3.get(0))

    }
}