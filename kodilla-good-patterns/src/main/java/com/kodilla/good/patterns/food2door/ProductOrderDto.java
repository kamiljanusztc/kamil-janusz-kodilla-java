package com.kodilla.good.patterns.food2door;

public class ProductOrderDto {

    private Supplier supplier;
    private Product product;
    boolean isOrderPlaced;

    public ProductOrderDto(Supplier supplier, Product product, boolean isOrderPlaced) {
        this.supplier = supplier;
        this.product = product;
        this.isOrderPlaced = isOrderPlaced;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public boolean isProductPlaced() {
        return isOrderPlaced;
    }
}
