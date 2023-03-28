package com.satyam.productservice.Repository;

import com.satyam.productservice.Model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
