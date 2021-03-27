package Generics.test;

import Generics.genericos.ClaseGenerica;

public class TestGenerics {
    public static void main(String[] args) {
        /*
        Al definir un tipo generico entonces quiere decir que podemos utilizar cualquier clase de tipo object.

        Primero utilizaremos la clase Integer de tipo object.
         */
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica<>(15); // Tipo Integer
        objetoInt.obtenerTipo();

        ClaseGenerica<String> objectoString = new ClaseGenerica<>("Debe coincidir el tipo, con el objeto."); // Tipo String
        objectoString.obtenerTipo();




    }
}
