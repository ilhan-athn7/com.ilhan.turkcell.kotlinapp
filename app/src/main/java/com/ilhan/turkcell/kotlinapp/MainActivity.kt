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

/*
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
*/

/*
        //Pair özelliği
        var (a,b) = Pair(3,3.14)
        println(a);println(b)

        //Nullability özelliği
        var sayi6 : Int? = null
        println(sayi6)      //null döndürür

        sayi6 = 14
        var sayi7 = sayi6 * 2
        println(sayi7)
            //"!!" kullanımı derleyiciye "sayi6" değişkeninin null olduğu durumu görmezden gelmesini söyler.
*/

/*
        //if else kullanımı
        var sayi8 = 35
        if (sayi8 > 40){
            println("40\'tan Büyük")
        }
        else if (sayi8 < 60){
            println("60\'tan Küçük ve 40'tan Büyük")
        }
        else{
            println("60\'tan Büyük")
        }
*/

/*
        var sayi9 = 24
        when (sayi9)
        {
            24 -> println("24\'e eşit\'")
            in 54..74 ->
            {
                println("54 ile 74 arasında")
            }
            !in 54..74 ->
            {
                println("54 ile 74 arasında değil")
            }
        }
*/

/*
        var sayi10 = 0
        while (sayi10 < 10)
        {
            sayi10++
            println(sayi10)
        }

        var sayi11 = 0
        do {
            sayi11++
            println(sayi11)
        }
        while(sayi11 < 10)
*/

/*
        for (i in 1..10)
        {
            println(i)
        }
*/

/*
        for (i in 1..10)
        {
            if(i >= 5)
            {
                continue
                //Döngü içerisinde kendisinden sonraki kodların çalıştırılmadan döngünün devam etmesini sağlar.
            }
            println(i)
        }

        for (i in 1..10)
        {
            if(i == 5)
            {
                break
                //Döngüyü sonlandırır.
            }
            println(i)
        }
*/

        cycle1@for (i in 1..10)
        {
            cycle2@for (j in 1..10)
            {
                println(j.toString() + "+")
                if(j >= 5)
                {
                    break@cycle1
                    //"@" kullanılarak döngüler isimlendirildi ve "break" fonksiyonuna hangi döngüden çıkılacağı belirtildi.
                    //"break" fonksiyonu cycle1 döngüsünü sonlandırmasaydı cycle2 döngüsü 10 kez çalıştırılacaktı.
                }
            }
        }

    }
}