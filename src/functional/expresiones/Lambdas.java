package functional.expresiones;

import java.text.SimpleDateFormat;
import java.util.function.*;
import java.util.*;

public class Teoria {
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

        Consumer<Date> consumidorFecha = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");

            System.out.println(f.format(fecha));
        };


    }








}
