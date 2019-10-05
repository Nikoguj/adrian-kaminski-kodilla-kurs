package com.kodilla.good.patterns.Food2Door;

public class Order {
    private int productCount;
    private String productName;

    public Order(int productCount, String productName) {
        this.productCount = productCount;
        this.productName = productName;
    }

    public int getProductCount() {
        return productCount;
    }

    public String getProductName() {
        return productName;
    }
}
