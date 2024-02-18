package Unidad9Java.astros;

import java.util.ArrayList;

import Unidad9Java.astros.Astro.RotacionSobreEje;
import Unidad9Java.astros.Planeta.OrbitaAlSol;

public class ProgramaAstros {
    public static void main(String[] args) {
        ArrayList<Astro> sistemaSolar = new ArrayList<>();
        Planeta tierra1 = new Planeta("Tierra", 10, RotacionSobreEje.ASINCRONA, 1000000, 20, 9.8, 100000000, OrbitaAlSol.HIPERBOLICA, true);
    }
}
