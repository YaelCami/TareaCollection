package co.edu.uniquindio.poo.tareacollection.collection.cuartoEjercicio;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*5- Crear una lista de productos de tipo HashMap, otra lista de tipo LinkedHashMap y otra de tipo TreeMap y explicar las diferencias de cada una.
 */
public class App {

    public static void main(String[] args) {

        Producto p1= new Producto("23", "Pantalón", 50000.0);
        Producto p2 = new Producto("520", "Camisa", 25000.0);
        Producto p3 = new Producto("45", "Falda", 65000.0);

        /*
        * HashMap:
        * No garantiza un orden específico de los elementos ya que se rige a partir de las tablas hash
         */

        Map<String, Producto> hashMap = new HashMap<>();

        hashMap.put(p1.getId(), p1);
        hashMap.put(p2.getId(), p2);
        hashMap.put(p3.getId(), p3);

        /*
        * LinkedHashMap:
        * Mantiene el orden en el que fueron agregados
        * los elementos.
        */

        Map<String, Producto> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(p1.getId(), p1);
        linkedHashMap.put(p2.getId(), p2);
        linkedHashMap.put(p3.getId(), p3);

        /*
        * TreeMap:
        * Mantiene los elementos ordenados según sus claves en un orden natural.
         */

        Map<String, Producto> treeMap = new TreeMap<>();
        treeMap.put(p1.getId(), p1);
        treeMap.put(p2.getId(), p2);
        treeMap.put(p3.getId(), p3);

        System.out.println("HASHMAP:");
        System.out.println(hashMap);
        System.out.println("\nLINKEDHASHMAP:");
        System.out.println(linkedHashMap);
        System.out.println("\nTREEMAP:");
        System.out.println(treeMap);


    }
}
