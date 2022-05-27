package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private InfoService infoService;
    private OrderManagement orderManagement;
    private OrderBase orderBase;

    public OrderProcessor(InfoService infoService, OrderManagement orderManagement, OrderBase orderBase) {
        this.infoService = infoService;
        this.orderManagement = orderManagement;
        this.orderBase = orderBase;
    }

    public ProductOrderDto process(final OrderRequest orderRequest) {

        boolean isOrderPlaced = orderManagement.order(
                orderRequest.getSupplier(),
                orderRequest.getProduct(),
                orderRequest.getOrderPlacedDate(),
                orderRequest.getDeliveryDate()
        );

        boolean isOrderInStock = orderRequest.isOrderInStock();

        if (isOrderPlaced && isOrderInStock) {
            infoService.sendConfirmation();
            orderBase.addToDB();
            return new ProductOrderDto(orderRequest.getSupplier(),
                    orderRequest.getProduct(), true);
        } else {
            System.out.println("Sorry! There is no product in stock");
            return new ProductOrderDto(orderRequest.getSupplier(),
                    orderRequest.getProduct(), false);
        }
    }
}
