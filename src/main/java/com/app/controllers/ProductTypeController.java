package com.app.controllers;

import com.app.model.ProductType;
import com.app.services.ProductTypeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductTypeController {
    @Autowired
    private ProductTypeServices productTypeServices;

    @GetMapping("/new-product-type")
    public String getNewProductTypePage(Model model) {
        model.addAttribute("newProductType", new ProductType());
        return "newProductType";
    }

    @PostMapping("/new-product-type")
    public String storeNewProductType(@ModelAttribute ProductType productType) {
        productTypeServices.storeNewProductType(productType);
        return "redirect:/";
    }
}
