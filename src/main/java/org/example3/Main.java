package org.example3;

public class Main {
    public static void main(String[] args) {
        /*Similar al ejemplo anterior pero esta vez como en un flujo, en el que puedo avanzar de estado o retroceder*/
        Order order = new Order();
        order.printStatus();

        order.next();
        order.printStatus();

        order.next();
        order.printStatus();

        order.prev();
        order.printStatus();

        order.next();
        order.printStatus();

        order.next();
        order.printStatus();

        order.prev();

    }
}
