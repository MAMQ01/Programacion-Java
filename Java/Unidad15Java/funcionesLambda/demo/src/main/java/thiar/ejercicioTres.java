package thiar;

public class ejercicioTres {
    
    public static void main(String[] args) {

        double importe = 1000;
        float iva = 10;
        IImpuesto impuesto = ((subtotal, valorIva) -> {
            return subtotal + (subtotal * valorIva) / 100;
        });

        System.out.printf("El importe de %.2f Euros con IVA %.2f%% paga un importe Total %.2f Euros", importe, iva, impuesto.aplicar(importe, iva));

    }
    
}