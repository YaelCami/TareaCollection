package co.edu.uniquindio.poo.tareacollection.collection.sextoEjercicio;

import java.util.LinkedList;

/* 7- En un banco, el sistema de atención al cliente debe manejar los turnos de manera ordenada. Para lograrlo, se empleará una LinkedList (String), la cual permitirá agregar clientes en la cola de espera, atender al primero en la lista y ofrecer una funcionalidad especial para insertar clientes con urgencia al inicio de la cola sin afectar el rendimiento.
 */
public class App {

    public static void main(String[] args) throws Exception {

        LinkedList<String> colaClientes = new LinkedList<>();
        colaClientes.add("Jeogin");
        colaClientes.add("Lee Know");
        colaClientes.add("Felix");
        colaClientes.add("Changbin");

        System.out.println("Cola de clientes:");
        System.out.println(colaClientes);

        String clienteAtendido = colaClientes.poll();

        System.out.println("\nCliente atendido: " + clienteAtendido);

        System.out.println("\nCola después de la atención:");
        System.out.println(colaClientes);
    }
}
