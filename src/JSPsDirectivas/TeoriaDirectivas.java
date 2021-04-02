package JSPsDirectivas;

public class TeoriaDirectivas {
    /*

                    DIRECTIVAS EN LOS JSP'S

        Las directivas nos permiten controlar el comportamiento de un JSP

            Con las directivas podemos especificar:

                *Las clases Java que queremos importar en un JSP
                *El tipo MIME utilizado
                *Indicar si el JSP puede acceder a la sesion HTTP
                *El tamano del buffer de salida
                *Indicar la pagina JSP de error en caso de alguna Excepcion
                *El manejo de multihilos, entre otros.

        ATRIBUTOS EN LAS DIRECTIVAS DE UN JSP

            Atributo import:

            <%@page import ="paquete.Clase1 , paquete.ClaseN" %>
                * Nos permite especificar cuales son las clases que vamos a importar dentro de nuestro JSP, e indirectamente a nuestro Servlet
                generado a partir de la solicitud a nuestro JSP. El import se debe poner al principio como esta en el ejemplo como, esto hace parte
                de las buenas practicas.

            Atributo contentType:

            <%@ page contentType="MIME-Type" %>
                *Tipo de respuesta que vamos a enviar a nuestro cliente.

            Atributo session:

            <%@ page session="true" %>
                *Indicar si el JSP va a poder acceder al objeto session que se halla creado anteriormente. Por default esta configurado para
                acceder al objeto session, si queremos lo contrario tendremos que poner "false".

            Atributo isELIgnored:

            <%@ page isELIgnored="false" %>
                *Si queremos deshabilitar el manejo de expressions lenguaje, tendremos que indicar por medio de esta directiva page:
                <%@ page isELIgnored="true" %>. Por default un JSP puede utilizar el concepto de Expressions lenguaje.

            Atributo buffer:

            <%@ page buffer="tamañoEnKb" %>
                *Podemos especificar el tamano en kB que puede contener nuestro buffer del JSP y si llegamos al tamano especificado en
                este JSP, entonces se hace un flutch o vaciado de manera autocamaticamente de todo el flujo que hallamos agregado a nuestro
                objeto PrintWriter()

            Atributo errorPage:

            <%@ page errorPage="url relativo al JSP de error" %>
                *Permite especificar cual sera el JSP que va a manejar la Excepcion en caso de que tenga un error.

            Atributo isErrorPage:

            <%@ page isErrorPage="True" %>
                *Otra directiva en otro JSP: Esta directiva se va a agregar al JSP que va a manejar los errores. Por default esta en false
                debido a que los JSP no van a manejar las Excepciones de forma automaticamente.

            Atributo isThreadSafe:

            <%@ page isThreadSafe="true" %>
                *Especificamos que un JSP se considera seguro para ser accedido por multiples hilos. Por default esta en true.

            Atributo extends:

            <%@ page extends="paquete.NombreClase" %>
                *Nos permite heredar de una clase en el atribute extends, y por tanto nuestro JSP va a heredar las caracteristicas de la
                clase que especifiquemos. Normalmente se utiliza cuando queramos manejar comportamientos de terceros. Por lo general
                casi no se utiliza.

     */



}
