package com.app.controllers;

import com.app.services.ProductTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @Autowired
    private ProductTypeServices productTypeServices;
    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("productTypes", productTypeServices.getAllProductTypes());
        return "homePage";
    }
}
