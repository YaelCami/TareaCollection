package co.edu.uniquindio.poo.tareacollection.generics.quintoEjercicio;

public class Par<T> {
    private T elemento;
    private T elemento2;

    public Par(T elemento, T elemento2) {
        this.elemento = elemento;
        this.elemento2 = elemento2;
    }

    public boolean sonIguales(){
        if(elemento == null){
            return false;
        }
        if(elemento2 == null){
            return false;
        }
        return elemento.equals(elemento2);
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public T getElemento2() {
        return elemento2;
    }

    public void setElemento2(T elemento2) {
        this.elemento2 = elemento2;
    }
}
