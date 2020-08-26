package com.example.demo.controller;


import com.example.demo.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    List<Product> products;

    @Autowired
    public ProductController(List<Product> products) {
        this.products = products;
    }

    @GetMapping ("/add")
    String getAddForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "/";


    }
}
