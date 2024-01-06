package Unidad6Java.src.e;

public class EjercicioE4 {
    public static void main(String[] args) {

        Articulo articulo1 = new Articulo("Rebook", 100, 10, 10, 15,3);

        System.out.println("El PVP es: " + articulo1.getPvp());
        articulo1.setPrecio(1000);

        System.out.println("Despues de setPrecio(1000) el PVP es: " + articulo1.getPvp());

        articulo1.imprimir();

        articulo1.vender(2);

        System.out.println("Despues de vender una unidad quedan: " + articulo1.getCuantosQuedan());

        articulo1.almacenar(5);

        System.out.printf("Despues de almacenar (5) cantidad, pasada como parametros quedan: " + articulo1.getCuantosQuedan() + "%n");
        System.out.println("Su iva es: "+articulo1.getIVA());
        articulo1.imprimir();
        System.out.println(""+articulo1.getIVA());
        System.out.println(""+articulo1.getPvp());
        
    }
}
