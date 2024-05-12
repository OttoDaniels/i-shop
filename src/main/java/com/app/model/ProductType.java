package com.app.model;

public class ProductType {
    private long id;
    private String productType;
    private long countInStock;

    public ProductType(long id, String product_type, String count_in_stock) {
    }
    public ProductType(){};

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public long getCountInStock() {
        return countInStock;
    }

    public void setCountInStock(long count) {
        this.countInStock = count;
    }

}
