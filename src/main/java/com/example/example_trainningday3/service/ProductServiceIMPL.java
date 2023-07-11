package com.example.example_trainningday3.service;

import com.example.example_trainningday3.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.example.example_trainningday3.repository.IProductRepository;
import javax.inject.Inject;

import java.util.List;

@Service
@Component
public class ProductServiceIMPL implements IProductService{
    @Inject
    private IProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
}
