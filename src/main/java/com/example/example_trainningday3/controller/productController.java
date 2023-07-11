package com.example.example_trainningday3.controller;

import lombok.RequiredArgsConstructor;
import com.example.example_trainningday3.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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

}
