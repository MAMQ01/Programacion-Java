package EjercicioTienda;

public class Articulo {
    private int identificador;
    private String nombre;
    private double precioVentaCliente;
    private double precioCompraProveedor;
    private final static int IVA = 21;
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
        this.identificador = ++contadorArticulos;
        this.nombre = nombre;
        if (precioCompraProveedor > precioVentaCliente) {
            System.err.println("No puede ser menor el precio de venta al cliente que el precio de compra al proveedor");
        }
        this.precioVentaCliente = precioVentaCliente;
        this.precioCompraProveedor = precioCompraProveedor;
        this.stock = stock;
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
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }


    //Método vender articulo recibe como parametro la cantidad debe validar si fue exitosa o no la venta y reducir el stock
    public boolean vender(int cantidadAVender){
        if (cantidadAVender>0 && stock>=cantidadAVender) {
            stock-=cantidadAVender;
            return true;
        } else {
            System.err.println("No fué exitosa su compra");
            return false;
        }
    }

    //Método comprar articulo recibe como parametro la cantidad debe validar si fue exitosa o no la compra y aumentar el stock
    public boolean comprar(int cantidadAComprar){
        if (cantidadAComprar>0) {
            stock+=cantidadAComprar;
            return true;
        } else {
            System.err.println("No fué exitosa su venta");
            return false;
        }
    }
    
    //Método publico que devuelva un String con la informacion del articulo, probablemente con un toString DE UNA SOLA LINEA
    @Override
    public String toString() {
        return "Articulo [id=" + identificador + ", nombre=" + nombre + ", precioVentaCliente=" + precioVentaCliente + ", precioCompraProveedor="
                + precioCompraProveedor + ", IVA="+ Articulo.IVA + ", stock=" + stock + "]";
    }

}
