package com.app.security;

import com.app.dao.CustomerDAO;
import com.app.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private CustomerDAO customerDAO;

    @Override
    public UserDetails loadUserByUsername(String username) {
        List<Customer> customers = customerDAO.getCustomerByEmail(username);

        if (customers.isEmpty()) {
            throw new UsernameNotFoundException("Customer " + username + " not found!");
        }
        return new CustomUserDetails(customers.get(0));
    }

}
