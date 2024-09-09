package org.example3;

public class Order {
    private OrderState state;

    public Order() {
        state = new OrderCreatedState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void next() {
        state.next(this);
    }

    public void prev() {
        state.prev(this);
    }

    public void printStatus() {
        state.printStatus();
    }
}