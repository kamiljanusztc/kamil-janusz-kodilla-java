package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class RequestRetriever {

    public OrderRequest retrieve() {
        HealthyShop healthyShop = new HealthyShop();
        Supplier supplier = new Supplier(healthyShop.getName(), healthyShop.getLocation(), healthyShop.getProductType());
        Product product = new Product(healthyShop.getProductName(), healthyShop.getAmount(), healthyShop.isProductsInStock());

        LocalDateTime orderPlacedDate = LocalDateTime.of(2022, 10, 20, 12, 20, 0);
        LocalDateTime deliveryDate = LocalDateTime.of(2022, 10, 23, 0, 0, 0);

        Boolean isOrderInStock = healthyShop.isProductsInStock();

        return new OrderRequest(supplier, product, orderPlacedDate, deliveryDate, isOrderInStock);
    }
}
