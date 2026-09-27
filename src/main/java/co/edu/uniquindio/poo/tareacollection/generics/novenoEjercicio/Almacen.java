package co.edu.uniquindio.poo.tareacollection.generics.novenoEjercicio;

import java.util.ArrayList;
import java.util.List;

public class Almacen<T extends Comparable<T>> implements Almacenable<T> {
    private List<T> elementos = new ArrayList<>();

    @Override
    public void guardar(T item) {
        elementos.add(item);
    }

    @Override
    public T maximo() {
        if(elementos.isEmpty()){
            return null;
        }
        T max = elementos.get(0);
        for(T item : elementos){
            if(item.compareTo(max)>0){
                max = item;
            }
        }
        return max;
    }
}
