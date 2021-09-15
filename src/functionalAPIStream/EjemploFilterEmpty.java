package functionalAPIStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

public class EjemploFilterEmpty {
    public static void main(String[] args) {

        /* isEmpyty, nos permite ver si el flujo en cuestion esta vacio. */

        long count = Stream
        .of("Pato Guzman", "Paco Gonzales", "Pepa Mena", "", "")
        //.filter(n -> n.isEmpty())/* Sin simplificar, dejo el ejemplo pero es lo mismo que abajo*/
        .filter(String::isEmpty)/*  simplificar */
        .peek(System.out::println)
        .count();

        System.out.println("count = " + count);




    }

}
