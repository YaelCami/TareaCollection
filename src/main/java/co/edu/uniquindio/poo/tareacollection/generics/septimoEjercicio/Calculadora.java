package co.edu.uniquindio.poo.tareacollection.generics.septimoEjercicio;

import javafx.beans.binding.NumberExpression;

public class Calculadora<T extends Number> {
    private T numero;
    private T numero2;

    public static <T extends Number> double sumar(T numero, T numero2) {
        return numero.doubleValue() + numero2.doubleValue();
    }

    public T getNumero() {
        return numero;
    }

    public void setNumero(T numero) {
        this.numero = numero;
    }

    public T getNumero2() {
        return numero2;
    }

    public void setNumero2(T numero2) {
        this.numero2 = numero2;
    }
}
