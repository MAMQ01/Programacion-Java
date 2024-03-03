package Unidad9Java.monopoly.src;

public abstract class Propiedad extends Casilla implements Comprable {

    protected final int precio;
    protected final int hipoteca;
    protected int propietario;

    public Propiedad(String nOMBRE, int precio, int hipoteca) {
        super(nOMBRE);
        this.precio = precio;
        this.hipoteca = hipoteca;
        propietario = -1;
    }

    public abstract int getAlquiler(int modificacion);

    public int getPrecio() {
        return precio;
    }

    public int getHipoteca() {
        return hipoteca;
    }

    public int getPropietario() {
        return propietario;
    }

    public void setPropietario(int propietario) {
        this.propietario = propietario;
    }
    
    @Override
    public String toString() {
        return super.toString() + "Propiedad [precio=" + precio + ", hipoteca=" + hipoteca + ", propietario=" + propietario + "]";
    }
    
}
