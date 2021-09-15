package functionalAPIStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

/* Si ya viste la clase EjemploStream muy posiblemente te diste cuenta que hasta el momento no hemos manipulado los datos, es decir,
tenemos el forEach y sabemos crear un Stream, pero de momento no hemos hecho nada con el flujo de datos.

En esta clase veremos como se manipulan y para esto utilizaremos los operadores intermedios ,ap y peek...*/

public class EjemploMap {
    public static void main(String[] args) {

        /* Un map siempre devuelve un resultado o el dato cambiado 
            Un peak sirve para inspeccionar, debugg o rastreo de elementos, parecido a un forEach*/
        Stream<String> nombres = Stream
        .of("Pato", "Paco", "Pepa", "Pepe")
        .peek(e -> System.out.println(e))/* En este caso nos muestra el valor de la cadena antes de ser cambiado */
        .map(nombre -> {
            return nombre.toUpperCase();
        });
        /* Convertir este flujo a un tipo lista 
        Para esto invocaremos el operador collect el cual es de tipo final, el cual nos permite convertir a un tipo lista de string*/
        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        System.out.println();/* Genero salto de linea para no confundir */

        /* Aclaraciones finales:
        Es importante aclarar que el peek simplemente muestra o inspecciona un dato en el momento que se ejecuta. Por lo que si luego del peek existe un map
        que cambia el caracter o el dato, entonces nuestro peek inspeccionara el dato antes de ser cambiado, pero no despues del cambio. Puedes ver que esto se
        cumple observando los valores que imprime este codigo, la primera vez imprimira los datos tal cual se ingresaron, puesto que luego de que se ingresan
        se ejecuta el peek, pero luego se muestran los datos que fueron cambiados por el map, OJO estos datos en mayus se muestran gracias al forEach, recuerda que
        el map lo unico que esta haciendo es manipular el flujo.

        Para entender bien este tema, prueba a cambiar la posicion del peek (arriba del map y debajo del map) y te daras cuenta que el peek inspecciona de una forma
        pero el dato en si que cambia a travez del map va a cambiar si o si, pero si no hay ningun peek luego de el map, entonces la unica inspeccion que se muestra
        es la del dato antes de ser cambiado si es que el peek esta antes del map.
        */

        /* Ahora creamos un stream de forma simplificada con referencia de metodos
        Y ademas le daremos distintos usos al operador map */


        Stream<String> nombresSimplificado = Stream
        .of("Pato", "Paco", "Pepa", "Pepe")
        .map( String::toUpperCase)
        .peek(System.out::println);/* En este caso nos muestra el valor de la cadena antes de ser cambiado */

        List<String> listaSimplificada = nombresSimplificado.collect(Collectors.toList());
        listaSimplificada.forEach(System.out::println);
        System.out.println();/* Genero salto de linea para no confundir */

     /* Ahora creamos un stream de forma simplificada con referencia de metodos
        Y ademas le daremos distintos usos al operador map 
        Transformaremos un tipo string a un objeto de tipo usuario, veamos como:*/

        Stream<Usuario> operadorMap = Stream
        .of("Pato Guzman", "Paco Gonzales", "Pepa Mena", "Pepe Marin")
        .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))/* split separa un string desde el parametro que se le ingrese y lo permite leer como un arreglo siendo 0 la posicion antes del parametro ingresado*/
        .peek(System.out::println)
        .map( usuario -> {
            String nombre = usuario.getNombre().toUpperCase();
            String apellido = usuario.getApellido().toLowerCase();
            usuario.setNombre(nombre);
            usuario.setApellido(apellido);
            return usuario;
        });


        List<Usuario> listaUsuario = operadorMap.collect(Collectors.toList());
        listaUsuario.forEach(u -> System.out.println(u.getNombre() + " " + u.getApellido()));


    }

}
