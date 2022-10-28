package com.ilhan.turkcell.kotlinapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Veri dizileri
        var exampleSet1 = arrayOf("value1","value2",3,4)
        var exampleSet2 = intArrayOf(3,7,2,1,4)

        println(exampleSet1[1])
        println(exampleSet2.get(2))

        exampleSet1[0] = "valueNew1"
        println(exampleSet1[0])

        exampleSet1.set(1,"valueNew2")
        println(exampleSet1[1])

    }
}