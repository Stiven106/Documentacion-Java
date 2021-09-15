package functionalAPIStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        /* Creacion de Stream: Existen varios metodos para crear un stream, en esta clase veremos cuales son. 
        Lo primero mencionar que el generic del Stream indica el tipo de dato que va a contener ese flujo.*/
        
        Stream<String> nombres = Stream.of("Pato", "Paco", "Pepa", "Pepe");
        /* Para realizar algun trabajo o tarea tenemos que invocar a los operadores, veremos entonces que existen 2 tipos:
        Intermedios: Sirven para realizar transformaciones
        Finales: Realizar una accion o convertir algun tipo de datos que contiene esta corriente a otro tipo, o bien poder 
        iterar con el forEach, entre otros.

                    ForEach
        Este es un operador final, debido a que retorna un void, pero este recibe un Consumer para poder iterar los elementos. 
        No modifica el flujo y tampoco devuelve nada. 
        */

        nombres.forEach(System.out::println);
        System.out.println();/* Genero un salto de linea para no confundir */

        /* Veamos ahora como hacer lo mismo con un arreglo */

        String[] arr = {"Pato", "Paco", "Pepa", "Pepe"};
        Stream<String> printArr= Arrays.stream(arr);
        printArr.forEach(System.out::println);
        System.out.println();/* Genero un salto de linea para no confundir */

        /* Operador Builder
        
        */
        Stream<String> nombresBuilder = Stream.<String>builder()
        .add("Pato")
        .add("paco")
        .add("pepa")
        .add("pepe")
        .build();
        nombresBuilder.forEach(System.out::println);
        System.out.println();/* Genero un salto de linea para no confundir */

        /* Crear un Stream a partir de un tipo Collection */

        List<String> lista = new ArrayList<>();
        lista.add("Ema");
        lista.add("Fila");
        lista.add("Norma");
        lista.add("Elias");

        /* Para convertir una lista o coleccion a un stream tendremos que utilizar el metodo stream.
        Para esto tenemos varias opciones, primero podriamos crear una variable de tipo Stream con el tipo de flujo o dato que contiene la lista
        y luego decir que esta variable va a ser igual a la coleccion.stream(), veamos un ejemplo:
            Stream<String> nombresLista = lista.stream();
            nombresLista.forEach(System.out::println);
        La siguiente forma es mas corta, puesto que podremos crear el stream y imprimirlo en la misma linea, veamos como:
        */
        lista.stream().forEach(System.out::println);/* Todo en una sola linea */
        System.out.println();/* Genero un salto de linea para no confundir */




    }
}
