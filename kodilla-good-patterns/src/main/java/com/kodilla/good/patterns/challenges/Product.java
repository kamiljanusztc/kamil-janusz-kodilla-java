package com.kodilla.good.patterns.challenges;

public class Product {

    String productName;
    double cost;
    int amount;

    public Product(String productName, double cost, int amount) {
        this.productName = productName;
        this.cost = cost;
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public double getCost() {
        return cost;
    }

    public int getAmount() {
        return amount;
    }
}
