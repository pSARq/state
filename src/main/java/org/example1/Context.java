package org.example1;

/*Context es la clase que contiene multiples estados entre los cuales se puede intercambiar*/
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
