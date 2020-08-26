package com.example.demo.controller;


import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    private ProductRepository productRepository;

    @Autowired
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @GetMapping("/add")
    String getAddForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "/";
    }

    @PostMapping("add")
    void add(Product product) {
        productRepository.add(product);
    }
}
