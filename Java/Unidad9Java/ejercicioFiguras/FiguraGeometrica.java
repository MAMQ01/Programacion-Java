package Unidad9Java.ejercicioFiguras;

abstract class FiguraGeometrica {
    
    final double alto;
    final double ancho;
    final double profundidad;
    final String nombre;

    public FiguraGeometrica(double alto, double ancho, double profundidad, String nombre) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
        this.nombre = nombre;
    }

    public void altoXAndcho(){
        System.out.println("Muestra alto por ancho del FigGeo");
    }

    @Override
    public String toString() {
        return "FiguraGeometrica [alto=" + alto + ", ancho=" + ancho + ", profundidad=" + profundidad + ", nombre="
                + nombre + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(alto);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(ancho);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(profundidad);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FiguraGeometrica other = (FiguraGeometrica) obj;
        if (Double.doubleToLongBits(alto) != Double.doubleToLongBits(other.alto))
            return false;
        if (Double.doubleToLongBits(ancho) != Double.doubleToLongBits(other.ancho))
            return false;
        if (Double.doubleToLongBits(profundidad) != Double.doubleToLongBits(other.profundidad))
            return false;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        return true;
    }

}
