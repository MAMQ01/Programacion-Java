package Unidad9Java.maratonEjercicios;

interface Figura3D_v4 extends Figura3D_v3 {
    
    abstract public double superficie();
    
    public static void ocupaMasque(){
        System.out.println("Implementa esta funcion en todas las subclases que verifica los volumenes");
    };
    /* Cuestión 1: ¿Al añadir el nuevo método a la interfaz, si no modificamos las clases que la implementan ¿se produce algún error? ¿Por qué? ¿Cómo evitamos esta situación? */

    /*
     Si, si la interfaz implementa una clase abstracta es obligatorio que las subclases implementen estos metodos en sus clases propias.
     Porque los metodos abtractos no se implementan donde se declaran pero si se implementan en las subclases. Por lo tanto, se soluciona añadiendo el metodo en el lugar que lo necesitamos (ahora sin el abstract).

    Al añadir el metodo superficie() en la nueva interfaz Figura3D_v4 las clases que eran hijas de Figura3D_v3, como ahora son hijas de la clase Figura3D_v4 deben implementar si o si las clases todas las clases abstract (incluye las clases abstractas de Figura3D_v3, porque se extiende a Figura3D_v4). 
    */

    //Pregunta, por qué la siguiente afirmación es cierta?
    /* En Java, si una interfaz tiene un método abstracto y una o más clases implementan esa interfaz, entonces es obligatorio que todas las clases implementen ese método abstracto, a menos que una de las clases sea abstracta misma. En ese caso, la clase abstracta no está obligada a proporcionar una implementación del método abstracto, pero sus subclases concretas sí lo están. */


    /* Cuestión 2: Supón que añades a la interfaz un nuevo método llamado ocupaMasque va a ser igual para todas las clases que implementen la interfaz ya que es una comparación del volumen, tenga la forma que tenga ¿qué opciones tenemos para no tener que implementarlo en todas las clases? */

    //Para hacer un metodo que no haya que implementar en todas la clases, crearia una funcion en Figura3D_v4 para que se herede en automatico a las subclases sin escribirlo demasiadas veces.
    
    //La segunda opción se tiene que recibir un objeto de tipo Figura3D_V4 y dependiendo del tipo de parametro/intancia que reciba lo que hace es moldear el objeto para realizar el calculo correspondiente para ese tipo de objeto.

}