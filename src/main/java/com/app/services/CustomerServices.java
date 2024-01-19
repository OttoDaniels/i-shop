package com.app.services;

import com.app.dao.CustomerDAO;
import com.app.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //class belongs to services
public class CustomerServices {
    @Autowired
    private CustomerDAO customerDAO;

    public void saveCustomerData(Customer customer) {
        //field data validation needed here
        customerDAO.saveCustomer(customer);
    }
    public List<Customer>getAllCustomers(){
        return customerDAO.getAllCustomers();
    }
}
