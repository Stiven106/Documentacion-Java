package functionalAPIStream;

import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

public class EjemploFilterDistinctUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
        .of("Pato Guzman", "Paco Gonzales","Paco Gonzales","Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
        .distinct();
       
        nombres.forEach(System.out::println);
    }

}
