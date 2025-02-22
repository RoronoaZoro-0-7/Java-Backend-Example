package com.example.react.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.react.model.Product;
import com.example.react.repository.ProductRepository;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }
    public void addProduct(Product product) {
        productRepository.save(product);
    }
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);   
    }
}
