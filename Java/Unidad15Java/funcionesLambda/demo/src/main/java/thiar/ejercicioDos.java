package thiar;

public class ejercicioDos {

    public static void main(String[] args) {
        double importe = 1000;
        float iva = 10;
        System.out.printf("El importe de %.2f Euros con IVA %.2f%% paga un importe Total %.2f Euros", importe, iva, new IImpuesto() {

            @Override
            public double aplicar(double importe, float impuesto) {
                
                return importe + (double) impuesto;
            }
            
        }.aplicar(importe, iva));
    
    }
}