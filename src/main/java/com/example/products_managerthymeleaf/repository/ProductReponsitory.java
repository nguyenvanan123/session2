package com.example.products_managerthymeleaf.repository;

import com.example.products_managerthymeleaf.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductReponsitory {
    List<Product> listProducts = new ArrayList<> ();

    public ProductReponsitory() {
        Product product1 = new Product("iphone 13", "details iphone 13", 15);
        Product product2 = new Product("iphone 14", "details iphone 14", 16);
        Product product3 = new Product("iphone 15", "details iphone 15", 17);

        listProducts.add(product1);
        listProducts.add(product2);
        listProducts.add(product3);
    }

    public List<Product> getAllProducts () {
        return listProducts;
    }

    public void createProduct ( Product product ) {
        listProducts.add(product);
    }

    public Product get ( int id ) {
        return listProducts.get(id);
    }

    public void remove ( int id ) {
        listProducts.remove(id);
    }
}
