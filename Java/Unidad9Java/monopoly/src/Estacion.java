package Unidad9Java.monopoly.src;

public class Estacion extends Propiedad {

    private final static int VALOR_ESTACION = 200;

    public Estacion(String nOMBRE) {
        super(nOMBRE, VALOR_ESTACION, VALOR_ESTACION);
    }

    @Override
    public int getAlquiler(int modificacion) {
        return precio/modificacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Estacion []";
    }

    public static int getValorEstacion() {
        return VALOR_ESTACION;
    }

    @Override
    public void comprar(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'comprar'");
    }
    
}
