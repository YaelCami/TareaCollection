package co.edu.uniquindio.poo.tareacollection.collection.primerEjercicio;

import java.util.TreeSet;

public class Empresa {
    private TreeSet<Producto> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void add(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProductoPorNombre(String nombre) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                return producto;
            }
        }
        return null;
    }

}
