package Unidad9Java.astros;

import java.util.ArrayList;

public class Planeta extends Astro {
    private double ditanciaAlSol;
    enum OrbitaAlSol {CIRCULAR, ELIPTICA, PARABOLICA, HIPERBOLICA};
    private boolean tieneSatelite;
    private ArrayList<Satelites> listaSatelites;
    

    public Planeta(String nombre, double radioEcuatorial, RotacionSobreEje rotacionSobreEje, double masa, double temperaturaMedia, double gravedad,
            double ditanciaAlSol, OrbitaAlSol orbitalAlSol, boolean tieneSatelite) {
        super(nombre, radioEcuatorial, rotacionSobreEje, masa, temperaturaMedia, gravedad);
        this.ditanciaAlSol = ditanciaAlSol;
        this.tieneSatelite = tieneSatelite;
    }

    public Planeta(String nombre, double radioEcuatorial, RotacionSobreEje rotacionSobreEje, double masa, double temperaturaMedia, double gravedad,
            double ditanciaAlSol, OrbitaAlSol orbitalAlSol, ArrayList<Satelites> listaSatelites) {
        super(nombre, radioEcuatorial, rotacionSobreEje, masa, temperaturaMedia, gravedad);
        this.ditanciaAlSol = ditanciaAlSol;
        this.listaSatelites = new ArrayList<>();
    }

    public double getDitanciaAlSol() {
        return ditanciaAlSol;
    }
    public void setDitanciaAlSol(double ditanciaAlSol) {
        this.ditanciaAlSol = ditanciaAlSol;
    }
    public boolean isTieneSatelite() {
        return tieneSatelite;
    }
    public void setTieneSatelite(boolean tieneSatelite) {
        this.tieneSatelite = tieneSatelite;
    }
    public ArrayList<Satelites> getListaSatelites() {
        return listaSatelites;
    }
    public void setListaSatelites(ArrayList<Satelites> listaSatelites) {
        this.listaSatelites = listaSatelites;
    }

    @Override
    public void muestra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'muestra'");
    }

}
