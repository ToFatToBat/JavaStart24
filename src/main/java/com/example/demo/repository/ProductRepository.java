package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;

    public void add(Product product) {
        products.add(product);
    }
}
