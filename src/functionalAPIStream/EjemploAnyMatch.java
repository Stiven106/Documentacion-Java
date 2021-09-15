package functionalAPIStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

public class EjemploAnyMatch {
    public static void main(String[] args) {

        /* operador anyMatch, busca dentro del flujo alguna coincidencia */
        boolean existe1 = Stream
        .of("Pato Guzman", "Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
        .peek(System.out::println)
        .anyMatch(u -> u.getId().equals(3));

        System.out.println(existe1);


        /* operador count, devuelve un long */
        boolean existe2 = Stream
        .of("Pato Guzman", "Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
        .peek(System.out::println)
        .anyMatch(u -> u.getId().equals(3));

        System.out.println(existe2);

        


    }

}
