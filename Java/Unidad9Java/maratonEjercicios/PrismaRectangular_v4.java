package Unidad9Java.maratonEjercicios;

class PrismaRectangular_v4 implements Figura3D_v4 {
    private double largo;
    private double ancho;
    private double alto;

    public PrismaRectangular_v4(double largo, double ancho, double alto) {
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double volumen() {
        return largo * ancho * alto;
    }

    public double superficie() {
        double areaCara1 = largo * ancho;
        double areaCara2 = largo * alto;
        double areaCara3 = ancho * alto;
        double areaTotal = 2 * (areaCara1 + areaCara2 + areaCara3);
        return areaTotal;
    }
}