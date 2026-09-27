package co.edu.uniquindio.poo.tareacollection.collection.segundoEjercicio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** 3- Crear una lista de elementos que no permite duplicados e imprima el contenido de la lista usando iteradores. */

 public class App{

    public static void main(String[] args) {

        Set<String> nombres = new HashSet<>();

        nombres.add("Yael");
        nombres.add("Jeogin");
        nombres.add("Lee Know");
        nombres.add("Felix");
        nombres.add("Hyujin");

        Iterator<String> iteratorNombres  = nombres.iterator();

        while (iteratorNombres.hasNext()) {
            System.out.println(iteratorNombres.next());
        }


    }
}
