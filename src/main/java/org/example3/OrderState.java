package org.example3;

public interface OrderState {
    void next(Order order);
    void prev(Order order);
    void printStatus();
}
