package co.edu.uniquindio.poo.tareacollection.generics.octavoEjercicio;

/* 8- Clase Comparador<T extends Comparable<T>>
 Crear una clase genérica con un método mayor(T a, T b) que devuelva el mayor entre dos elementos comparables. */

public class App {
    public static void main(String[] args) {
        Comparador<Double> comparador = new Comparador();
        System.out.println("El mayor de los dos números es: " + comparador.mayor(90.2, 65.4));
    }
}
