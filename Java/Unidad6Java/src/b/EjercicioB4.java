package Unidad6Java.src.b;

public class EjercicioB4 {
    public static void main(String[] args) {

        double iva;
        Articulo articuloZapato = new Articulo("Zapatillas Rebook", 199, 10, 20);
        iva = (articuloZapato.IVA / 100.0) * articuloZapato.precio;
        articuloZapato.pvp = articuloZapato.precio + iva;
        System.out.printf("El nombre del articulo es: %s el precio es: %.2f el PVP es: %.2f quedan: %d %n",
                articuloZapato.nombre, articuloZapato.precio, articuloZapato.pvp, articuloZapato.cuantosQuedan);
        articuloZapato.precio = 1000;
        iva = (articuloZapato.IVA / 100.0) * articuloZapato.precio;
        articuloZapato.pvp = articuloZapato.precio + iva;

        System.out.printf(
                "Con la Actualizacion del articulo: %s el precio es: %.2f el PVP es: %.2f quedan: %d %n",
                articuloZapato.nombre, articuloZapato.precio, articuloZapato.pvp, articuloZapato.cuantosQuedan);
    }
}
