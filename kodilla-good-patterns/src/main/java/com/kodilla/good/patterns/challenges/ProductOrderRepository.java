package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository {

    @Override
    public void createOrder(User user, Product product, LocalDateTime orderPlacedTime, LocalDateTime deliveryTime) {
        System.out.println("Product order service");
    }
}
