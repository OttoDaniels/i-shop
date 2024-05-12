package com.app.dao;

import com.app.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ProductTypeDAO {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void storeNewProductType(ProductType productType) {
        jdbcTemplate.update("INSERT INTO product_types (product_type, count_in_stock) VALUES (?, ?)",
                productType.getProductType(), productType.getCountInStock());
    }
    public List<ProductType> getAllProductTypes(){
        RowMapper<ProductType>rowMapper=(rs,rowNumber) -> mapProductType(rs);
        return jdbcTemplate.query("SELECT * FROM product_types", rowMapper);
    }
    private ProductType mapProductType(ResultSet rs) throws SQLException {
        return new ProductType(
                rs.getLong("id"),
                rs.getString("product_type"),
                rs.getString("count_in_stock")
        );
    }
}
