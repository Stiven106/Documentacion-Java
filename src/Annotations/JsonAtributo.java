package Annotations;

import java.lang.annotation.*;

/*
Annotations: Tiene una estructura muy parecida a una interface, pero nos permite agregar metadata o configuracion a nuestras clases, ya sea
a la clase o metodos. Esto en favor a un codigo mas limpio y orientado a objetos. Es una caracteristica de Java 5.
Las anotaciones se utilizan mucho en frameworks, por ejemplo: Spring, hibernate JPA, para mapear una clase a una tabla de base de datos, etc...

 */

// Agregando configuraciones:
@Documented // Si lo queremos agregar a la API DOCK por ejemplo...
@Target(ElementType.FIELD) // Puede ser para el constructor, campo, atributo, clase, etc... En este caso es Field = sobre atributos.
@Retention(RetentionPolicy.RUNTIME)// CLASS = TIEMPO DE COMPILACION. RUNTIME = TIEMPO DE EJECUCION. SOURCE = NINGUNO DE LOS 2.

public @interface JsonAtributo {
    String nombre() default "";


}
