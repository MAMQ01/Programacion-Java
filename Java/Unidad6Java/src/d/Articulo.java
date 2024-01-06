package Unidad6Java.src.d;

public class Articulo {
    private String nombre;
    private double precio, descuento;
    private int cuantosQuedan, almacenamientoDisponible; 
    private final int IVA=21;

    public Articulo(String nombre, double precio, int cuantosQuedan, int descuento, int almacenamientoDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
        this.descuento = descuento;
        this.almacenamientoDisponible = almacenamientoDisponible;
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


    //Llegue a la conclusion de que no necesito el setPvp() porque lo calculo cada que uso el getPvp() que anida un calcularPvp()


    public int getCuantosQuedan() {
        return cuantosQuedan;
    }


    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }


    public int getIVA() {
        return IVA;
    }

    public double calcularPvp(){
        return getPrecio() + getPrecio() * (getIVA() / 100.0);
    }


    public void imprimir(){
        System.out.printf("El articulo %s tiene un precio %.2f, un iva de %d un pvp de %.2f y quedan: %d con descuento el precio PVP es:%.2f %n",getNombre(),getPrecio(), getIVA(), getPvp(), getCuantosQuedan(), getPVPDescuento(descuento));
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



}


