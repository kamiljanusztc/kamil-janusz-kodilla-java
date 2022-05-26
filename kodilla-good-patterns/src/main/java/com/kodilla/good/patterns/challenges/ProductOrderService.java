package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {

    public boolean order(
            final User user,
            final Product product,
            final LocalDateTime orderPlacedTime,
            final LocalDateTime deliveryTime
    )
    {
        System.out.println(
                "Product for (user id): " + user.getAccountId() + ", " +
                "Product: " + product.productName + ", " +
                "Amount: " + product.getAmount() + ", " +
                "Order placed: " + orderPlacedTime + ", " +
                "Deadline: " + deliveryTime
        );

        return true;
    }
}
