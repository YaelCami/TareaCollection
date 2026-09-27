package co.edu.uniquindio.poo.tareacollection.generics.primerEjercicio;

/* 1- Caja genérica:  Implementar una clase con un atributo T contenido y métodos guardar(T valor) y obtener().*/
public class App {
    public static void main(String[] args) {

        Caja<String> cajaTexto = new Caja<>();

        cajaTexto.guardarContenido("Holiss");
        System.out.println("Lo que hay en la primera caja es: " + cajaTexto.ObtenerContenido());

        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardarContenido(1);
        System.out.println("Lo que hay en la segunda caja es: " + cajaNumero.ObtenerContenido());
    }

}
