package com.kodilla.good.patterns.food2door;

public class Application {

    public static void main(String[] args) {
        RequestRetriever requestRetriever = new RequestRetriever();
        OrderRequest orderRequest = requestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
              new ConfirmationSender(), new OrderManager(), new DataBaseManager()
        );
        orderProcessor.process(orderRequest);
    }
}
