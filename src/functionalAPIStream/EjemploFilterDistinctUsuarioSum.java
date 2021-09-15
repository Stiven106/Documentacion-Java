package functionalAPIStream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import functionalAPIStream.models.Usuario;

public class EjemploFilterDistinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoNombres= Stream
        .of("Pato Guzman", "Paco Gonzales","Paco Gonzales","Paco Gonzales", "Pepa Mena", "Pepe Marin", "Pepe Garcia")
        .map( nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
        .distinct()
        .mapToInt( u -> u.toString().length())
        .peek(System.out::println);
       
        //largoNombres.forEach(System.out::println); /* Recuerda que solo puede haber un operador final, de lo contrario da un error. Comento esta linea por eso, forEach es un operador final y sum igual. */
        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        //System.out.println("total: "+largoNombres.sum()); Este sum es de tipo final, por ende detiene el flujo, si queremos utilizarlos todos debemos utilizar intSummaryStatistics, y luego hacer lo siguiente:
        System.out.println("total: " + stats.getSum());
        System.out.println("max: " + stats.getMax());
        System.out.println("min: " + stats.getMin());
        System.out.println("promedio: " + stats.getAverage());
    }

}
