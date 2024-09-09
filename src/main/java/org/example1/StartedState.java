package org.example1;

/*Aquí va toda la logica referente al estado que le corresponde, en este caso es el estado de iniciar*/
public class StartedState implements State {
    /*Estas clases de estado normalmente si están acopladas a una clase en especifico (Principio SOLID #5, esta clase seria
    de bajo nivel), porque no siempre todas las clases manejan los mismos estados y aunque hayan varias que si, no siempre comparten
    * la misma logica, entonces hay que tener en cuenta muy bien si es que en determinado caso
    * vale la pena hacer una clase genérica o si hacerla muy específica para manejar el estado de una sola clase.
    * Lo mismo con la interfaz, se puede hacer una genérica pero no siempre todas manejan los mismos métodos.
    * Como por ejemplo un bombillo puede manejar los estados apagado y prendido de una forma, pero luego hay otra clase
    * que necesita manejar los estados borrador y publicado, entonces la misma interfaz no serviría*/
    @Override
    public void doAction(Context context) {
        System.out.println("El sistema esta en estado iniciado.");
        context.setState(this);
    }
}
