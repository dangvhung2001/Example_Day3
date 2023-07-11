package com.example.example_trainningday3.controller;

import lombok.RequiredArgsConstructor;
import com.example.example_trainningday3.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.example_trainningday3.service.ProductServiceIMPL;
import java.util.List;
import javax.inject.Inject;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class productController {
    @Inject
    private ProductServiceIMPL productServiceIMPL;

    @GetMapping
    public List<Product> findAll(){
       return productServiceIMPL.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<?> addEmployee(@RequestBody Product product) {
        Product newProduct = Product.builder()
                .name(product.getName())
                .quantity(product.getQuantity())
                .build();
        Product savedProduct = productServiceIMPL.save(newProduct);
        if (savedProduct != null) {
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>("Failed to create book", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
