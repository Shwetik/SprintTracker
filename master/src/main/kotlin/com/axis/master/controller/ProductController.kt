package com.axis.master.controller

import com.axis.master.entity.Product
import com.axis.master.service.IProductService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/master")
class ProductController {


    @Autowired
    var iProductService: IProductService? = null

    @PostMapping("/addProduct")
    fun addProduct(@RequestBody product: Product): ResponseEntity<Any?> {
        print(product)
        var addProduct = iProductService!!.addProduct(product)
        return ResponseEntity(addProduct, HttpStatus.OK)
    }

    @GetMapping("/getAllProduct")
    fun getAllProduct(): ResponseEntity<MutableList<Product?>>
    {
        var product = iProductService!!.getAllProduct()
        return ResponseEntity(product, HttpStatus.OK)
    }

    @GetMapping("/getProductById/{id}")
    fun getProductById(@PathVariable id:String): ResponseEntity<Optional<Product?>> {
        var productDetails = iProductService!!.getProductById(id)
        return ResponseEntity(productDetails, HttpStatus.OK)
    }

    @DeleteMapping("/deleteProduct/{id}")
    fun deleteProduct(@PathVariable id: String):ResponseEntity<String?>
    {
        var deleteProduct = iProductService!!.deleteProduct(id)
        return ResponseEntity(deleteProduct,HttpStatus.OK)
    }
}