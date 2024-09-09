package org.example1;

/*State es la interfaz de la cual se implementaran los diferentes estados. Puede haber uno o más métodos*/
public interface State {
    void doAction(Context context);
}
