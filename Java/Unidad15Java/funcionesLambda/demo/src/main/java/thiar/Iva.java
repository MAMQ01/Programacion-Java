package thiar;

public class Iva implements IImpuesto {

    @Override
    public double aplicar(double importe, float impuesto) {
        return importe + (importe * impuesto) / 100;
    }
}