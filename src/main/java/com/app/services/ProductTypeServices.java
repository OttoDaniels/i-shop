package com.app.services;

import com.app.dao.ProductTypeDAO;
import com.app.model.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductTypeServices {
    @Autowired
    private ProductTypeDAO productTypeDAO;

    public void storeNewProductType(ProductType productType){
        productTypeDAO.storeNewProductType(productType);
    }

    public List<ProductType>getAllProductTypes(){
        return productTypeDAO.getAllProductTypes();
    }
}
