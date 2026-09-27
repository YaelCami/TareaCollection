package co.edu.uniquindio.poo.tareacollection.collection.primerEjercicio;

/**1- Crear la lista de productos en una clase empresa utilizando treeset, se debe realizar un método que busque un producto por su código.*/
public class App {

    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Producto p1 = new Producto("65", "Almohada", 5000);
        Producto p2 = new Producto("61", "Colchón", 5000);
        Producto p3 = new Producto("62", "Sabana", 5000);

        empresa.add(p1);
        empresa.add(p2);
        empresa.add(p3);

        Producto encontrado = empresa.buscarProductoPorNombre("Almohada");

        if (encontrado != null) {
            System.out.println("Producto encontrado");
            System.out.println("Nombre: " + encontrado.getNombre());
            System.out.println("Id: " + encontrado.getId());
            System.out.println("Precio: " + encontrado.getPrecio());

        } else {
            System.out.println("Producto no encontrado");
        }
    }
}