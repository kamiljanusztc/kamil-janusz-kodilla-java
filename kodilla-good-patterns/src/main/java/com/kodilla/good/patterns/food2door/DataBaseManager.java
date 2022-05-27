package com.kodilla.good.patterns.food2door;

public class DataBaseManager implements  OrderBase {


    @Override
    public void addToDB() {
        System.out.println("Order added to Data Base!");
    }
}
