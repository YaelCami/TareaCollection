package co.edu.uniquindio.poo.tareacollection.generics.tercerEjercicio;

import java.util.ArrayList;

public class ListaContenedor<T> implements Contenedor<T> {

    private ArrayList<T> lista = new ArrayList<>();

    @Override
    public void agregar(T item){
        lista.add(item);
    }

    @Override
    public T obtener(int indice){
        return lista.get(indice);
    }
}
