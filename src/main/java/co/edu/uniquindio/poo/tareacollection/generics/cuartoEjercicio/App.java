package co.edu.uniquindio.poo.tareacollection.generics.cuartoEjercicio;

/* 4- Método genérico intercambiar:  Implementar un método que reciba dos elementos de tipo T e intercambie sus posiciones en un arreglo.*/
public class App {

    public static <T> void intercambiar(T[] arreglo, int posicion1, int posicion2){
        T aux = arreglo[posicion1];
        arreglo[posicion1] = arreglo[posicion2];
        arreglo[posicion2] = aux;
    }

    public static void main(String[] args) {
        String[] nombres = {"Yael", "Camila"};

        System.out.println("Antes: " +nombres[0] + ", " + nombres[1] );
        intercambiar(nombres, 0, 1);
        System.out.println("Después: " +nombres[0] + ", " + nombres[1] );

    }
}
