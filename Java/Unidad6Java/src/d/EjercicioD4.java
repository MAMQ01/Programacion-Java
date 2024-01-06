package Unidad6Java.src.d;

public class EjercicioD4 {
    public static void main(String[] args) {

    Articulo articulo1 = new Articulo("Rebook", 100, 10, 10, 15);

    System.out.println("El PVP inicial es: "+articulo1.getPvp());
    articulo1.setPrecio(1000);

    System.out.println("Despues de setPrecio(1000) el PVP es: "+articulo1.getPvp());

    articulo1.imprimir();

    articulo1.vender(20);

    System.out.println("Despues de vender una unidad quedan: "+articulo1.getCuantosQuedan());

    articulo1.almacenar(5);
    
    System.out.printf("Despues de almacenar x (5) cantidad, pasada como parametros quedan: "+articulo1.getCuantosQuedan());

    }
}
