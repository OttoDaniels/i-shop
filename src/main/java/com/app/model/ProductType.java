package com.app.model;

public class ProductType {
    private long id;
    private String productType;
    private String productBrand;
    private String productDescription;
    private long countInStock;
    private int timesBought;

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

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public int getTimesBought() {
        return timesBought;
    }

    public void setTimesBought(int timesBought) {
        this.timesBought = timesBought;
    }
}
