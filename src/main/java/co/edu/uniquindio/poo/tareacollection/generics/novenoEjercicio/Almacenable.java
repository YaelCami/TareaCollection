package co.edu.uniquindio.poo.tareacollection.generics.novenoEjercicio;

public interface Almacenable<T extends Comparable<T>> {
    void guardar(T item);
    T maximo();
}
