package Unidad9Java.astros;

abstract public class Astro {
    private String nombre;
    private double radioEcuatorial;
    enum RotacionSobreEje {DIRECTA, RETROGRADA, SINCRONA, ASINCRONA};
    private double masa;
    private double temperaturaMedia;
    private double gravedad;


    public Astro(String nombre, double radioEcuatorial, RotacionSobreEje rotacionSobreEje, double masa, double temperaturaMedia, double gravedad) {
        this.nombre = nombre;
        this.radioEcuatorial = radioEcuatorial;
        this.masa = masa;
        this.temperaturaMedia = temperaturaMedia;
        this.gravedad = gravedad;
    }

    abstract public void muestra();

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }
    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }
    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }
    public double getTemperaturaMedia() {
        return temperaturaMedia;
    }
    public void setTemperaturaMedia(double temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }
    public double getGravedad() {
        return gravedad;
    }
    public void setGravedad(double gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public String toString() {
        return "Astro [nombre=" + nombre + ", radioEcuatorial=" + radioEcuatorial + ", masa=" + masa
                + ", temperaturaMedia=" + temperaturaMedia + ", gravedad=" + gravedad + "]";
    }

    
}