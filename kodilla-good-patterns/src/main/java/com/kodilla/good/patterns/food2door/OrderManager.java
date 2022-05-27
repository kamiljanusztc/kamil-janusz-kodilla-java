package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderManager implements  OrderManagement {
    @Override
    public boolean order(Supplier supplier, Product product, LocalDateTime orderPlacedDate, LocalDateTime deliveryDate) {

        System.out.println(
                "Supplier: " + supplier.getName() + ", " +
                "Location: " + supplier.getLocation() + ", " +
                "Product type: " + supplier.getProductType() + ", " +
                "Product: " + product.getProductName() + ", " +
                "Amount: " + product.getProductAmount() + ", " +
                "Order placed: " + orderPlacedDate + ", " +
                "Deadline: " + deliveryDate
        );

        return true;
    }
}
