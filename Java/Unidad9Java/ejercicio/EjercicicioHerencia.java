package Unidad9Java.ejercicio;
import Unidad9Java.ejercicio.Vehiculo.Color;

public class EjercicicioHerencia {
    public static void main(String[] args) {

        Moto motoUno = new Moto("Moto uno", Color.NEGRO,2, false);
        Coche cocheUno = new Coche("Coche uno", Color.ROJO, "Redondas");
        System.out.println(motoUno.toString());
        System.out.println(cocheUno.toString());
        System.out.println("_____________________________________________________");
        Moto motoDos = new Moto("Moto dos", Color.NEGRO, 2, false);
        motoDos.setNumeroRuedas(6);
        System.out.println(motoDos.toString());
        cocheUno.setNumeroRuedas(100000);
        System.out.println(cocheUno.toString());
    }
}