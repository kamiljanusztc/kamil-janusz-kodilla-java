package com.kodilla.good.patterns.food2door;

public class Product {

    private String productName;
    private int productAmount;
    private boolean isProductInStock;

    public Product(String productName, int productAmount, boolean isProductInStock) {
        this.productName = productName;
        this.productAmount = productAmount;
        this.isProductInStock = isProductInStock;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public boolean isProductInStock() {
        return isProductInStock;
    }
}
