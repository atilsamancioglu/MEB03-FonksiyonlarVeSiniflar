package com.atilsamancioglu.fonksiyonlarvesiniflar

class Karakter(var isim:String,var yas:Int,var meslek:String) {

    private var sacRengi = "Sarı"

    /*
    //Setter
    fun sacRengiDegistir(){
        this.sacRengi = "Sarı"
    }

     */
    //Getter
    fun sacRenginiAl():String {
        return this.sacRengi
    }

    //Access Levels - Erişebilirlik Seviyeleri

    //private - protected - internal - public

    //Primary Constructor

    /*
    //Property
    var isim = ""
    var yas = 0
    var meslek = ""

    //Constructor

    constructor(isimGirdisi:String,yasGirdisi:Int,meslekGirdisi:String){
        this.isim = isimGirdisi
        this.yas = yasGirdisi
        this.meslek = meslekGirdisi
    }

     */

}