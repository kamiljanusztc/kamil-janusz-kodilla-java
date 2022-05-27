package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public class OrderRequest {

    private Supplier supplier;
    private Product product;
    private LocalDateTime orderPlacedDate;
    private LocalDateTime deliveryDate;
    private boolean isOrderInStock;

    public OrderRequest(Supplier supplier, Product product, LocalDateTime orderPlacedDate, LocalDateTime deliveryDate, boolean isOrderInStock) {
        this.supplier = supplier;
        this.product = product;
        this.orderPlacedDate = orderPlacedDate;
        this.deliveryDate = deliveryDate;
        this.isOrderInStock = product.isProductInStock();
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderPlacedDate() {
        return orderPlacedDate;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public boolean isOrderInStock() {
        return isOrderInStock;
    }
}
