package org.example3;

public class OrderCreatedState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new OrderProcessedState());
    }

    @Override
    public void prev(Order order) {
        System.out.println("El pedido ya está en su estado inicial.");
    }

    @Override
    public void printStatus() {
        System.out.println("El pedido ha sido creado.");
    }
}