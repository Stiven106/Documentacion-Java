package functionalLambdas;

import java.util.function.BiFunction;
import java.util.function.Function;


public class LambdaFunction {

    public static void main(String[] args) {
      /* Recibe un tipo generico.
      Recibe un argumento como parametro y devuelve algun valor.
        Es la cocmbinacion de un consumer y un supplier. */

        /*Funcion sin simplificar*/
        Function<String, String> funcion1 = param -> {
            return "Hola que tal! " + param;
        };
        /*Funcion simplificada*/
        Function<String, String> funcion1Simplificada = param -> "Hola que tal! " + param;
        /*De manera que primero recibimos el argumento "= param ->" y luego devolvemos o retornamos un caracter junto al argumento ingresado.
        * Faltaria entonces introducir dicho argumento y posteriormente imprimir el resultado de este metodo
        * para esto utilizaremos el metodo "apply", este metodo lo que hace es ingresar un argumento y a su vez devuelve un resultado.  */
        String resultado = funcion1Simplificada.apply("andres"); /*Justo en este momento se ejecuta la funcion, apply ingresa el argumento y retorna el resultado de la funcion.*/
        System.out.println(resultado);


        /*------------------------------------------------------------------------------*/

                            /*Ejemplos con referencia de metodos*/

        /*Funcion sin referencia de metodos*/
        Function<String, String> function2 = param -> param.toUpperCase();
        System.out.println(function2.apply("andres"));

        /*Funcion referencia de metodos*/
        Function<String, String> function2Referencia = String::toUpperCase;
        System.out.println(function2Referencia.apply("andres"));

        /* Otra funcion es BiFunction. Esta puede recibir mas de 2 argumentos veamos un ejemplo        */
        BiFunction<String, String, String> f3 = (a,b ) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("andres", "jose");
        System.out.println(r2);
        /*Aqui se ingresan 2 argumentos y se devuelve un String, recordemos que las funciones siempre devuelven un tipo, debido a esto
        * siempre ponemos dentro del generico el tipo de dato (o los en caso de que se quiera introducir mas datos) y un tipo de dato
        * adicional que hace referencia al tipo de dato que devuelve el metodo. */

        /*Sin simplificar*/
        BiFunction<String, String, String> f4 = (a,b ) -> a.toUpperCase().concat(b.toUpperCase());
        System.out.println(f4.apply("andres", "andres2"));

        /*Simplificando*/
        BiFunction<String, String, Integer> f4Simplificada = String::compareTo;
        System.out.println(f4Simplificada.apply("andres", "andres2"));

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("andres", "jose"));

    }

    
}
