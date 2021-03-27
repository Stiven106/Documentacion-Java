package Annotations;

import Annotations.models.Producto;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

public class EjemploAnotacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro roble");
        p.setPrecio(1000L);
        Field[] atributos = p.getClass().getDeclaredFields();

        Arrays.stream(atributos).

    }
}
