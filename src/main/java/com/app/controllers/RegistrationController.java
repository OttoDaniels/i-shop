package com.app.controllers;

import com.app.model.Customer;
import com.app.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    @Autowired
    private CustomerServices customerServices;

    @GetMapping("/registration") //endpoint to GET registration form
    public String getRegistrationForm(Model model) {
        model.addAttribute("newCustomer", new Customer());
        return "registration";
    }

    @PostMapping("/registration")
    public String saveCustomer(@ModelAttribute Customer customer, Model model) {
        customerServices.saveCustomerData(customer);
        model.addAttribute("firstName", customer.getFirstName());
        model.addAttribute("lastName", customer.getLastName());
        return "successRegistration";
    }

}
