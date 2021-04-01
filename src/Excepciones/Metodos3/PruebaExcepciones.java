package Excepciones.Metodos3;

/*
Tema: Declaracion de las excepciones en un metodo.

FileNotFoundException => Excepcion para archivo no encontrado.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class PruebaExcepciones {

    public void leerArchivos() throws FileNotFoundException {

        /*
        Como leer metodo con: throws FileNotFoundException {}:
            Se lee: En algun momento este metodo puede tener una excepcion(throws) del tipo FileNotFoundException
            De manera que declaramos la excepcion cuando no queremos capturarla o evitarla en este metodo.
            Si no que vamos a utilizar otro metodo para ello (metodo "leer archivo2").

                Nota: Se puede cambiar FileNotFoundException por IOException que es su clase padre.
                Nota2: Podemos poner mas excepciones, simplemente hay que poner una <,> y poner el nombre:
                throws FileNotFoundException, RunTimeException {}
         */

        File archivo = new File("D:\\prueba\\texto.txt");
        FileReader fr = new FileReader(archivo);
    }

    public void leerArchivo2() throws IOException {
        leerArchivos(); // Aqui en este metodo ya se capturaria el error
    }

    public static void main(String[] args) {

    }

}
