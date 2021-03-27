package Generics.genericos;

/*
    Un tipo generico en java, es un tipo comodin, en el cual cuando definimos nuestra clase no vamos a indicar el tipo de dato que va a almacenar
    o utilizar nuestra clase, si no que hasta el momento en el que creamos un objeto de esta clase, es entonces cuando vamos a especificar el tipo
    de dato que vamos a utilizar. Existen diferentes nomenclaturas para identificar un tipo generico, veamos cuales:

    Nombre Tipo Generico    |   Significado del tipo Generico
    E                           Element (Utilizado generalmente por el framework de Colecciones de Java)
    K                           Key (Llave, utilizado en mapas)
    N                           Number (utilizado para numeros)
    T                           Type (representa un tipo, es decir, una clase)
    V                           Value (representa un valor, tambien se usa en mapas)
    S,U,V etc.                  Usado para representar otros tipos


 */


    public class ClaseGenerica<T> {

    private T objeto;

        public ClaseGenerica (T objecto) {
            this.objeto = objecto;
        }

        public void obtenerTipo() {
            System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
        }




    }
