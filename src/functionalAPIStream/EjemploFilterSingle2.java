package functionalAPIStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

public class EjemploFilterSingle2 {
    public static void main(String[] args) {

       Usuario usuario = Stream
        .of("Pato Guzman", "Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
        .peek(System.out::println)
        .filter(u -> u.getId().equals(1)) /* Buscar por id con filter. */
        .findFirst().orElseGet(() -> new Usuario("John", "Doee"));/* orElseGet es de API Optional, en caso de que el parametro dentro del equals no tenga ninguna coincidencia, entonces el valor por default sera este. */

        System.out.println(usuario);


    }

}
