package com.axis.master.service
import com.axis.master.entity.Product
import java.util.*

interface IProductService {
    fun addProduct(product: Product):Product
    fun getAllProduct(): MutableList<Product?>
    fun getProductById(Id: String): Optional<Product?>
    fun deleteProduct(id: String):String
}