package PatronesDeDiseño;

public class PatronDao {

    /*
                                INTRODUCCION


        La mayoría de las aplicaciones, tienen que persistir datos en algún momento, ya sea serializándolos, guardándolos en una base de datos relacional,
        o una base de datos orientada a objetos, etc. Para hacer esto, la aplicación interactúa con la base de datos.
        El "como interactúa" NO debe ser asunto de la capa de lógica de negocio de la aplicación, ya que para eso está la capa de persistencia,
        que es la encargada de interactuar con la base de datos. Sabiendo esto, podemos decir que DAO es un patrón de diseño
        utilizado para crear esta capa de persistencia.

        Pero... ¿de qué sirve tener una capa de persistencia?

        Bueno, imaginemos que hicimos una aplicación de gestión para nuestra empresa. Utilizando como motor de base de datos Oracle.
        Pero no tenemos dividida la capa de lógica de negocio de la de persistencia. Por lo que la interacción con la base de datos se hace
        directamente desde la capa de lógica de negocio. Nuestra aplicación consiste en muchísimas clases, y gran parte de ellas interactúan
        con la base de datos (conectándose a la base de datos, guardando y recuperando datos, etc.).

        Nuestra aplicación va de maravilla, cuando de pronto, se acerca nuestro querido jefe y nos comenta que por X, Y y Z razones se va a cambiar el
        motor de la base de datos a PostgreSQL. En ese momento nos retiraríamos sigilosamente hacia la heladera más cercana para abrirla descalzos y
        con los pies mojados.

        Si hubiéramos tenido por separado la capa de lógica de negocio de la de persistencia, habría sido suficiente con modificar la capa de
        persistencia para que la aplicación pudiera utilizar el nuevo motor de base de datos, sin tener que modificar nada de la capa de lógica de negocio.
        Pero como en el ejemplo anterior NO usamos una capa de persistencia, sino que interactuamos con la base de datos directamente desde la capa de lógica
         de negocio, entonces vamos a tener que modificar todas las clases, cambiando todas las consultas SQL, la manera de acceder a la base de datos, etc.
         para adecuarse al nuevo motor de la base de datos.

        Bien, ahora que sabemos porque es importante tener separadas las capas de lógica de negocio y de persistencia,
        vamos a ver como utilizar el patrón de diseño DAO para crear nuestra propia capa de persistencia.


                                COMO FUNCIONA DAO

        Como dijimos antes, DAO encapsula el acceso a la base de datos. Por lo que cuando la capa de lógica de negocio necesite
        interactuar con la base de datos, va a hacerlo a través de la API que le ofrece DAO. Generalmente esta API consiste
        en métodos CRUD (Create, Read, Update y Delete). Entonces por ejemplo cuando la capa de lógica de negocio necesite guardar un dato en
         la base de datos, va a llamar a un método create(). Lo que haga este método, es problema de DAO y depende de como DAO implemente el método create(),
         puede que lo implemente de manera que los datos se almacenen en una base de datos relacional como puede que lo implemente de manera que los datos
         se almacenen en ficheros de texto. Lo importante es que la capa de lógica de negocio no tiene porque saberlo, lo único que sabe es que el método
         create() va a guardar los datos, así como el método delete() va a eliminarlos, el método update() actualizarlos, etc. Pero no tiene idea de como
         interactúa DAO con la base de datos.

        En una aplicación, hay tantos DAOs como modelos. Es decir, en una base de datos relacional, por cada tabla, habría un DAO.

        DAO consiste básicamente en una clase que es la que interactúa con la base de datos. Los métodos de esta clase dependen de la aplicación y de
        lo que queramos hacer. Pero generalmente se implementan los métodos CRUD para realizar las "4 operaciones básicas" de una base de datos.

        Bien, nos falta comprender algo más para poder empezar a ver código. Los DTO (Data Transfer Object) o también denominados VO (Value Object).
        Son utilizados por DAO para transportar los datos desde la base de datos hacia la capa de lógica de negocio y viceversa. Por ejemplo, cuando la
        capa de lógica de negocio llama al método create(), ¿qué es lo que hace DAO? inserta un nuevo dato... ¿pero qué dato? el que la capa de lógica
        de negocio le pase como parámetro... ¿y cómo se lo pasa este dato? bueno, a través de un DTO.

        Podría decirse que un DTO es un objeto común y corriente, que tiene como atributos los datos del modelo, con sus correspondientes accessors
        (getters y setters).

        Por ejemplo, si tuviéramos una base de datos relacional con una tabla employers, con los campos id, name y salary. Entonces tendríamos que
        crear una clase EmployerDTO, con los atributos id, name y salary, que van a utilizar la capa de negocio y de persistencia para transportar los
        datos entre las dos capas.

        Entonces cuando la capa de lógica de negocio quiera guardar un dato en la base de datos, va a crear un objeto EmployerDTO, a través de los
        accessors va a modificar los atributos, y después se lo va a pasar al método create() de DAO. Entonces DAO va a leer los datos del DTO, y los va
        a guardar en la base de datos. Lo mismo pasaría para eliminar datos. Y para actualizarlos además se le pasaría el ID, para saber que dato actualizar.
         Para buscar datos, sería parecido, ya que se le pasa al método read() el DTO para usarlo como patrón de búsqueda, pero con la diferencia de
         que este método tiene valor de retorno, ya que devuelve otro DTO con los datos del resultado de la búsqueda.


     */
}
