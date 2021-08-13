package POO7.ClasesAbstractas;
/*
        Teoria

        1. Se utilizan solo como super clases (clase padre).
        2. No se pueden instanciar objetos.
        3. Sirve para proporcionar una super clase apropiada a partir de la cual heredan otras clases.
 */


public abstract class SerVivo {

    /*
    Cuando un metodo es muy generico, se le pone la palabra abstract, para que se implemente en las clases hijas que
    vienen despues. Por ejemplo, tenemos el metodo alimentarse de la clase SerVivo, sabemos que todos los seres vivos
    se alimentan, pero no todos se alimentan de la misma forma. Por tanto lo que hacemos aqui es llamar al metodo abstracto
    y por ende a la clase tambien, debido a que al llamar un metodo abstracto si o si tenemos que marcar la clase igual,
    y posteriormente procedemos a crear las clases hijas, siendo cada ves mas especificas, hasta que el metodo ya no sea
    abstracto. Observa todas las clases de este paquete para entender un poco mas a que me refiero.

    Orden de clases a revisar dentro del paquete: 1. Planta, 2.Animal, 3.AnimalCarnivoro, 4. test.
     */

    public abstract void alimentarse();{}
}
