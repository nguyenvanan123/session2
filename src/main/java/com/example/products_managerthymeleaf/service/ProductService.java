package com.example.products_managerthymeleaf.service;

import com.example.products_managerthymeleaf.model.Product;
import com.example.products_managerthymeleaf.repository.ProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    @Autowired
    private ProductReponsitory productRepository;

    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }
    public void createProduct(Product product) {
        productRepository.createProduct(product);
    }
    public Product findById(int id) {
        return productRepository.get(id);
    }


}
