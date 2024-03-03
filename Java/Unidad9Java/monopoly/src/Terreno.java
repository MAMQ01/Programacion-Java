package Unidad9Java.monopoly.src;

public class Terreno extends Propiedad {
    enum ColorTerreno {ROJO, AMARILLO, VERDE};
    ColorTerreno color;
    private int precioAlquiler;

    public Terreno(String nOMBRE, int precio, int hipoteca, ColorTerreno color, int precioAlquiler) {
        super(nOMBRE, precio, hipoteca);
        this.color = color;
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public int getAlquiler(int modificacion) {
        if (modificacion>4) {
            return precio*10;
        }
        return precio+modificacion;
    }

    public ColorTerreno getColor() {
        return color;
    }

    public void setColor(ColorTerreno color) {
        this.color = color;
    }

    public int getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    @Override
    public String toString() {
        return super.toString() + "Terreno [color=" + color + ", precioAlquiler=" + precioAlquiler + "]";
    }

    @Override
    public void comprar(int i) {
        if (propietario!=this.getCodigo()){
            setPropietario(i);
        } else {
            System.err.println("No se puede comprar");
        }
    }
    
}
