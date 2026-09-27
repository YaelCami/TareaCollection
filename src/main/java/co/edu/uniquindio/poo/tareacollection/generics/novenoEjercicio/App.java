package co.edu.uniquindio.poo.tareacollection.generics.novenoEjercicio;

/* 9- Interfaz genérica Almacenable<T extends Comparable<T>>
 Definir una interfaz con métodos guardar(T item) y maximo(). Implementar en una clase que calcule el mayor elemento almacenado*/
public class App {
    public static void main(String[] args) {
        Almacen<Integer> numeros = new Almacen<>();
        numeros.guardar(10);
        numeros.guardar(20);
        numeros.guardar(30);

        System.out.println("El número máximo es: " + numeros.maximo());

        Almacen<String> nombres = new Almacen<>();
        nombres.guardar("Ana");
        nombres.guardar("Zebra");
        nombres.guardar("Carlos");

        System.out.println("Alfabéticamente el último es: " + nombres.maximo());
    }
}
