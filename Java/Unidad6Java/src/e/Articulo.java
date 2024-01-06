package Unidad6Java.src.e;

public class Articulo {
    private String nombre;
    private double precio, descuento;
    private int cuantosQuedan, almacenamientoDisponible, iva, tipoIVA; 
    private final int IVAGENERAL=21, IVAREDUCIDO=10, IVASUPERREDUCIDO=4;
    

    public Articulo(String nombre, double precio, int cuantosQuedan, int descuento, int almacenamientoDisponible, int tipoIVA) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
        this.descuento = descuento;
        this.almacenamientoDisponible = almacenamientoDisponible;
        this.tipoIVA = tipoIVA;
        this.iva = validarTipoIVA();
        if(this.precio<0){
            System.err.println("ERROR! precio menor que 0");
        }
        if(this.cuantosQuedan<0){
            System.err.println("ERROR! no puede tener inventarios negativos");
        }
    }
    

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getPrecio() {
        return precio;
    }


    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public double getPvp() {
        return calcularPvp();
    }


    public int getCuantosQuedan() {
        return cuantosQuedan;
    }


    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }


    public int getIVA() {
        return iva;
    }

    public double calcularPvp(){
        return getPrecio() + getPrecio() * (getIVA() / 100.0);
    }


    public void imprimir() {
        double pvpConDescuento = calcularPvp() - getPVPDescuento(descuento);
        System.out.printf("El artículo %s tiene un precio %.2f, un IVA de %d, un PVP de %.2f y quedan: %d. Con descuento, el precio PVP es: %.2f %n", getNombre(), getPrecio(), getIVA(), getPvp(), getCuantosQuedan(), pvpConDescuento);
    }
    

    public double getPVPDescuento(double porcentajeDescuento){
        descuento=(porcentajeDescuento/100)*getPrecio();
        return getPrecio()-descuento;
    }

    public boolean vender(int cantidad){
        if(getCuantosQuedan()>0){
            cuantosQuedan=cuantosQuedan-cantidad;
            return true;
        }else{
            System.err.printf("ERROR! No hay articulo",getNombre());
            return false;
        }
    }

    public boolean almacenar(int cantidad) {
        if (almacenamientoDisponible >= cantidad) {
            almacenamientoDisponible = almacenamientoDisponible - cantidad;
            cuantosQuedan = cuantosQuedan + cantidad;
            return true;
        } else {
            System.err.println("ERROR! No hay suficiente almacenamiento");
            return false;
        }
    }

    private int validarTipoIVA() {
        switch (tipoIVA) {
            case 1:
                return IVAGENERAL;
            case 2:
                return IVAREDUCIDO;
            case 3:
                return IVASUPERREDUCIDO;
            default:
                System.err.println("ERROR! Tipo de IVA no válido, usare el general");
                return IVAGENERAL;
        }
    }
}
