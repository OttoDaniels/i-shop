package com.app.controllers;

import com.app.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomersController {
    @Autowired
    private CustomerServices customerServices;

    @GetMapping("/allCustomers")
    public String getAllCustomersPage(Model model){
        model.addAttribute("customers", customerServices.getAllCustomers());
        return "allCustomers";
    }
}
