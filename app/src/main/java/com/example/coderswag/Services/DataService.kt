package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataService {
    val categories = listOfNotNull(
        Category("SHIRTS", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOfNotNull(
        Product("Devslopes Graphic Beanie", "18€", "hat1"),
        Product("Devslopes Hat Black", "15€", "hat2"),
        Product("Devslopes Hat White", "13€", "hat3"),
        Product("Devslopes Devslopes Hat Snapback", "14€", "hat4")
    )

    val hoodies = listOfNotNull(
        Product("Devslopes Hoodie Gray", "35€", "hoodie1"),
        Product("Devslopes Hoodie Red", "37€", "hoodie1"),
        Product("Devslopes Hoodie Gray Version 2", "40€", "hoodie1"),
        Product("Devslopes Hoodie Black Version 2", "35€", "hoodie1")
    )

    val shirts = listOfNotNull(
        Product("Devslopes Shirt Black", "18€", "shirt1"),
        Product("Devslopes Shirt Light Gray", "19€", "shirt2"),
        Product("Devslopes Shirt Red", "14€", "shirt3"),
        Product("Devslopes Shirt Hustle", "10€", "shirt4"),
        Product("Devslopes Shirt Kickflip", "18€", "shirt5")
    )
}