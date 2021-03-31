package ServletsCodigosDeEstado;

public class Teoria {

    /*


    Los codigos de estado se utilizan para indicar el estado de la respuesta del servidor web hacia el cliente (navegador web).

            Metodos que se utilizan para manejar los codigos de estado desde un servidor web:

    Por medio de HttpServletResponse del API de los Servlets vamos a utilizar cualquiera de estos metodos para indicar al navegador web
    el estatus de respuesta del servidor hacia el cliente:

    *response.setStatus(int codigo) => Indicamos un numero que es un codigo, normalmente utilizaremos constantes que tenga asociado un codigo, el
    cual se procesa por el navegador web.  Ej constantes: SC_OK, SC_NOT, SC_NOT_FOUND, etc.

    *response.sendError(int codigo, String mensaje) => Podemos indicar no solo el codigo, si no tambien un mensaje de error, o codigo de error.

    *response.sendRedirect(String url) => Permite especificar URL para redirigir al cliente. No hay necesidad de
    indicar ningun cabecero indirectamente, debido a que este metodo ya contiene un codigo de estado. El codigo de estado es el 302.


        Estos son algunos de los metodos que podemos utilizar para manejar los codigos de estado desde nuestro servidor web hacia el cliente.


            Codigos de estados HTTP mas comunes:

    *200(Ok): La respuesta fue correcta, es el codigo de estado por default.

    *204 (Sin contenido): El navegador continua desplegando el documento previo.

    *301 (Movido Permanentemente): El documento solicitado ha cambiado de ubicacion, y posiblemente se indica la nueva ruta, en ese caso el
    navegador se redirreciona a la nueva pagina de manera automatica

    *304 (encontrado): El documento se ha movido temporalmente, y el navegador se mueve al nuevo url de manera automatica.

    *401 (Sin autorizacion): No se tiene permiso para visualizar el contenido solicitado, debido a que se trato de acceder a un recurso protegido
    con contrasena sin la autorizacion respectiva.

    *404 (No encontrado): El recurso solicitado no se encuentra alojado en el servidor Web

    *500 (Error interno del Servidor Web): El servidor web lanzo una excepcion irrecuperable, por lo tanto no se puede continuar procesando la
    peticion.










     */
}
