package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    private List<Product> products;

    public ProductRepository() {
    products = new ArrayList<>();
    products.add(new Product("Komputer", 2000));
    products.add(new Product("Samochod", 120000));
    products.add(new Product("Zegarek", 600));

    }

    public void add(Product product) {
        products.add(product);
    }

    public ArrayList<Product> listAll() {
        return new ArrayList<>(products)    ;
    }

    public double priceSum () {
      return   products.stream()
                .mapToDouble(price -> price.getPrice())
                .sum();
    }
}
