package PatronesDeDiseño;

public class TeoriaDeCapas {
    /*

                Capa de datos Java JDBC

        En una arquitectura de Java empresarial es comun que la aplicacion se divida en varias capas, y cada una es responsable de realizar
        tareas en especifico. Debido a la complejidad de los sistemas y los problemas a los que nos enfrentamos diariamente, existe el concepto
        de buenas practicas, y tambien el concepto de patrones de diseño, con el objetivo de reducir los problemas mencionados anteriormente.
        Las buenas practicas incluyen temas de codificacion, division de responsabilidades en capas logicas, entre otros temas... A su vez los
        patrones de diseño, como su nombre lo dice, resuelven un problema que se presenta de manera recurrente, es decir un patron en el desarollo
        de sistemas. En particular en sistemas orientados a objetos. Un tema fundamental en el diseño de sistemas es: cohesion y acoplamiento.
        Este tema entra en juego cuando manejamos varias capas logicas, ya que cada capa es responsable de determinada funcionalidad.

        *Capa de presentacion: Se encarga de administrar el flujo entre las distintas pantallas del sistema. Asi como procesar los datos del
        usuario, es decir, los formularios. Y desplegar la informacion al usuario.

        *Capa de Negocio: Se encarga de procesar la logica de negocio y/o servicios del sistema

        *Capa Datos: Obtiene y guarda informacion de las fuentes de datos, como son: Una BD, archivo, etc.

            Las capas se intercomunican para procesar la informacion, desde que hace una peticion hasta que el sistema responde al usuario.

        *Caracteristicas:

        El objetivo del diseño es minimizar costos de desarrollo.

            |1. Cohesion
        La cohesion, es la medida en la que un componente de software se dedica a realizar solo la tarea para la cual fue creado, delegando las
        tareas complementarias a otros componentes

            |2. Acoplamiento
        El acoplamiento es la medida en que los cambios de un componente tiende a necesitar cambios de otro componente.


        El objetivo del diseño de software es tener una alta cohesion y un bajo acoplamiento entre sus componentes de software.


                Patrones de diseño

        Es una guia que puede involucrar varias clases, y que a su vez nos permite resolver un problema que se presenta de manera repetitiva.

        Cuando hablamos de las capas de una arquitectura de Java EE (Java empresarial), en este caso la capa de presentacion, servicio y Acceso a
        Datos. Cada capa puede tener varios patrones de diseño:

        Capa Presentacion: MVN - Front Controller - DTO - etc...

        Capa Servicio: Business Delegate - Service Locator - DTO - etc...

        Capa Acceso a Datos: DAO - DTO - etc...

        De momento solo es importante saber que existe una separacion de responsabilidades en cada una de las capas JAVA EE.
        Cabe mencionar que existe un catalogo extenso de patrones Java, y los aqui mencionados son solo algunos de los que existen.








     */
}
