package functionalAPIStream;

import java.util.stream.Stream;

public class EjemploStreamReduceEnteros {
    public static void main(String[] args) {

        /*  */

        Stream<Integer> nombres = Stream.of( 5,10,15,20);

        /* a corresponde al anterior y b corresponde al actual. luego en "->" se define lo que se va a hacer con ellos. */
        //Integer resultado = nombres.reduce(0, (a,b) -> a+b); /* Sin sinmplificar! */
        Integer resultado = nombres.reduce(0, Integer::sum); /* Simplificado */
        System.out.println(resultado);

    }

}
