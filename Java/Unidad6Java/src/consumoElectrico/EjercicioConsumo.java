package Unidad6Java.src.consumoElectrico;

public class EjercicioConsumo {
    public static void main(String[] args) {
        Aparatos bombilla = new Aparatos("Bombilla", 100);
        /* Aparatos radiador = new Aparatos("Radiador", 1200); */
        Aparatos plancha = new Aparatos("Plancha", 2000);


        bombilla.encender();
        plancha.encender();
        System.out.println("En total se han consumido: "+Aparatos.getConsumoElectrico()+" Watios");
        bombilla.apagar();
        System.out.println("en total se han consumido: "+Aparatos.getConsumoElectrico());
    }
}
