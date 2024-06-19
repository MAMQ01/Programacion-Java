package thiar;

@FunctionalInterface
public interface IImpuesto {
    
    double aplicar(double importe, float impuesto);
}