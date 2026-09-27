package co.edu.uniquindio.poo.tareacollection.generics.tercerEjercicio;

/* 3- Interfaz genérica Contenedor<T>: Definir una interfaz con métodos agregar(T item) y obtener(int indice). Implementarla con una clase ListaContenedor<T>.
 */
public class App {
    public static void main(String[] args) {
        ListaContenedor<String> lista = new ListaContenedor<>();

        lista.agregar("Bangchan");
        lista.agregar("Jeogin");
        lista.agregar("Lee Know");

        System.out.println("El segundo elemento de la lista es: " + lista.obtener(1));
        System.out.println("El tercer elemento de la lista es: " + lista.obtener(2));

    }
}
