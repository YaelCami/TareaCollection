package co.edu.uniquindio.poo.tareacollection.collection.quintoEjercicio;

import java.util.ArrayList;
import java.util.Comparator;

/*5- En una tienda se necesita una aplicación para gestionar el inventario de productos(codigo, nombre, precio), permitiendo agregar nuevos artículos, eliminar los que están agotados, buscar productos específicos y listar todo el inventario en orden alfabético y por orden de precio. Para ello, se utilizará una ArrayList, que ofrece acceso rápido a los elementos y permite su manipulación de manera eficiente.
 */
public class App {

    public static void main(String[] args) {

        ArrayList<Producto> productos= new ArrayList<Producto>();

        Producto p1 = new Producto("03", "Arroz", 2000.0,0);
        Producto p2 = new Producto("01", "Huevo", 3000.0, 30);
        Producto p3 = new Producto("02", "Pan", 1000.0, 50);
        Producto p4 = new Producto("04", "Sal", 4000.0, 10);

        productos.add(p1);
        productos.add(p2);
        productos.add(p3);
        productos.add(p4);

        System.out.println("====Inventario inicial====");
        listarInventario(productos);

        System.out.println("====Búsqueda====");
        buscarProducto(productos, "02");

        eliminarAgotados(productos);

        System.out.println("====Inventario sin productos agotados====");
        listarInventario(productos);

        System.out.println("\n=== Orden Alfabético ===");
        productos.sort(null);

        System.out.println("\n=== ORDEN POR PRECIO ===");
        productos.sort(Comparator.comparing(Producto::getPrecio));
        listarInventario(productos);


    }
    public static void listarInventario(ArrayList<Producto> productos){
        for(Producto p: productos){
            System.out.println(p);
        }
    }

    public static void buscarProducto(ArrayList<Producto> productos, String id){
        for(Producto p: productos){
            if(p.getId().equals(id)){
                System.out.println("Producto encontrado");
                System.out.println(p);
                return;
            }
        }

        System.out.println("Producto no encontrado");
    }

    public static void eliminarAgotados(ArrayList<Producto> productos){
        for(Producto p: productos){
            if(p.getCantidad() == 0){
                productos.remove(p);
                System.out.println("Producto eliminado");
                return;
            }
        }
    }
}


