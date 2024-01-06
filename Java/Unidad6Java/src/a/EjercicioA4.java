package Unidad6Java.src.a;

public class EjercicioA4 {
    public static void main(String[] args) {
        double iva;
        Articulo articuloZapato = new Articulo();

        articuloZapato.nombre = "Zapatillas Reebok";
        articuloZapato.precio = 1000;
        iva = (articuloZapato.iva/100)*articuloZapato.precio;
        articuloZapato.pvp = articuloZapato.precio+iva;
        articuloZapato.cuantosQuedan = 34;
        System.out.printf("%s - Precio:%.2f$- IVA:%.2f%% - PVP: %.2f$ quedan: %d", articuloZapato.nombre, articuloZapato.precio, articuloZapato.iva, articuloZapato.pvp, articuloZapato.cuantosQuedan);

        articuloZapato.precio = 1500;
        iva = (articuloZapato.iva/100)*articuloZapato.precio;
        articuloZapato.pvp = articuloZapato.precio+iva;
        System.out.printf("%s - Nuevo Precio:%.2f$- IVA:%.2f%% - PVP: %.2f$ quedan: %d", articuloZapato.nombre, articuloZapato.precio, articuloZapato.iva, articuloZapato.pvp, articuloZapato.cuantosQuedan);
    }   
}

class Articulo{
    String nombre;
    double precio, iva=21, pvp;
    int cuantosQuedan; 
}