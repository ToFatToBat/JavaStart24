package com.example.demo.repository;

import com.example.demo.model.Product;

import java.util.List;

public class ProductRepository {
    private List<Product> products;

    public void add(Product product) {
        products.add(product);
    }
}
