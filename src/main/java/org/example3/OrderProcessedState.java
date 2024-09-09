package org.example3;

public class OrderProcessedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new OrderShippedState());
    }

    @Override
    public void prev(Order order) {
        order.setState(new OrderCreatedState());
    }

    @Override
    public void printStatus() {
        System.out.println("El pedido ha sido procesado.");
    }
}