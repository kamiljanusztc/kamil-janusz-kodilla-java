package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

   public OrderRequest retrieve() {
       User user = new User("John", "Doe", 2231);
       Product product = new Product("Book", 22.22, 2);

       LocalDateTime orderPlacedTime = LocalDateTime.of(2022, 10, 20, 12, 20, 0);
       LocalDateTime deliveryTime = LocalDateTime.of(2022, 10, 23, 0, 0, 0);

       return new OrderRequest(user, product, orderPlacedTime, deliveryTime);
   }
}
