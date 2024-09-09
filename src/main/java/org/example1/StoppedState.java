package org.example1;

public class StoppedState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("El sistema esta en estado detenido.");
        context.setState(this);
    }
}
