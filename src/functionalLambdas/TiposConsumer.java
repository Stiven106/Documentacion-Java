package functionalLambdas;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import functionalLambdas.models.Usuario;


public class TiposConsumer {
    /* 
    Expresion Lambda: Es implementar un metodo sin la necesidad de implementar una clase.
    Y se traduce a una interfaz funcional, con un solo metodo que tenemos que implementar, por esto es al "vuelo",es decir,
    que solo se necesita implementar.
    */
    public static void main(String[] args) {
        
        /* Primera expresion
            Consumer: Permite pasar por argumento un solo parametro, del tipo del generico.
            lo que pasemos por argumento se va a poder utilizar luego de "->" como veremos en el siguiente ejemplo
        */

        /* Primer ejemplo consumer, metodo corto */
        Consumer<String> consumidor = saludo -> System.out.println(saludo);

        /* Primer ejemplo consumer, metodo largo 
            Observemos como si el metodo tiende a tener mas de una linea de codigo, este utilizara los "{}". En el primer ejemplo
            vimos como el metodo solo requeria una sola linea y no hizo uso de estos corchetes {}.
        */

        consumidor.accept("hola");

        Consumer<Date> consumidorFecha = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println(f.format(fecha));
        };

        /* Estos metodos por si solos no hacen nada, es decir, no imprimen nada. 
        Se puede eliminar el siguiente codigo para validar esto. 
        Para que impriman se tiene que agregar la implementacion, veamos como se hace:*/
        consumidorFecha.accept(new Date()); /* De esta forma se agrega la fecha como argumento. Luego el metodo lo recibe como parametro. */

        /* Por defecto el Consumer recibe 1 solo argumento en el metodo, pero tambien podriamos tener uno que reciba 2 argumentos, a este se le llama BiConsumer. 
        Ahora bien, cuando utilizamos el BiConsumer, debemos observar como la sintaxis cambia, observen las diferencias entre el consumer y el biconsumer.
        Estas son: 
        el parametro fecha no necesita de "()" en el consumer
        El generico ahora recibe 2 tipos en el BiConsumer por ende requiere de ()

        */

        BiConsumer<String, Integer> consumidorBi = (  /* String podriamos poner estos, pero ya se indican en el generico */ nombre, 
                                                    /* Integer */ edad) -> {
            System.out.println(nombre+ " tiene " + edad + " años");
        };

        consumidorBi.accept("pepe", 20);


        /* REFERENCIAS DE METODOS EN EXPRESIONES LAMBDA DE TIPO CONSUMER */

        /* Ahora veremos como simplificar el primer metodo que hicimos en este archivo Aplicando algo llamado Method Reference.
        Observa la estructura del siguiente system...
        */

        Consumer<String> consumidorSimplificado = System.out::println;/* los "::" indican que se imprime la misma referencia que se obtiene */
        consumidorSimplificado.accept("Hola de forma simplificada!");

        /* Cuando lo utilizamos: 
        En APIS de Java, por ejemplo el API Stream
        En el for.Each 
        
        Veamos un ejemplo:*/

        List<String> nombres = Arrays.asList("andres", "pere", "luz", "luis");
        nombres.forEach(consumidorSimplificado);
        Usuario usuario = new Usuario();

        /* Sin simplificar */
        /* 
        BiConsumer<Usuario, String> asignarNombre = (persona, nombre) -> {
            persona.setNombre(nombre);
        }; 
        */

        /* Simplicando */
       
        BiConsumer<Usuario, String> asignarNombre = Usuario::setNombre;
        asignarNombre.accept(usuario, "Andres");
        System.out.println("Nombre usuario: " + usuario.getNombre());

        /* Otra expresion Lambda
        Supplier: No recibe ningun argumento pero si devuelve, por esto es supplier = proveedor.
        */

        Supplier<String> proovedor = () -> {
            return "Hola mundo lambda supplier";
        };
        System.out.println(proovedor.get());

        /* Veamos otro ejemplo de este Supplier 
        Creamos un objeto de tipo usuario.
        Con el get obtenemos la implementacion del metodo: new Usuario(); */

        Supplier<Usuario> creaUsuario = () -> new Usuario();
        Usuario user = creaUsuario.get();
        user.setNombre("Jony");
        System.out.println("usuario con supplier, name: " + user.getNombre());



    }

}
