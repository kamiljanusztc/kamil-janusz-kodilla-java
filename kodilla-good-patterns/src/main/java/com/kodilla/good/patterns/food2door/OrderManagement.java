package com.kodilla.good.patterns.food2door;

import java.time.LocalDateTime;

public interface OrderManagement {

    boolean order(Supplier supplier, Product product, LocalDateTime orderPlacedDate, LocalDateTime deliveryDate);
}
