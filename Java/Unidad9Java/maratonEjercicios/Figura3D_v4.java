package Unidad9Java.maratonEjercicios;

interface Figura3D_v4 extends Figura3D_v3 {
    
    abstract public double superficie();
    /* Cuestión 1: ¿Al añadir el nuevo método a la interfaz, si no modificamos las clases que la implementan ¿se produce algún error? ¿Por qué? ¿Cómo evitamos esta situación? */

    /* Al añadir el metodo superficie() en la nueva interfaz Figura3D_v4 las clases que eran hijas de Figura3D_v3, como ahora son hijas de la clase Figura3D_v4 deben implementar si o si las clases todas las clases abstract (incluye las clases abstractas de Figura3D_v3, porque se extiende a Figura3D_v4). */

    //Pregunta, por qué la siguiente afirmacion es cierta?
    /* En Java, si una interfaz tiene un método abstracto y una o más clases implementan esa interfaz, entonces es obligatorio que todas las clases implementen ese método abstracto, a menos que una de las clases sea abstracta misma. En ese caso, la clase abstracta no está obligada a proporcionar una implementación del método abstracto, pero sus subclases concretas sí lo están. */

    public static void ocupaMasque(){
        System.out.println("Implementa esta funcion en todas las subclases que verifica los volumenes");
    };
    //Para hacer un metodo que no haya que implementar en todas la clases, crearia una funcion en Figura3D_v4 para que se herede en automatico a las subclases sin escribirlo demasiadas veces.

}