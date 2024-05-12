package com.app.dao;

import com.app.model.Customer;
import org.apache.catalina.User;
import org.apache.catalina.util.CustomObjectInputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository //annotation says - do an action with database
public class CustomerDAO {
    @Autowired //insert data to database
    private JdbcTemplate jdbcTemplate;

    public void saveCustomer(Customer customer) {
        jdbcTemplate.update("INSERT INTO customers (first_name, last_name, email, phone_number, password) " + "VALUES (?, ?, ? ,?, ?)",
                customer.getFirstName(), customer.getLastName(), customer.getEmail(), customer.getPhoneNumber(), customer.getPassword());
    }

    public List<Customer> getAllCustomers() {
        RowMapper<Customer> rowMapper = (rs, rowNumber) -> mapCustomer(rs);
        return jdbcTemplate.query("SELECT * FROM customers", rowMapper);
    }

    public List<Customer> getCustomerByEmail(String email) {
        RowMapper<Customer> rowMapper = (rs, rowNumber) -> mapCustomer(rs);
        return jdbcTemplate.query("SELECT * FROM customers WHERE email = ?", rowMapper, email);
    }

    private Customer mapCustomer(ResultSet rs) throws SQLException {
        Customer customer = new Customer();

        customer.setId(rs.getLong("id"));
        customer.setFirstName(rs.getString("first_name"));
        customer.setLastName(rs.getString("last_name"));
        customer.setPassword(rs.getString("password"));
        customer.setEmail(rs.getString("email"));
        customer.setPhoneNumber(rs.getString("phone_number"));

        return customer;
    }
}
