package thiar;

public class programaUno {
    
    public static void main(String[] args) {
        
        IImpuesto impuesto = new Iva();
        double importe = 1000;
        float iva = 10;
        double importeTotal = (impuesto.aplicar(importe, iva));
        System.out.printf("El importe de %.2f Euros con IVA %.2f%% paga un importe Total %.2f Euros", importe, iva, importeTotal);
    }
}
