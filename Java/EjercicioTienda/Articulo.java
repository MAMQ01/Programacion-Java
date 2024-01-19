package EjercicioTienda;

public class Articulo {
    private static int identificador = 0;
    private String nombre;
    private double precioVentaCliente;
    private double precioCompraProveedor;
    private final static double IVA=0.21;
    private int stock;
    private static int contadorArticulos = 0;


    

    

    /**
     * 
     * @param identificador Identificador único
     * @param nombre Articulo a introducir
     * @param precioVentaCliente Precio de venta al cliente
     * @param precioCompraProveedor Precio de compra al proveedor
     * @param stock Stock mayor a 0
     */
    //Creo el constructor con una validacion de que los datos recibidos en el constructor son correctos; precio de venta > 0 y precio de venta, stock >= 0
    
    public Articulo(String nombre, double precioVentaCliente, double precioCompraProveedor, int stock) {
        Articulo.identificador = identificador++;
        this.nombre = nombre;
        if (precioCompraProveedor > precioVentaCliente) {
            System.err.println("No puede ser menor el precio de venta al cliente que el precio de compra al proveedor");
        }
        this.precioVentaCliente = precioVentaCliente;
        this.precioCompraProveedor = precioCompraProveedor;
        this.stock = stock;
        contadorArticulos++;
        if (stock < 0) {
            System.err.println("El stock debe ser mayor o igual a cero");
        }
        this.stock = stock;
    }


    public int getIdentificador() {
        return identificador;
    }
    public String getNombre() {
        return nombre;
    }
    public double getPrecioVentaCliente() {
        return precioVentaCliente;
    }
    public void setPrecioVentaCliente(double precioVentaCliente) {
        this.precioVentaCliente = precioVentaCliente;
    }
    public double getPrecioCompraProveedor() {
        return precioCompraProveedor;
    }
    public void setPrecioCompraProveedor(double precioCompraProveedor) {
        this.precioCompraProveedor = precioCompraProveedor;
    }
    public static double getIva() {
        return IVA;
    }

    
}
