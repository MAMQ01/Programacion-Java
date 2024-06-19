package thiar;

public abstract class Producto {

    private String nombre;
    private Double precio;

    public Producto(String nombre, Double precio) throws Exception {
        this.nombre = nombre;

        if (precio > 0) {
          this.precio = precio;
        } else {
            throw new Exception("gwerg");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }


    public abstract double calcularDescuenta();
}
