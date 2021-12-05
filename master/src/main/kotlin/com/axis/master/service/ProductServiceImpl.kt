package com.axis.master.service
import com.axis.master.entity.Product
import com.axis.master.repository.IProductRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import java.util.*

@Service
class ProductServiceImpl :IProductService {

    @Autowired
    var iProductRepo: IProductRepo? = null

    @PostMapping("/addProduct")
    override fun addProduct(product: Product): Product {
        if (iProductRepo == null)
            print("HI")
        return iProductRepo!!.save(product)
    }

    @GetMapping("/getAllProduct")
    override fun getAllProduct(): MutableList<Product?> {
        print("HI")
        return iProductRepo!!.findAll()
    }

    @GetMapping("/getProductById/{id}")
    override fun getProductById(Id: String): Optional<Product?> {
        return iProductRepo!!.findById(Id)

    }


    @DeleteMapping("/deleteById/{id}")
    override fun deleteProduct(id: String): String {
        return if(iProductRepo!!.existsById(id))
        {
            iProductRepo!!.deleteById(id)
            "Product Backlog deleted"
        }
        else {
            "Backlog with id $id not found"
        }
    }

}