package co.edu.uniquindio.poo.tareacollection.generics.septimoEjercicio;

/* 7- Método genérico sumar<T extends Number>
 Implementar un método que reciba dos parámetros de tipo T y devuelva la suma como double.*/

public class App {
    public static void main(String[] args) {
        double suma = Calculadora.sumar(60, 25.2);
        System.out.println("Los suma de los números da: " + suma);
    }
}
