package org.example2;

public class OrderCreatedState implements OrderState {
    @Override
    public void handleOrder(Order order, User user) {
        System.out.println("La orden ha sido creada por: " + user.getName());
        order.setState(new OrderProcessedState());
        System.out.println("La orden está lista para ser procesada");
    }
}
