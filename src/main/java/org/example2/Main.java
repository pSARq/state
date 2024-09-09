package org.example2;

public class Main {
    public static void main(String[] args) {
        /*Simulación de una orden de compra en donde se incluyen permisos según el rol administrativo para realizar
        * una operación que cambie el estado de la orden*/
        User admin = new User("Usuario admin", "Admin");
        User client = new User("Usuario cliente", "Cliente");

        Order order = new Order();

        /*Usuario cliente intenta crear y procesar la orden pero falla al procesarla*/
        System.out.println("El cliente esta manejando la orden");
        order.handleOrder(client);
        order.handleOrder(client);
        System.out.println();

        /*Usuario admin si puede crear y procesar la orden*/
        System.out.println("El admin esta manejando la orden");
        order.handleOrder(admin);
        System.out.println();

        /*Usuario cliente ahora puede enviar la orden despues de haberla procesado el admin*/
        System.out.println("El cliente esta manejando la orden");
        order.handleOrder(client);
        System.out.println();
    }
}
