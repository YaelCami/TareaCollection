package co.edu.uniquindio.poo.tareacollection.generics.decimoEjercicio;

/* Método imprimirMayor<T extends Number & Comparable<T>>
 Implementar un método que reciba dos números comparables y devuelva el mayor.*/

public class App {
    public static void main(String[] args) {

        Integer m1 = Utilidades.imprimirMayor(10, 20);
        Double m2 = Utilidades.imprimirMayor(5.5, 2.3);

    }
}
