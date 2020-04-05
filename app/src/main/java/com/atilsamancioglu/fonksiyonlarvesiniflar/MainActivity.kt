package com.atilsamancioglu.fonksiyonlarvesiniflar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        birinciFonksiyon()

        //Unit, Void
        //toplama(5,9)
        val sonuc = carpma(5,9)
        textView.text = "Sonuç: ${sonuc}"


        button.setOnClickListener {
            val carSonucu = carpma(10,10)
            textView.text = "Sonuç: ${carSonucu}"
        }

        karakterOlustur()
        nullGuvenligi()

    }

    fun birinciFonksiyon(){
        println("birinci fonksiyon çalıştırıldı")
    }

    //Girdi Almak, Parametre
    fun toplama(a:Int, b:Int) {
        textView.text = "Sonuç: ${a+b}"
    }

    //Çıktı, Return -> Döndürmek

    fun carpma(x: Int, y: Int):Int {
        //textView.text = "Sonuç: ${x*y}"
        return x * y
    }

    /*
    fun degistir(view: View){
        val carpmaSonucu = carpma(10,20)
        textView.text = "Sonuç: ${carpmaSonucu}"
    }

     */

    fun karakterOlustur() {

        //Obje, Object & Instance
        var homer = Karakter("Homer Simpson",50,"Nükleer Güvenlik")
        var homerSacRengi = homer.sacRenginiAl()
        println(homerSacRengi)

    }

    fun nullGuvenligi() {

        //Nullability & Null Safety & Null Güvenliği
        // null & non-null

        var benimString : String? = null
        println(benimString)

        var benimYasim : Int? = null

        //1
        if (benimYasim != null) {
            println(benimYasim*10)
        } else {
            println("null")
        }

        //2
        // !! -> null olmayacak, ? -> null olabilir
        println(benimYasim?.compareTo(40))

        //3
        //elvis operatörü

        val benimSonucum = benimYasim?.compareTo(2) ?: -40
        println(benimSonucum)

        //4
        //let
        benimYasim = 40
        benimYasim?.let {
            println(it * 10)
        }

    }

}