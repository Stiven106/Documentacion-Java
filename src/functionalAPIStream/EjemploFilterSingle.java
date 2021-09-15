package functionalAPIStream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

public class EjemploFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
        .of("Pato Guzman", "Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
        .filter(u -> u.getNombre().equals("Pepe"))/* Buscar por coincidencia */
        .peek(System.out::println);


        /* Optional: Cuando el resultado puede llegar a dar null, entonces se utiliza un Optional el cual nos permite poder agregar una capa 
        de abstraccion sobre el objeto para evitar el NullPointerException, de esta forma validar si el objeto fue encontrado o no fue encontrado.
        el metodo .get() es parte de optional, pero tenemos otros como por ejemplo orElse() que dependiendo de la validacion, es decir, de si encontro algo
        o no, entonces podremos utilizarlo. En teoria orElse() nos permite, obtenerlo tal cual lo obtiene el get, pero si no entonces obtener otro objeto por
        ejemplo. 
        
                    <Como tal la api Optional lo que trata de evitar es caer en un NullPointerExcepcion> */
        Optional<Usuario> usuario = nombres.findFirst();
        //System.out.println(usuario.get());
        System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());/* Si lo encuentra seria como un get normal, pero si no, entonces que devuelva a el usuario John... */


        /* Otro metodo que podemos utilizar de OPTIONAL es isPresent, este valida que sea distinto de vacio, veamos un ejemplo */

        if (usuario.isPresent()) {
            System.out.println("Ejecutando isPresent: " + usuario.get().getNombre());
        } else {
            System.out.println("No se encontro el objeto!");
        }




    }

}
