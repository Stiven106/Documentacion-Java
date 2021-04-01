package Excepciones.Jerarquia2;

/*
Superclase Throwable extiende => Exception extiende => IOException = Excepciones Verificadas
Superclase Throwable extiende => Exception extiende => RunTimeExcepcion = Excepciones No Verificadas
Superclase Throwable extiende => error extiende = Errores de hardware. No depende del programador.

IOException: Tiene que ver con las entradas y salidas del programa. Por lo general sucede por que un usuario x elimina un
archivo de texto, el cual apuntaba a la ruta a leer para que funcione el programa. Por tanto en un principio funcionaba bien,
y por error de un usuario deja de funcionar. Por tanto son Verificadas.

RunTimeExcepcion: Pequeñas fallas que si dependen del programador, por ejemplo dividir un numero entero entre 0 1/0.
Otro ejemplo: Tener un arreglo de 5 posiciones, y querer borrar la posicion 7. Esta posicion no existe, por tanto es un RunTimeExcepcion error.


 */


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Verificada_NoVerificada {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Excepciones Verificadas (IOException)

        // Lectura de un archivo de texto (.text)
        BufferedReader bf = new BufferedReader(new FileReader("D:\\prueba\\texto.txt"));
        /*
        Supongamos que alguien borra ese archivo, en ese caso es una IOException = Excepcion Verificada.

        Cuando hay una excepcion de este tipo hay dos opciones:

            1. Declaramos la excepcion que se puede dar dentro del metodo
            2. Capturar la excepcion con un try catch
         */
        String linea;

        //

        while ((linea = bf.readLine()) != null) {
            System.out.println(linea);
            /*
            error: FileNotFoundException

                Si buscamos en la API de Java, encontraremos que extiende de la clase IOException, por tanto es Excepcion Verificada.
             */
        }

        // Excepciones NO Verificadas (RunTimeExcepcion)
        // Division entre 0

        int num1 = 5, num2 = 0;
        int resultado = num1 / num2;
        System.out.println("resultado = " + resultado);// En estas excepciones no se suele utilizar try catch, sin embargo se puede.

       /*
       Al ejecutar este codigo nos sale:

           Exception in thread "main" java.lang.ArithmeticException: / by zero
           at Excepciones.Jerarquia.Teoria.main(Teoria.java:43)

       Si buscamos java.lang.ArithmeticException en la API de Java, observaremos que es una clase hija de RunTimeException
       De esa forma sabremos si es Verificada o NO Verificada, dependiendo de quien extiende en este caso es NO Verificada.
        */

    }

}
