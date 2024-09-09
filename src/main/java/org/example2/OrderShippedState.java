package org.example2;

public class OrderShippedState implements OrderState {
    @Override
    public void handleOrder(Order order, User user) {
        System.out.println("La orden ha sido enviada por: " + user.getName());
    }
}
