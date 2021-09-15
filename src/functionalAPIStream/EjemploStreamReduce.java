package functionalAPIStream;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {

        /*  */

        Stream<String> nombres = Stream
        .of("Pato Guzman", "Paco Gonzales", "Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .distinct();

        /* a corresponde al anterior y b corresponde al actual. luego en "->" se define lo que se va a hacer con ellos. */
        String resultado = nombres.reduce("resultado concatenacion ", (a,b) -> a+ ", " +b); 
        System.out.println(resultado);

    }

}
