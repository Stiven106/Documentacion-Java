package APICollections.test;

import java.util.*; // Este es el que debe importarse. NO java.awt.

/*
    Las listas: Guardan el orden a medida que se van agregando elementos. Permite la duplicacion de elementos. Utiliza .add para ingresar elementos.
    Set: No mantienen un orden, y no se pueden duplicar elementos. Utiliza .add para ingresar elementos
    Map: No mantienen un orden, no se pueden duplicar elementos. Utiliza .put para ingresar elementos. keySet() - values() son Metodos para imprimir.

 */
public class TestColecciones {
    public static void main(String[] args) {

                //Tipo lista

        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes"); // Se puede duplicar elementos.

        //imprimir(miLista);

                //Tipo set
        Set miSet = new HashSet();// HashSet: No respeta el orden, puede que si lo haga, pero seria por coincidencia.

        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes"); // No se puede duplicar elementos.

        //imprimir(miSet);
        //Aunque set no respete el orden, la ventaja del set es que es mas rapido, y en ocasiones se recomienda utilizar mas que la lista, si es que no hay necesidad de un orden.


                //Tipo map

        Map miMapa = new HashMap();
        // Agregar elementos
        miMapa.put("key1","Juan");// La llave seria key1..... El valor "Juan"
        miMapa.put("key2", "Karla"); // La llave seria key2..... El valor "Karla"
        miMapa.put("key3", "Rosario");// // La llave seria key3..... El valor "Rosario"
        miMapa.put("key3", "Se sustituye, mas no se repite.");// No se permite duplicar. Y se sustituye si se cambia el valor.

            // Imprimir por llave

        String elemento = (String) miMapa.get("valor1"); // Le ponemos (String) para convertirlo de tipo Object a String.
        System.out.println("elemento = " + elemento);

        // Imprimir con metodo

        imprimir(miMapa.keySet()); // Imprimir llaves = keySet()
        imprimir(miMapa.values());// Imprimir valores = values()


    }

    public static void imprimir(Collection coleccion ){
        /*Comento esto, por que lo hare mejor con una funcion lambda, pero ahi lo dejo para ver como seria con el for.
        for (Object elemento: miLista) {
            System.out.println("elemento = " + elemento);// Imprime de forma ordenada, a medida que se fueron agregando.
        }*/
                // Funcion lambda o funcion flecha
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
