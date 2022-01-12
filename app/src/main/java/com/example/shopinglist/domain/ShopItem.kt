package com.example.shopinglist.domain

data class ShopItem(

    val name: String,

    val count:Int,

    val enable: Boolean,

    var id:Int=UNDEFINED_id
){
    companion object{
        const val UNDEFINED_id=-1
    }
}
