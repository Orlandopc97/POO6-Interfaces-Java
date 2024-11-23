public class Main {
    public static void main(String[] args) {

        Circulo circulo1 = new Circulo();
        circulo1.setRadio(20.1);

        System.out.println("El area del circulo es: " + circulo1.calcularArea()+ " cm2");

        Cuadrado cuadrado1 = new Cuadrado();
        cuadrado1.setLado(20.5);

        System.out.println("El area del cuadrado es: " + cuadrado1.calcularArea()+ " cm2");
        cuadrado1.dibujar();

        Circulo circulo2 = new Circulo();
        circulo2.dibujar();
        circulo2.rotar();




    }
}
/*


*/


/*

PROGRAMACION ORIENTADA A OBJETOS (POO)

Introduccion:
    *PARADIGMA: (Manera de pensar // Manera de actuar)
        -Modelo, Patron o ejemplo que debe seguirse en determinada situación.
        -Se refiere conjunto de teorias o teoria que sirve de modelo a seguir para resolver problemas
        o situaciones determinadas.

    *PARADIGMA ORIENTADO A OBJETOS:
        -Se basa en un mundo lleno de objetos, donde la resolucion de problemas se realiza mediante
         el modelado/ abstraccion de objetos de la vida real.
        -Los objetos pueden comunicarse mediante mensajes entre si.
        -Se basa en agrupar codigo y datos juntos dentro de una misma unidad llamada CLASE.

   *-ABSTRACCIÓN: Traer algo del mundo real y abstraerlo al mundo logico(imaginario)
   *-INSTANCIAS = (solicitud de creaciones de objetos (solicitud, peticion, suplica, demanda, escrito, oficio)

   *CLASE (Caja/Plantilla/Molde) que permite construir objetos:
        -Representan "entidiades(objetos)" del mundo real.
        -Poseen atributos y metodos.
        -No pueden ser utilizadas directamente, sino mediante instancias a objetos.
            #EJEMPLO:
                -Tenemos la CLASE Alumno, seria el molde para construir objetos tipo Alumno: alumno1, alumno2, alumno3
                -Definen las propiedades (datos(atributos)) y comportamientos (metodos(funciones)) que caracterizan al objeto especifico
                -La clase al encapsular datos y funcionalidades relacionadas permiten la reutilizacion del codigo, lo organizacion modular y la abstraccion(traer)


                Clase Alumno:                   alumno1: Alumno

                +String apellido                apellido = Sanchez
                +String nombre                  nombre = Mario              <------OBJETOS
                                                                                     ALUMNO
                                                alumno2: Alumno

                                                apellido = Perez
                                                nombre = Juan

                                                alumno3: Alumno

                                                apellido = Suarez
                                                nombre = Daniela


        -Conjunto que contiene y agrupa codigo y datos.
            Estas clases tienen estas caracteristicas (POO):
                -ABSTRACCION
                -ENCAPSULAMIENTO
                -POLIMORFISMO
                -HERENCIA
                -UML (Lenguaje unificado(universal) de modelado): Todas las clases o modelado se puede representar por el estandar de diagramas de uml (diagrama de clase).

            #EJEMPLOS: AUTO, PERSONA, DEPARTAMENTO, FACTURA, RECIBO, PRODUCTO, ETC.


   *ATRIBUTOS: Son las caracteristicas o datos que describen el estado de un objeto en un contexto determinado
            -Pueden representar desde valores simples como numeros o cadenas de texto,
             hasta estructuras mas complejas como Objetos y otros tipos de datos.


    *METODOS:
            -Son acciones contenidas en una clase, y definen su comportamiento.
            -Son bloques de codigo que encapsulan una seria de acciones o comportamietos especificos
             asociados a un objeto.
            -Dentro de un sistema suelen detectarse como VERBOS EN INFINITIVO (terminan en ar, er, ir).
            -Los metodos permiten realizar operaciones sobre los datos de un objeto, modificar su estado interno
             y responder a eventos dentro de un programa.
            -Los metodos pueden acceder a los atributos de un objeto.
            -Pueden tener opcionalmente valores de entrada (parametros) y valores de salida (valores de retorno).
            -Pueden existir Procedimientos (no retornan un valor) y Funciones (retornan un valor).


        METODOS CONSTRUCTORES:
            -Son funciones especiales que contienen las clases para emitir la creacion de objetos.
            -Pueden recibir datos/parámetros como no (constructor vacio).
            -Se llaman SIEMPRE IGUAL que la clase.
            -No retorna NINGÚN VALOR (ni siquiera void).
            -Generalmente se utilizan dos tipos de constructores:
                >CONSTRUCTOR VACÍO
                >CONSTRUCTOR CON TODOS LOS PARÁMETROS

        METODOS GETTERS AND SETTERS:
            -Son metodos especiales que nos permiten traer los valores de cada uno de los atributos que tengamos de una clase.
            -Sirven en los casos de crear un objeto vacio, o se quiera modificar un valor del atributo del objeto (SET).
            -GEt puede ver los datos.
            -SET puede setearlos o modificarlos si ya existia un valor cargado.


    *OBJETOS:
        -Es la representacion de un objeto que generalmente exite en la vida real
        -Un objeto es una instancia de una clase(Crear un objeto de la clase alumno).
        -Posee un estado (atributos/caracteristicas).
        -Poseen un comportamiento(metodos(funciones))



    *HERENCIA:
        -Hay clases que comparten gran parte de sus caracteristicas
        -Heredamos ATRIBUTOS(CARACTERISTICAS) y COMPORTAMIENTOS (METODOS).
        -El mecanismo conocido con el nombre de herencia permite reutilizar clases: Se crea una nueva clase que extiende la
         funcionalidad de una clase existente sin tener que reescribir el código asociado a esta última.
        -La nueva clase, a la que se denomina subclase, puede poseer atributos y metodos que no existan en la clase original.
        -Los objetos de la nueva clase heredan los atributos y los metodos de la clase original, que se DENOMINA SUPERCLASE.
        -Clase principal se llama CLASE MADRE O PADRE y las que heredan son SUBCLASES O CLASES HIJAS.
        -Para la herencia, a la clase hija se le agrega la palabra reservada extends(extiende) de la clase padre que hereda,
         Ejemplo:
            public class Empleado extends Persona{}

        #EJEMPLO:
            -CLASE PERSONA: Clase generica que sirve para almacenar datos en comun de todas las personas.
                -Atributos:
                    -nombre
                    -dirección
                    -numTelefono

            -CLASE EMPLEADO: Hereda los mismos atributos de la clase persona (nombre, dirección, numTelefono), mientras puede incluir atributos propio
                -Atributos:
                    -numLegajo
                    -puesto
                    -cargo

            -CLASE CONSULTOR: hereda los mismo atributos de la clase persona (nombre, dirección, numTelefono), mientras puede incluir atributos propios
                -Atributos:
                    -empresaConsultora
                    -idConsultor


    *POLIMORFISMO: poli = muchas // morfismo = Formas (POLIMORFISMO = MUCHAS FORMAS)

        -Se refiere a la capacidad de objetos de diferentes clases de responder al mismo mensaje de manera diferente.
        -Un mismo metodo o mensaje puede producir diferentes resultados segun el tipo de objeto que lo reciba.
        -Esto permite escribir codigoo mas generico y reutilizable.
        -A partir de un objeto que pertenece a una clase madre, puedo tener objetos creados con clases hijas

            #Ejemplo:

            Clase madre:
                -Vehiculo

            Clases hijas:
                -Coche
                -Moto
                -Bus

            -Declaro la funcion estacionar(vehiculo){}
            -Invoco la funcion:
            estacionar(Coche){}
            estacionar(Moto){}
            estacionar(Bus){}



    *ENCAPSULAMIENTO: (public, private, protected)
        -Significa reunir todos los elementos que pueden considerarse pertenecientes a una misma entidad,
         al mismo nivel de abstracción. Nose debe confundir con el Principio de Ocultación.

        -El encapsulamiento permite 3 niveles de acceso:
            +PUBLIC (Público): Todo atributo o metodo que tenga delante podra ser utilizado desde cualquier clase,
             cualquier posicion de la aplicación.(visible o accesible).

            +PRIVATE (Privado) : Unicamente se puede utilizar dentro de la clase donde esta declarado o especificado,
             (visible oaccesible dentro de la clase donde esta declarado).

            +PROTECTED (Protegido): Establece que que el acceso a los atributos o metodos que esten declarados
             de esta manera solo pueden ser utilizados ademas de la misma clase, tambien en sus clases hijas cuando
             se aplique la herencia.

        -PRINCIPIO DE OCULTACIÓN: Cada objeto está aislado y únicamente expone una interfaz a otros objetos donde
         especifica cómo pueden interactuar con él. El aislamiento protege a las propiedades de un objeto
         contra su modificación por quien no tenga derecho acceder a ellas.



    *CLASES ABSTRACTAS:
        -Son un tipo particular de clase cuya principal caracteristica es que NO PUEDEN SER INSTANCIADAS.
        -Molde para creacion de otras clases
        -Generalmente decalara la existencia de métodos pero no su implementación,
         convirtiéndola así en una clase padre.
        -AL MENOS UNO DE SUS METODOS DEBE SER ABSTRACTO (puede tener métodos no abstractos).
        -Sus niveles de visualización deben ser public o protectec (nunca private).
        -Cuando se usan clases abstractas una clase no puede heredar de varias clases abstractas
         a la vez (como en el caso de las interfaces).
        -Generalmente las clases abstractas indican el "ES/SER" de un objeto.
        -Una clase no puede heredar de varias clases abstractas a la vez, solo de 1.
        -Se utiliza la palabra reservada "abstract", ejemplo: """""""public abstract class  Figura {}"""""""""



        Las clases abstractas se usan cuando deseamos definir una abstracción que englobe objetos de distintos
        tipos y queremos hacer uso del polimorfismo

            +Ejemplo:
                                    (HERENCIA)

                (CLASE ABSTRACTA)             (CLASES HIJAS)

                Figura     -posicionX           Circulo           Cuadrado              Rectangulo
                           -posicionY           posicionX         posicionx             posicionX
                                                posicionY         posicionY             posicionY
                                                radio             lado                  largo
                                                                                        ancho
                                                                  calcularArea()        clacularArea()





                -La clase figura, seria una clase abstracta, porque no tiene sentido calcular su área,
                 pero sí la de sus clases hijas (cuadrado, triangulo, rectangulo, etc).
                -Si alguna subclase(hija) de figura (cuadrado, triangulo, rectangulo, etc) no redefine el método calcularArea(),
                 debera declararse también como clase abstracta.


    *INTERFACES: (INTERFAZ = INTERCONEXION:
                        -Conexión funcional entre dos sistemas, programas, dispositivos o componentes de cualquier tipo,
                        que proporciona una comunicación de distintos niveles, permitiendo el intercambio de información.)

        -Son una COLECCIÓN DE MÉTODOS ABSTRACTOS con atributos (propiedades) CONSTANTES.
        -Todos los metodos son abstractos (solo puede tener métodos abstractos).
        -Una interfaz solamente puede extender o implementar otras interfaces (la cantidad que quiera de interfaces).
        -Da a conocer que se debe hacer (definicion del los métodos), pero sin mostrar su implememtacion.
        -Los métodos deben tener ACESSO PUBLICO (no pueden ser protected o private)
        -Solo puede tener "variables" PUBLIC STATIC FINAL (o sea CONSTANTES).
        -La palabra "abstract" en la definición de métodos no es obligatoria.
        -Genenralmente las interfaces indican el "PUEDE HACER" de un objeto

        -No se utiliza la palabra reservada extends sino IMPLEMENTS.

        +EJEMPLO:


            >Si se eliminan los atributos en FIgura, se puede convertir Figura en interfaz.
            >Figura nos da métodos que todas las figuras pueden tener; minetras que rotable y dibujable
             algunas pueden implementar.
            >No se utiliza la palabra EXTENDS sino la palabra IMPLEMENTS.

                                    #Interfaces:

            Rotable:                Figura:                     Dibujable:
            +rotar()                +clacularArea()             +dibujar()    <----- métodos abstractos


            #CLases:

                        Circulo:                    Cuadrado:

                    -radio (atributo)            -lado (Atributo)

                    +clacularArea()              +calcularArea()      <------ métodos
                    +dibujar()                   +dibujar()
                    +rotar()



 */