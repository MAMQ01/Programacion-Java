package Unidad6Java.src.e;

public class EjercicioE2 {
    public static void main(String[] args) {
        Persona p1 = new Persona("1314134", 2, "Juan", "Muñoz");
        Persona p2 = new Persona("111111111", 100, "Carlos", "Muñoz");

        System.out.println("Es mayor de edad "+p1.esMayorEdad());

        System.out.println("Es jubilado "+p1.esJubilado());

        System.out.println("La diferencia de edad de 2 personas es: "+p1.diferenciaEdad(p2));
        p1.imprime();

    }
}
