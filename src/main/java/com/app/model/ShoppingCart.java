package com.app.model;

import java.math.BigDecimal;

public class ShoppingCart {
    private long id;
    private int productsCount;
    private BigDecimal totalPrice;
    private long cartOwner;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getProductsCount() {
        return productsCount;
    }

    public void setProductsCount(int productsCount) {
        this.productsCount = productsCount;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }

    public long getCartOwner() {
        return cartOwner;
    }

    public void setCartOwner(long cartOwner) {
        this.cartOwner = cartOwner;
    }
}
