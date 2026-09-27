package co.edu.uniquindio.poo.tareacollection.generics.quintoEjercicio;

/* 5- Clase Par<T>:  Implementar una clase que guarde dos valores de tipo T y un método para verificar si ambos son iguales. */
public class App {
    public static void main(String[] args) {
        Par<String> comidas = new Par<>("HAMBURGUESA", "SALCHIPAPA");

        if(comidas.sonIguales()){
            System.out.println(comidas.getElemento() + " y " + comidas.getElemento2() + " son iguales");

        }
        else{
            System.out.println("Las comidas no son iguales");
        }
    }
}
