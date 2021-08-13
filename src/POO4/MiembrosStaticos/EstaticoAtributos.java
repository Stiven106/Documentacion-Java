package POO4.MiembrosStaticos;

public class EstaticoAtributos {

    private static String frase = "primera frase"; // Variable de la clase
    private String fraseNoStatic = "Desde clase"; // Variable del objeto individualmente.

    public static void main(String[] args) {

        /*
        Caracteristica importante: Cuando una variable es estatica, no hace falta instanciarla, ver Clase "Ejercicios.java" para entenderlo mejor.

        Cuando una variable es estatica, todo cambio que yo haga repercute en la variable, independientemente de en donde este.
        Me explico: Si la variable "frase" no fuera estatica, al cambiar la frase por "Segunda frase" el cambio repercute unicamente en
        el objeto2, pero como es estatica, el cambio repercute en todos los objetos, y esto hace que el resultado de objeto1 y objeto2 sea el mismo.
        Cuando es estatico ya no le pertenece la variable a cada objeto individualmente. Pasa a ser de la clase.

         */

        EstaticoAtributos objeto1 = new EstaticoAtributos();
        EstaticoAtributos objeto2 = new EstaticoAtributos();

        // Static:

        objeto2.frase = "static frase"; // Como la variable es static, el valor se ejecuta en todos los objetos.


        // Observa como el resultado de frase (variable static), cuando se cambia su valor en un objeto, cambia en el resto de objetos tambien.
        System.out.println(objeto1.frase);
        System.out.println(objeto2.frase);

        // No Static

        objeto2.fraseNoStatic = "Desde objeto2";

        // Ahora mira el caso de una variable no static, se imprime el valor de objeto1, que es el de la clase, y el de objeto2 que fue el que
        // se cambio por "desde objeto2". Su valor cambia dentro del objeto, pero todos los demas objetos continuan teniendo su valor independiente.

        System.out.println(objeto1.fraseNoStatic);
        System.out.println(objeto2.fraseNoStatic);


    }



}
