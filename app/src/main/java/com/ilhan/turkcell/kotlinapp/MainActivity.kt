package com.ilhan.turkcell.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

/*
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
*/

/*
        //Aritmetik işlemler
        var sayi1 : Int = 24
        var sayi2 : Int = 12
        var sayiTopla : Int = sayi1 + sayi2 //Toplama
        var sayiCikar : Int = sayi1 - sayi2 //Çıkarma
        var sayiBol : Int = sayi1 / sayi2   //Bölme
        var sayiCarp : Int = sayi1 * sayi2  //Çarpma
        var sayiMod : Int = sayi1 % sayi2   //Kalan bulma

        println(sayiTopla)
        println(sayiCikar)
        println(sayiBol)
        println(sayiCarp)
        println(sayiMod)

        sayi1 ++            //Değişkeni bir arttırır
        println(sayi1)

        sayi2 --            //Değişkeni bir azaltır
        println(sayi2)
*/

/*
        //Mantıksal İşlemler
        var example1 : Boolean = 3 < 5
        println("İşlem 1 (<)");
        println(example1)   //True döndürür

        example1 = 3 <= 5
        println("İşlem 2 (<=)");
        println(example1)  //True döndürür

        example1 = 5 <= 5
        println("İşlem 3 (<=)");
        println(example1)  //True döndürür

        example1 = 5 == 5
        println("İşlem 4 (==)");
        println(example1)  //True döndürür

        example1 = 5 != 5
        println("İşlem 5 (!=)");
        println(example1)  //False döndürür

        var example2 = 2 > 1 && example1
        println("İşlem 6 (&&)");
        println(example2)  //False döndürür

        example2 = 2 > 1 || example1
        println("İşlem 7 (||)");
        println(example2)  //True döndürür
*/

        //Veri tipi dönüştürme
        var sayi3 : Int = 10
        var sayi4 : Int = 3
        println(sayi3.toFloat() / sayi4)
            // Int veri tipi Float veri tipine dönüştürüldü ve sonuçun ondalıklı olması sağlandı.

        var metin1 = "37"
        //var metin1 = "37.23"  //Ondalıklı olduğu için dönüşüm gerçekleşemez.
        //var metin1 = "test"   //String veri olduğu için dönüşüm gerekleşemez.
        var sayi5 = metin1.toInt()
        println(sayi5)
            // String veri tipi Int veri tipine dönüştürüldü.

    }
}