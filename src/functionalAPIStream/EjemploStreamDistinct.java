package functionalAPIStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        /* Distinct: Todo lo que encuentre repetido lo agrupa en uno solo, es decir, no lo vuelve a repetir.
        Por ejemplo observemos como paco gonzales se repite 2 veces, ahora ejecuta el programa y observa el resultado. */

        Stream/* Imprime un string por el forEach, tiene esta estructura por que recordemos que el forEach devuelve un void! */
        .of("Pato Guzman", "Paco Gonzales", "Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .distinct()
        .forEach(System.out::println);


    }

}
