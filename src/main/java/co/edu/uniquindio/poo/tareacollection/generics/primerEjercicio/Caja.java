package co.edu.uniquindio.poo.tareacollection.generics.primerEjercicio;

public class Caja<T> {
    private T contenido;

    public void guardarContenido(T valor) {
        contenido = valor;
    }

    public T ObtenerContenido() {
        return contenido;
    }
}
