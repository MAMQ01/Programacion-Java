package Unidad6Java.src.c;

public class EjercicioC4 {
    public static void main(String[] args) {
        double iva;
        Articulo articuloZapato = new Articulo("Zapatillas Rebook", 199, 10, 21);
        iva = (articuloZapato.getIVA() / 100.0) * articuloZapato.getPrecio();
        articuloZapato.setPvp(articuloZapato.getPrecio() + iva);
        System.out.printf("El nombre del articulo es: %s el precio es: %.2f el PVP es: %.2f quedan: %d %n",
                articuloZapato.getNombre(), articuloZapato.getPrecio(), articuloZapato.getPvp(), articuloZapato.getCuantosQuedan());
        articuloZapato.setPrecio(10500);
        iva = (articuloZapato.getIVA() / 100.0) * articuloZapato.getPrecio();
        articuloZapato.setPvp(articuloZapato.getPrecio() + iva);

        System.out.printf(
                "Con la Actualizacion del articulo: %s el precio es: %.2f el PVP es: %.2f quedan: %d %n",
                articuloZapato.getNombre(), articuloZapato.getPrecio(), articuloZapato.getPvp(), articuloZapato.getCuantosQuedan());
    }
}
