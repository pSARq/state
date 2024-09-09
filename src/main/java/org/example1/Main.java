package org.example1;

public class Main {
    public static void main(String[] args) {
        /*Se crea objeto de la clase contexto sin estado*/
        Context context = new Context();

        /*Se le asigna el estado de iniciado*/
        StartedState startedState = new StartedState();
        startedState.doAction(context);

        /*Se le asigna el estado de detenido*/
        StoppedState stoppedState = new StoppedState();
        stoppedState.doAction(context);

        /*Aquí estoy manejando todos los estados de la misma clase (en un mismo main), pero se vería mejor
        * por ejemplo si se manejara desde una interfaz gráfica, en donde el mismo objeto puede variar de estado
        * dependiendo del botón que se presione */

    }
}