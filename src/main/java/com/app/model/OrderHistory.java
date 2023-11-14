package com.app.model;

public class OrderHistory {
    private long id;
    private long shoppingCardId;
    private long customerId;
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getShoppingCardId() {
        return shoppingCardId;
    }

    public void setShoppingCardId(long shoppingCardId) {
        this.shoppingCardId = shoppingCardId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
