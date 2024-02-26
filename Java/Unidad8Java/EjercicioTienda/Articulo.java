package Unidad8Java.EjercicioTienda;

public class Articulo {
    private int identificador;
    private String nombre;
    private double precioVentaCliente;
    private double precioCompraProveedor;
    public final static double IVA = 0.21;
    private int stock;
    private static int contadorArticulos = 0;
    private String nombreProveedor;

     /**
      * Contructor de inventario
      * @param nombre
      * @param precioVentaCliente
      * @param precioCompraProveedor
      * @param stock
      * @param nombreProveedor
      */
    
    public Articulo(String nombre, double precioVentaCliente, double precioCompraProveedor, int stock, String nombreProveedor) {
        this.identificador = ++contadorArticulos;
        this.nombre = nombre;
        if (precioCompraProveedor > precioVentaCliente) {
            System.err.println("No puede ser menor el precio de venta al cliente que el precio de compra al proveedor");
        }
        this.precioVentaCliente = precioVentaCliente;
        this.precioCompraProveedor = precioCompraProveedor;
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
        return (precioVentaCliente*IVA)+precioVentaCliente;
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
    public String getNombreProveedor() {
        return nombreProveedor;
    }
    public void setNombreProveedor(String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }


    /**
     * Método Verifica si hay stock suficiente y el cliente quiere comprar almenos una unidad. Si cumple, actualiza el stock
     * @param cantidadAVender Cantidad que desea vender al cliente
     * @return boolean 
     */
    public boolean vender(int cantidadAVender){
        if (cantidadAVender>0 && stock>=cantidadAVender) {
            stock-=cantidadAVender;
            return true;
        } else {
            System.err.println("No fué exitosa su compra");
            return false;
        }
    }

    /**
     * Método Verifica si hay stock suficiente y la Tienda quiere comprar almenos una unidad. Si cumple, actualiza el stock
     * @param cantidadAComprar Cantidad que desea comprar al proveedor
     * @return
     */
    public boolean comprar(int cantidadAComprar){
        if (cantidadAComprar>0) {
            stock+=cantidadAComprar;
            return true;
        } else {
            System.err.println("No fué exitosa su venta");
            return false;
        }
    }
    
    @Override
    public String toString() {
        return "Articulo [id=" + getIdentificador() + ", nombre=" + getNombre() + ", precioVentaCliente=" + getPrecioVentaCliente() + ", precioCompraProveedor="
                + getPrecioCompraProveedor() + ", IVA="+ ((Articulo.IVA)*100) + ", stock=" + stock + "]";
    }

}
