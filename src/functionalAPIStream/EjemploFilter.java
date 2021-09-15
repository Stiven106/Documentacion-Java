package functionalAPIStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

public class EjemploFilter {
    public static void main(String[] args) {

        Stream<Usuario> operadorMap = Stream
        .of("Pato Guzman", "Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
        .filter(u -> u.getNombre().equals("Pepe"))
        .peek(System.out::println);


        List<Usuario> listaUsuario = operadorMap.collect(Collectors.toList());
        listaUsuario.forEach(System.out::println);
        System.out.println();/* Genero un salto de linea para no confundir */


    }

}
