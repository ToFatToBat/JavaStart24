package com.example.demo.controller;


import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProductController {
    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping
    String getAddForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return"index";
    }

    @PostMapping("/add")
    String add(Product product) {
        productRepository.add(product);
        return "index";
    }

    @GetMapping("/lista")
    String list(Model model) {
        double priceSum = productRepository.priceSum();
        List<Product> products = productRepository.listAll();
        model.addAttribute("products",products);
        model.addAttribute("priceSum", priceSum);
        return "productList";
    }

    @GetMapping("/table")
    String table(Model model) {
        double priceSum = productRepository.priceSum();
        List<Product> productsList = productRepository.listAll();
        model.addAttribute("productTable", productsList);
        model.addAttribute("priceSum", priceSum);
        return "productTable";
    }
}
