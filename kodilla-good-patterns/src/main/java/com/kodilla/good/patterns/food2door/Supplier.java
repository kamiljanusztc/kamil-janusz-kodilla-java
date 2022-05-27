package com.kodilla.good.patterns.food2door;

public class Supplier {

    private String name;
    private String location;
    private String productType;

    public Supplier(String name, String location, String productType) {
        this.name = name;
        this.location = location;
        this.productType = productType;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getProductType() {
        return productType;
    }
}
