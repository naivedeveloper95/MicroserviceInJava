package com.satyam.productservice.Controller;

import com.satyam.productservice.Dto.ProductRequest;
import com.satyam.productservice.Dto.ProductResponse;
import com.satyam.productservice.Service.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
    }

    @RequestMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> fetchAllProducts() {
       return productService.getAllProduct();
    }
}
