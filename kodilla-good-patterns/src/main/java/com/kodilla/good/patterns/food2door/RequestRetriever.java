package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class RequestRetriever {

    public OrderRequest retrieve() {
        Supplier supplier = new Supplier("ExtraFoodShop", "Warsaw", "Snacks");
        Product product = new Product("Protein super snack", 300, true);

        LocalDateTime orderPlacedDate = LocalDateTime.of(2022, 10, 20, 12, 20, 0);
        LocalDateTime deliveryDate = LocalDateTime.of(2022, 10, 23, 0, 0, 0);

        return new OrderRequest(supplier, product, orderPlacedDate, deliveryDate);
    }
}
