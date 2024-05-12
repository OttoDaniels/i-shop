package com.app.services;

import com.app.dao.ProductDAO;
import com.app.dao.ProductTypeDAO;
import com.app.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices {
    @Autowired
    private ProductDAO productDAO;

    public void storeNewProduct (Product product) {
        productDAO.storeNewProduct(product);
    }
}
