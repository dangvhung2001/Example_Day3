package com.example.example_trainningday3.service;

import com.example.example_trainningday3.model.Product;
import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product save(Product product);
}
