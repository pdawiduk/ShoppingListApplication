package com.example.shoppinglistapplication.model

import java.util.*

data class ListOfProducts(val nameOfList:String,
                          val productsList:MutableList<Product>,
                          val date: Date)