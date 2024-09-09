package org.example2;

public class OrderProcessedState implements OrderState {
    @Override
    public void handleOrder(Order order, User user) {
        if (user.getRol().equals("Admin")) {
            System.out.println("La orden esta siendo procesada por: " + user.getName());
            order.setState(new OrderShippedState());
            System.out.println("La orden está lista para ser enviada");
        } else {
            System.out.println("La orden no puede ser procesada por un usuario que no es administrador");
        }
    }
}
