package Unidad8Java.EJerciciosArrayList;


public class LineaFactura {
    
    String descripcion;
    Double precio;
    int unidades;

    public LineaFactura(String descripcion, Double precio, int unidades) {
        setDescripcion(descripcion);
        setPrecio(precio);
        setUnidades(unidades);
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "LineaFactura [descripcion=" + descripcion + ", precio=" + precio + ", unidades=" + unidades + "]";
    }
    

    
}
