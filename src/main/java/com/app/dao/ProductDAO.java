package com.app.dao;

import com.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ProductDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewProduct(Product product) {
        jdbcTemplate.update("INSERT INTO products (label, color, description) VALUES (?, ?, ?)",
                product.getProductLabel(), product.getColor(), product.getProductDescription());
    }

    private Product mapProduct(ResultSet rs) throws SQLException {
        return new Product(
                rs.getLong("id"),
                rs.getString("productLabel"),
                rs.getString("color"),
                rs.getString("productDescription")
        );
    }
}
