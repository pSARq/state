package org.example3;

public class OrderDeliveredState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("El pedido ya ha sido entregado.");
    }

    @Override
    public void prev(Order order) {
        System.out.println("No se puede retroceder al estado anterior. Porque el pedido ya ha sido entregado.");
    }

    @Override
    public void printStatus() {
        System.out.println("El pedido ha sido entregado.");
    }
}