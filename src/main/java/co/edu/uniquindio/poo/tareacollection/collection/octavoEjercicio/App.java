package co.edu.uniquindio.poo.tareacollection.collection.octavoEjercicio;

import java.util.HashSet;
import java.util.Set;

/* 10- En un edificio con control de acceso, los empleados deben identificarse mediante un código único para poder ingresar. Para gestionar estos accesos sin permitir duplicados, se utilizará un HashSet, donde cada ID de empleado será almacenado y verificado antes de permitir la entrada.
 */
public class App {
    public static void main(String[] args) throws Exception {

        HashSet<String> empleados = new HashSet<String>();

        empleados.add("805");
        empleados.add("806");
        empleados.add("807");

        System.out.println("Empleados:");
        System.out.println(empleados);

        boolean agregado = empleados.add("807");

        if (agregado) {
            System.out.println("Empleado registrado correctamente.");
        } else {
            System.out.println("El ID ya existe. No se permite el ingreso duplicado.");
        }

        System.out.println("Empleados:");
        System.out.println(empleados);


    }
}
