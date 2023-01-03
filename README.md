# ejerciciopatron
Resolución de los ejercicios 6,7 y 8 

Características Principales Y Usos De Patrones Mas Conocidos

1. Patrones Creacionales: 
-	Patrón Singleton:

Este patrón permite que una clase tenga una única instancia

*	Solo puede haber una instancia de una clase
*	Sirve para compartir el acceso a un mismo fichero
*	Sirve para compartir la conexión a una BD
*	Puede evitar la instancia de una app múltiple veces 

-	Patrón Builder

El patrón Builder nos permite construir objetos complejos paso a paso y además producir diferentes tipos y representaciones de un objeto con el mismo código de construcción

*	Reutilización del mismo código de construcción
*	Construcción de objetos paso a paso
*	Construcción de objetos complejos de manera flexible y extensible
*	Una app de customización de carros donde un carro pueda tener diferentes combinaciones de características como el color, tipo de motor, carrocería etc.
 
-	Patrón Prototype
Prototype tiene como objetivo clonar una clase, es decir, clonarse a si misma y heredar todos los métodos, propiedades y su estado.
*	Clonar objetos heredando sus propiedades
*	Evitar código repetido de inicialización
*	Creación de objetos complejos con más facilidad
*	Creación de objetos con una configuración predeterminada
*	Puede servir por ejemplo cuando se está trabajando con una base de datos con mucha información y queremos crear una BD en base a la que ya se tenia sin afectar a la anterior

-	Patron Factory

Este patrón permite crear una jerarquía de clases y utilizar una u otra de manera trasparente 

*	Creación de objetos de una clase o un grupo de clases relacionadas de manera flexible
*	Un uso podría ser un sistema de creación de objetos empleados en donde cada empleado puede tener atributos diferentes y configurarlos de manera independiente podría ser costoso, para ello podríamos hacer uso de este patrón para crear un sistema de fabricación de empleados en donde los configure correctamente. 

2. Patrones Estructurales:
-	Patrón Adapter 

Este patrón permite la colaboración entre objetos con interfaces incompatibles 

*	Bueno para adaptar librerías viejas a nuevas
*	Cuando tenemos código viejo y queremos actualizarlo sin tener que afectarlo en sí.
*	Un ejemplo claro de uso de este patrón es cuando queremos usar una librería de terceros, pero su interfaz no es compatible con nuestra aplicación, en este caso se hace un Adapter para hacerla compatible

-	Patrón Facade 

Proporciona una interfaz simple a algo complejo que hay por detrás

*	Aislar el código complejo
*	Algunos ejemplos de este patrón pueden ser para un sistema de búsqueda que, a partir de una interfaz sencilla para el usuario, que se le oculte la complejidad del proceso de búsqueda definida, o tambien para un sistema de atención al cliente. 

-	Patrón Decorator

Permite añadir funcionalidad a una clase o objeto sin modificar la clase/objeto

*	Extender el comportamiento de un objeto sin crear una nueva subclase
*	Poder añadir o eliminar responsabilidades de un objeto durante el tiempo de ejecución 
*	Combinar varios comportamientos envolviendo a un objeto con varios decoradores 
*	Su uso puede ser desde un sistema de notificaciones donde tenga que enviar un mensaje a diferentes plataformas o un sistema de personalización de productos donde el usuario pueda agregar diferentes adornos al producto de manera dinámica  

3. Patrones Comportamiento: 

-	Patrón Iterator

Permite recorrer elementos de una colección sin exponer como estan almacenados internamente en esa clase

*	Un uso de este patrón sería un gestor de proyectos, donde se pueda recorrer las tareas asignadas a un miembro del equipo y a su vez mostrar una vista de las tareas generales del equipo.

-	Patrón Observer

Este patrón te permite definir un mecanismo de suscripción para notificar a varios objetos sobre cualquier evento que le suceda al objeto que están observando.

*	Puedes agregar subscriptores sin tener que cambiar el código de la notificadora y viceversa
*	Su uso es muy amplio
*	Es utilizado en aplicaciones que permitan hacer notificaciones a sus usuarios, seguimiento de envíos o en aplicativos meteorológicos    

-	Patrón Mediator

El patrón mediator actúa como un intermediario entre dos o más objetos, es decir dos objetos no se comunicarán directamente entre sí, si no a través de un mediador únicamente

*	Comunicar unos objetos con otros y el objeto que emite no recibe.
*	Se usa mucho en interfaces de usuario, aplicativos de comunicación o videoconferencia 

-	Patrón State

Permite a un objeto alterar su comportamiento cuando su estado interno cambia.

*	Si no pasa una cosa no puede pasar otra cosa.
*	Hasta que no hagas una cosa no puedes hacer la otra
*	Algunos usos de este patrón podrían ser en maquina expendedoras o una aplicación de reproducción de música. 

-	Patrón Strategy

Crear un envoltorio sobre varias funciones de forma que un mismo código se pueda usar de manera diferentes.

*	Puedes intercambiar algoritmos usados dentro de un objeto durante el tiempo de ejecución
*	Puedes sustituir la herencia por composición 
*	Se puede usar en una aplicación de comercio electrónico para calcular el costo del envió en función de la ubicación del comprador y el vendedor 
