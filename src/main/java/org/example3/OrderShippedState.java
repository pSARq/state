package org.example3;

public class OrderShippedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new OrderDeliveredState());
    }

    @Override
    public void prev(Order order) {
        order.setState(new OrderProcessedState());
    }

    @Override
    public void printStatus() {
        System.out.println("El pedido ha sido enviado.");
    }
}