package functionalAPIStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRangeYStatics {
    public static void main(String[] args) {

        /* Intervalos o rangos:
            El metodo Stream no tiene un metodo por si solo para crear un intervalo de enteros, algo asi como "Stream.range" no existe, pero
            Si tenemos un metodo que se llama IntStream, un metodo distinto a IntStream que permite definir un rango de un dato.
            Ahora bien, el IntStream no requiere un generic que defina el tipo de flujo por lo que simplemente podemos definir
            el tipo de dato y posteriormente asignar el nombre de la variable como veremos a continuacion.
            En esta clase aprenderemos a utilizarlo.
        */

        IntStream num = IntStream.range( 5,20).peek(System.out::println);
        /* Aclaracion del metodo range: Existen 2 metodos, range como lo observamos arriba y rangeClosed, la diferencia entre uno
        y otro, es que el range por si solo no incluye el ultimo numero, mientras que rangeClosed si lo incluye.
        Es decir, el .range excluye el 20 en este caso
        Y por otro lado, el .rangeClosed incluiria el 20.  */

        Integer resultado = num.sum();/* sum solo esta disponible en un Stream de enteros, es decir, en un IntStream */

        /* Ya vimos el IntStream pero existen otros para dobles o floats, pero en si su funcionamiento es el mismo! */
                            /* Fin rangos, inicio Statics! */

        /* SummaryStatistics: Nos permite obtener varios parametros de estadisticas, por ejemplo:
        1. obtener el mayor
        2. obtener el menor
        3. obtener la suma
        4. obtener el promedio */
        IntSummaryStatistics stats = num.summaryStatistics();
        System.out.println("max: " + stats.getMax());
        System.out.println("max: " + stats.getMin());
        System.out.println("max: " + stats.getSum());
        System.out.println("max: " + stats.getAverage());
        System.out.println("max: " + stats.getCount());

        System.out.println(resultado);

    }

}
