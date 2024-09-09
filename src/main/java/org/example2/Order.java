package org.example2;

public class Order {
    private OrderState state;

    /*Se le puede dar un estado inicial. En este caso se define el constructor directamente
    * pero se le puede pasar como argumento para mayor flexibilidad*/
    public Order() {
        this.state = new OrderCreatedState();
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void handleOrder(User user) {
        state.handleOrder(this, user);
    }
}
