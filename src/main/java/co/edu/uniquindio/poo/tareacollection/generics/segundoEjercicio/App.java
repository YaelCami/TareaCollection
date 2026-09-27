package co.edu.uniquindio.poo.tareacollection.generics.segundoEjercicio;

/* Método genérico mostrarElemento:
 Crear un método estático genérico que reciba un parámetro de tipo T y lo imprima en consola.
 */
public class App {

    public static <T> void imprimir(T valor) {
        System.out.println(valor);
    }

    public static void main(String[] args) {

        imprimir("Hola");
        imprimir(123);
        imprimir(85.36);
        imprimir(true);
    }
}
