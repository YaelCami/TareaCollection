package co.edu.uniquindio.poo.tareacollection.collection.septimoEjercicio;

import java.util.LinkedList;

/* 9- En la navegación web, los usuarios necesitan poder retroceder a páginas anteriores. Para este propósito, se usará un Stack, que funciona como una pila LIFO (Last In, First Out). Cada vez que el usuario visite una nueva página, esta se añadirá a la pila, y cuando decida volver atrás, se eliminará la última página visitada para regresar a la anterior.
 */
public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<String> stackPaginas = new LinkedList<>();

        stackPaginas.push("Youtube");
        stackPaginas.push("Netflix");
        stackPaginas.push("Whatsapp Web");
        stackPaginas.push("Gmail");

        System.out.println("Páginas: ");
        System.out.println(stackPaginas);


        System.out.println("\nRetrocediendo...");
        String paginaActual = stackPaginas.pop();

        System.out.println("Página anterior: " + stackPaginas.peek());

        System.out.println("\nRetrocediendo...");
        String paginaActual1 = stackPaginas.pop();

        System.out.println("Página anterior: " + stackPaginas.peek());

        System.out.println("\nRetrocediendo...");
        String paginaActual2 = stackPaginas.pop();

        System.out.println("Página anterior: " + stackPaginas.peek());
    }
}
