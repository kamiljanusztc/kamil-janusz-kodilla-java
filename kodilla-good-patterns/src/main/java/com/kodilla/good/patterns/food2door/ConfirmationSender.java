package com.kodilla.good.patterns.food2door;

public class ConfirmationSender implements  InfoService {

    @Override
    public void sendConfirmation() {
        System.out.println("Order sent to Customer operation team!");
    }
}
