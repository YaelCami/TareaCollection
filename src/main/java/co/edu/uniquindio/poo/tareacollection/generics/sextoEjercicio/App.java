package co.edu.uniquindio.poo.tareacollection.generics.sextoEjercicio;

import co.edu.uniquindio.poo.tareacollection.generics.primerEjercicio.Caja;

/* 6-Clase CajaNumerica<T extends Number>
 Crear una clase genérica que almacene un número y tenga un método doble() que devuelva el doble de su valor.*/

public class App {
    public static void main(String[] args) {
        CajaNumerica<Integer> cajita = new CajaNumerica<>(10);
        System.out.println( "El número original es: " + cajita.getNumero() + " y su doble es: " + cajita.doble());

        CajaNumerica<Double> cajita2 = new CajaNumerica<>(1.5);
        System.out.println( "El número original es: " + cajita2.getNumero() + " y su doble es: " + cajita2.doble());


    }
}
