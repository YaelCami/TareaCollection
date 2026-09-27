package co.edu.uniquindio.poo.tareacollection.collection.novenoEjercicio;

import java.util.LinkedHashSet;

/* 11- En una aplicación de música, los usuarios pueden marcar canciones como favoritas. Para garantizar que las canciones favoritas se mantengan en el orden en que fueron añadidas sin permitir duplicados, se empleará un LinkedHashSet, el cual conservará la secuencia de inserción y asegurará que no haya repeticiones.
 */
public class App {
    public static void main(String[] args) throws Exception {

        LinkedHashSet<String> cancionesFavoritas = new LinkedHashSet<>();
        cancionesFavoritas.add("Youth");
        cancionesFavoritas.add("Domino");
        cancionesFavoritas.add("Maniac");
        cancionesFavoritas.add("My Pace");
        cancionesFavoritas.add("Kanade");

        System.out.println("Canciones favoritas:");
        for (String cancion : cancionesFavoritas) {
            System.out.println("♥ " + cancion);
        }
    }
}
