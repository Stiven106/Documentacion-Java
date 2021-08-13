package POO5.Herencia;

public class Hijo extends Padre{

    private int codigoEstudiante;
    private float notaFinal;
    //Atributos: nombre, apellido, edad, estan inicializados en la clase padre, con la herencia no sera necesario inicializarlos.


    // Constructor clase HIJA

    public Hijo(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
    super(nombre,apellido,edad);
    /*
    Con esto decimos que esos atributos (nombre, apellido,edad) ya estan inicializados dentro de la clase padre.
    Por tanto ya no hace falta que se inicialicen de nuevo. Aqui se esta aplicando Herencia tambien.
    */

        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre // Accedo a nombre con el atributo "nombre" por que es protected.
                + "\nApellido: "+getApellido() // Ahora esta accedo con get (private), lo deje en privado para recordar que se puede de las 2 formas.
                +"\nEdad: "+getEdad() // Es atributo private, accedo por get.
                +"\nCodigo Estudiante: "+codigoEstudiante // Codigo estudiante es de esta clase, y esta en private. Por tanto puedo acceder asi.
                +"\nNota Final: "+ notaFinal // Lo mismo que Codigo Estudiante.



        );
    }

}
