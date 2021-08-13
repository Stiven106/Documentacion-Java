package GenericsColecciones.test;

import java.util.*;

/*
En esta clase encontraras:
1. Collections con generics
2. Metodos con generics
 */
public class TestColeccionesGenericas {
    public static void main(String[] args) {

        //Toda el API DE COLLECTION soporta tipos genericos.


        //Generics con Listas

        List<String> miLista = new ArrayList<>(); // ArrayList<>() es correcto || ArrayList<String>() es redundante.
        /*
        Sin implementar tipos genericos en las colecciones, la agregacion de listas admitian tipos object. Implementando generics en las colecciones
        veremos que solo admitiremos el tipo que se especifique al crear la lista dentro de los "<>", el cual en este caso es String. De esta forma
        evitamos posibles errores, al introducir tipos de datos que no queremos en nuestras listas.
         */
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");

        //Metodo generico de tipo String para imprimir
        imprimirString(miLista);

        /*Una ventaja mas de los generics en las colecciones, es que antes al intentar recuperar una lista, teniamos que convertir la lista de tipo
        object, a tipo String, para recuperarla. Ahora con el uso de generics, esto no sera necesario. Veamos un ejemplo de ambos casos mas abajo:*/

        //String elemento = (String)miLista.get(0); // Forma SIN generics: tenemos que hacer casting, de tipo object a String.
        String elemento = miLista.get(0); // Gracias a los generics, nos ahorramos el casting.
        //System.out.println(elemento);



        //Generics con Set

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");

        //Metodo generico de tipo String para imprimir
        imprimirString(miSet);

        //Tipo map

        Map<String, String> miMapa = new HashMap<>(); // Indicamos que la llave y el valor va a ser de tipo String: <String,String>.
        // Agregar elementos
        miMapa.put("valor1","Juan");
        miMapa.put("Valor2", "Karla");
        miMapa.put("Valor3", "Rosario");

        //String elementoMapa = (String) miMapa.get("valor1");// Hacer Casting ya no es necesaria por que ya no es tipo object, si no String.
        String elementoMapa = miMapa.get("valor1"); // Ejemplo con el Casting.
        //System.out.println("elementoMapa = " + elementoMapa);

        // Imprimir con metodo

        imprimirString(miMapa.keySet());
        imprimirString(miMapa.values());


    }

    public static void imprimirString(Collection<String> coleccion ){
        /*          Explicacion de este metodo, Colecciones Genericas en Metodos.

        Si queremos que el metodo trabaje con elementos de tipo String tambien podemos especificarlo. Observa como este metodo en sus parametros
        tiene lo siguiente: "(Collection<String> coleccion)", estamos diciendo que coleccion va a ser de tipo Collection, pero de tipo String.
        De esta forma a la hora de implementar este metodo en una lista, SOLO si esa lista es de tipo String, el metodo funcionara.

        Si queremos que este metodo fuese muy generico, entonces tendriamos dos opciones para declarar este metodo en sus parametros:
        1. (Collection coleccion) => Indica que es de tipo object.
        2. (Collection<object> coleccion) => Indica que es de tipo object.

        Ambas indican lo mismo, ya que en el ejemplo 1, Java entiende que es de tipo object, en caso de no especificar el tipo dentro de los <>.
        Al decir que es de tipo object, el metodo entonces aceptara cualquier tipo de lista.
         */

        // Sintaxis lambda:
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });

        /*      Sintaxis, forEach:
        for (String elemento: coleccion ){
            System.out.println("elemento = " + elemento);
        }*/
    }
}
