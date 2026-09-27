package co.edu.uniquindio.poo.tareacollection.collection.tercerEjercicio;

import java.util.PriorityQueue;

/**Cree una cola (Queue) que almacene objetos de tipo "Tarea" que tengan una prioridad asociada. Implemente la cola usando un PriorityQueue y defina la prioridad de cada tarea según su importancia.*/

 public class App {

    public static void main(String[] args) {

        PriorityQueue<Tarea> cola = new PriorityQueue<>();

        Tarea t1 = new Tarea("Hacer tarea de matemáticas", 3);
        Tarea t2 = new Tarea("Estudiar para el examen", 2);
        Tarea t3 = new Tarea("Organizar el cuarto", 1);

        cola.add(t1);
        cola.add(t2);
        cola.add(t3);

        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
