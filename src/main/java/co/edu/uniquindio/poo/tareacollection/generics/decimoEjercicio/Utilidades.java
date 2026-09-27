package co.edu.uniquindio.poo.tareacollection.generics.decimoEjercicio;

public class Utilidades {

    public static <T extends Number & Comparable<T>> T imprimirMayor(T a, T b) {

        T mayor = a.compareTo(b) >= 0 ? a : b;

        System.out.println("El mayor es: " + mayor);

        return mayor;
    }
}
