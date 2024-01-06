package Unidad6Java.src.c;

public class EjercicioC2 {
    public static void main(String[] args) {
        // Usar la clase constructora persona
        // Crear la persona 1 y hardcodea la entrada
        Persona personaUno = new Persona(165460, 10, "Carlos", "Nuñez");

        if (personaUno.getEdad() >= 18) {
            System.out.println(
                    personaUno.getNombre() + " " + personaUno.getApellidos() + " eres mayor de edad, tu edad es: "
                            + personaUno.getEdad());
        } else if (personaUno.getEdad() > 0) {
            System.out.println(
                    personaUno.getNombre() + personaUno.getApellidos() + " eres menor de edad, tu edad es: " + personaUno.getEdad());
        } else {
            System.out.println("Ingresa una edad valida, para ver todos los datos");
        }
        // Crear la persona 2 y recibir sus datos

        Persona personaDos = new Persona(143423545, 1, "aria", "stark");

        if (personaDos.getEdad() >= 18) {
            System.out.println(
                    personaDos.getNombre() + " " + personaDos.getApellidos() + " eres mayor de edad, tu edad es: "
                            + personaDos.getEdad());
        } else if (personaDos.getEdad() > 0) {
            System.out.println(
                    personaDos.getNombre() + personaDos.getApellidos() + " eres menor de edad, tu edad es: " + personaDos.getEdad());
        } else {
            System.out.println("Ingresa una edad valida");
        }
        
        System.out.println("Despues del set, asi terminan cambian los datos:");
        personaUno.setNombre("Ginna");
        personaUno.setApellidos("Juarez");
        personaUno.setEdad(14);
        personaDos.setNombre("Andres");
        personaDos.setApellidos("Muñoz");
        personaDos.setEdad(41);
        if (personaUno.getEdad() >= 18) {
            System.out.println(
                    personaUno.getNombre() + " " + personaUno.getApellidos() + " eres mayor de edad, tu edad es: "
                            + personaUno.getEdad());
        } else if (personaUno.getEdad() > 0) {
            System.out.println(
                    personaUno.getNombre() + personaUno.getApellidos() + " eres menor de edad, tu edad es: " + personaUno.getEdad());
        } else {
            System.out.println("Ingresa una edad valida");
        }
        if (personaDos.getEdad() >= 18) {
            System.out.println(
                    personaDos.getNombre() + " " + personaDos.getApellidos() + " eres mayor de edad, tu edad es: "
                            + personaDos.getEdad());
        } else if (personaDos.getEdad() > 0) {
            System.out.println(
                    personaDos.getNombre() + personaDos.getApellidos() + " eres menor de edad, tu edad es: " + personaDos.getEdad());
        } else {
            System.out.println("Ingresa una edad valida");
        }
    }

}
