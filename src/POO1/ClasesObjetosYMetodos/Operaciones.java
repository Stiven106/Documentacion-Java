package POO1.ClasesObjetosYMetodos;
import javax.swing.*;

// Encontraras ejemplos de: Clases, objetos, metodos y constructores.

  /* Metodos =>> */  /*      METODOS:

Un metodo es una accion o comportamiento de los objetos.


Estructura: public void metodo (Argumentos) {Cuerpo}

<Explicacion de estructura>

public => modificador de acceso
void => valor de retorno
metodo => nombre del metodo
argumentos => datos con los cuales este metodo va a trabajar, cuyas variables definidas dentro seran locales.

*/

/* Constructores =>> */ /*

    1.  Un constructor es un metodo especial de una clase que se invoca siempre que se crea un objeto de esa clase.
    2.  Se inicializan los atributos de ese objeto.
    3.  Se invoca al constructor de la clase que puede ser uno entre varios.

    Ejemplo:

    Persona p1 = new Persona(); =>> Constructor vacio
    Persona p2 = new Persona("Juan Carlos", 26, "Hombre"); =>> Constructor con argumentos.

    Caracteristicas:

    1.  Tienen el mismo nombre de la clase <Ej: (Persona) Observe el ejemplo>
    2.  No devuelve ningun valor.
    3.  Debe declararse como publico.

*/

/* Parametros y argumentos =>> */ /*
    Parametros: una declaracion de variable u objeto. Son parametros cuando estan dentro de la declaracion del metodo.
    argumentos => datos con los cuales este metodo va a trabajar. Son argumentos cuando estan en la invocacion del metodo.

    Ejemplo parametros - declaracion del metodo:
    public void metodo(int param1, String param2  <Esto son parametros>) {

            Se utilizan parametros parametros:

        Ejemplo: this.variable = param1;

    }

    Ejemplo argumentos - invocacion del metodo:

    objeto.metodo(10, "argumento2");


     */

public class Operaciones {

    // Atributos
    int suma;
    int resta;
    int division;
    int multiplicacion;
    int num1;
    int num2;

    // Metodos constructores

    public Operaciones() {// Vacio

    }

    public Operaciones(int a, int b) { // Metodo constructor con parametros.
        //this.num1 = a;
        //this.num2 = b;

        suma = a+b;
        System.out.println("suma = " + suma);
    }

    //Metodos

    //Metodo para pedir valores a ingresar

    public  void leerNumeros() {
        this.num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        this.num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

    }

    // Metodo suma

    public void sumar() {

        suma = num1+num2;
    }

    //Inicio de Declaracion del metodo


    public void sumar(int a, int b) {
        // Lo que este adentro de los {} se le llamada cuerpo del metodo

        suma = a+b;
        System.out.println("suma = " + suma);
    }
    // Fin declaracion del metodo
    
    public void restar() {
        resta = num1-num2;
    }
    public void Multiplicacion() {
        multiplicacion = num1*num2;
    }
    public void division() {
        division = num1/num2;
    }

    public void  mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La Division es: " + division);
    }




}
