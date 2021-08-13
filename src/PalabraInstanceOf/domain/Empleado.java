package PalabraInstanceOf.domain;

public class Empleado {

    private String nombre;
    private int edad;
    private int sueldo;

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String obtenerDetalles() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sueldo=" + sueldo +
                '}';
    }

}
