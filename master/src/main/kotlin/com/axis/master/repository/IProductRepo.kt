package com.axis.master.repository
import com.axis.master.entity.Product
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface IProductRepo : MongoRepository<Product, String> {
    override fun existsById(_id: String): Boolean
}