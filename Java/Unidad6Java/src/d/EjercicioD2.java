package Unidad6Java.src.d;

public class EjercicioD2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("1314134", 20, "Juan", "Muñoz");
        Persona p2 = new Persona("111111111", 10, "Carlos", "Muñoz");

        System.out.println("Es mayor de edad "+p1.esMayorEdad());

        System.out.println("Es jubilado "+p1.esJubilado());

        System.out.println("La diferencia de edad de 2 personas es: "+p1.diferenciaEdad(p2));
        p1.imprime();

    }
}
