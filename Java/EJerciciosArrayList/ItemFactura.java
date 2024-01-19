package EJerciciosArrayList;


public class ItemFactura {
    private String descripcion;
    private double precioUnitario;
    private int cantidadUnidades;
    private static final double DESCUENTO = 0.95;
    private double importeTotal = 0;


    /* Un número indeterminado de lineaFactura que contienen:
        ◦ Descripción del producto
        ◦ Precio unitario
        ◦ Cantidad de unidades
        ◦ Porcentaje de descuento: 5% para líneas con más de 10 unidades.
        ◦ Importe total de la línea.
        • Importe total: inicialmente cero, y se va actualizando siempre que se
        añadan/eliminen líneas. */

        
    public ItemFactura(String descripcion, double precioUnitario, int cantidadUnidades) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadUnidades = cantidadUnidades;
    }
        
    public String getDescripcion() {
            return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public double getImporteTotal() {
        double importeTotal = getCantidadUnidades() * getPrecioUnitario();
        if (getCantidadUnidades() > 10) {
            importeTotal = importeTotal * DESCUENTO;
        }
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return "ItemFactura [descripcion=" + descripcion + ", precioUnitario=" + precioUnitario +
                ", cantidadUnidades=" + cantidadUnidades + ", importeTotal=" + getImporteTotal() + "]";
    }
}
