package com.app.controllers;

import com.app.model.Product;
import com.app.services.ProductServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @Autowired
    private ProductServices productServices;

    @GetMapping("/new-product")
    public String getNewProductPage(Model model) {
        model.addAttribute("newProduct", new Product());
        return "/newProduct";
    }

    @PostMapping("/new-product")
    public String storeNewProduct(@ModelAttribute Product product) {
        productServices.storeNewProduct(product);
        return "redirect:/";
    }

}
