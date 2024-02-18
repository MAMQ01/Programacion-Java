package Unidad9Java.astros;

import java.util.ArrayList;
import java.util.Scanner;


public class Satelites extends Astro {

    private double distanciaAlPlaneta;
    enum OrbitaPlanetaria {CIRCULAR, ELIPTICA, SINCRONICA, GEOESTACIONARIA, POLAR, HIPERBOLICA}
    private String planetaDelSatelite;
    
    public Satelites(String nombre, double radioEcuatorial, RotacionSobreEje rotacionSobreEje, double masa, double temperaturaMedia, double gravedad,
            double distanciaAlPlaneta, OrbitaPlanetaria orbitaPlanetaria, String planetaDelSatelite) {
        super(nombre, radioEcuatorial, rotacionSobreEje, masa, temperaturaMedia, gravedad);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.planetaDelSatelite = planetaDelSatelite;
    }

    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }
    public void setDistanciaAlPlaneta(double distanciaAlPlaneta) {
        this.distanciaAlPlaneta = distanciaAlPlaneta;
    }
    public String getPlanetaDelSatelite() {
        return planetaDelSatelite;
    }
    public void setPlanetaDelSatelite(String planetaDelSatelite) {
        this.planetaDelSatelite = planetaDelSatelite;
    }
    public OrbitaPlanetaria getOrbitaPlanetaria(OrbitaPlanetaria orbitaPlanetaria){
        return orbitaPlanetaria;
    }

    @Override
    public void muestra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestra'");
    }
    
}
