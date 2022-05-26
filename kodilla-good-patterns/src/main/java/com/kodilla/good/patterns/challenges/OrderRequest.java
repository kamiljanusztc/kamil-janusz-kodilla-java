package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private Product product;
    private LocalDateTime orderPlacedTime;
    private LocalDateTime deliveryTime;

    public OrderRequest(User user, Product product, LocalDateTime orderPlacedTime, LocalDateTime deliveryTime) {
        this.user = user;
        this.product = product;
        this.orderPlacedTime = orderPlacedTime;
        this.deliveryTime = deliveryTime;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderPlacedTime() {
        return orderPlacedTime;
    }

    public LocalDateTime getDeliveryTime() {
        return deliveryTime;
    }
}
