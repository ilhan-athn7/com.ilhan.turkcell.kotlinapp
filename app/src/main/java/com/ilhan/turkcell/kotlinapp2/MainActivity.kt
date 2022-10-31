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

/*
        //Sonradan veri girilebilen diziler
        var exampleSet3 = arrayListOf<String>()
        exampleSet3.add("value1")
        exampleSet3.add("value2")
        println(exampleSet3.get(0))

        exampleSet3.add(0,"value3")
        println(exampleSet3.get(0))
*/

/*
        //Veri dizilerinde filtreleme
        var exampleSet4 = arrayListOf<String>()
        exampleSet4.add("value1")
        exampleSet4.add("value2")
        exampleSet4.add("randomValue")

        var filter1 = exampleSet4.filter { it.startsWith("value") }
        println(filter1.toString())  //"value" ile başlayan verileri logcat'e yazdırır

        var filter2 = exampleSet4.filter { it.length > 6 }
        println(filter2.toString()) //Karakter sayısı 6'dan uzun olan verileri logcat'e yazdırır
*/

/*
        //Veri dizisindeki verileri ayrı ayrı kullanma
        var topOyunları = arrayListOf<String>()
        topOyunları.add("Voleybol")
        topOyunları.add("Basketbol")
        topOyunları.add("Futbol")
        topOyunları.add("Hentbol")

        for (ogeler in topOyunları)
        {
            println(topOyunları.indexOf(ogeler).toString() + " " + ogeler)
        }
*/

/*
        //Veri tekrarı olmayan veri dizileri (setOf kullanımı)
        var exampleSet5 = setOf<Int>(1,2,6,3,2,1,5,3)
        println("Eleman sayısı:" + exampleSet5.size.toString())

        exampleSet5.forEach {
            println(it)
        }
*/

/*
        //Sonradan veri girilebilen ve veri tekrarı olmayan veri dizileri (HashSet kullanımı)
        var exampleSet6 = HashSet<Int>()
        exampleSet6.add(1)
        exampleSet6.add(2)
        exampleSet6.add(6)
        exampleSet6.add(3)
        exampleSet6.add(2)
        exampleSet6.add(1)
        exampleSet6.add(5)
        exampleSet6.add(3)

        println("Eleman sayısı:" + exampleSet6.size.toString())

        exampleSet6.forEach {
            println(it)
        }
*/

        //Aynı anda iki veri dizisinden değer alıp logcat'e yazdırma
        var kisiler = arrayOf("Ahmet","Ali","Hüseyin","İsmail")
        var kisiler_yas = arrayOf(22,23,20,19)
        println("${kisiler[0]} , ${kisiler_yas[0]}")            //"${}" ile string veri içerisinde fonksiyonun döndüreceği deüer dahil edilebilir.

        //İki veriyi ilişkilendirerek kullanma (hashMapOf kullanımı)
        var kisi_yas = hashMapOf<String,Int>()

        for (i in 0..kisiler_yas.size-1 )
        {
            kisi_yas.put(kisiler.get(i),kisiler_yas.get(i))
        }

        println(kisi_yas.get("İsmail"))
        kisi_yas["İsmail"] = 25
        println(kisi_yas["İsmail"])

        //İki veriyi ilişkilendirerek kullanma (hashMapOf kullanımı) (Farklı sözdizimi)
        var kisi_yas2 = hashMapOf<String,Int>("Ahmet" to 22, "Ali" to 23, "Hüseyin" to 20, "İsmail" to 19)

        kisi_yas2.forEach{
            println("${it.key} : ${it.value}")
        }

        //İlişkili verileri filtreleyerek logcat'e yazdırma
        var kisi_yas2_filtered = kisi_yas2.filter {
            it.value < 21
            //println("${it.key} : ${it.value}")
        }

        kisi_yas2_filtered.forEach{
            println("anan ${it.key} : ${it.value}")
        }

    }
}