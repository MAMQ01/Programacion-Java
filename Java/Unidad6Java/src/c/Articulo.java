package Unidad6Java.src.c;

public class Articulo {
    private String nombre;
    private double precio, pvp;
    private int cuantosQuedan; 
    private int IVA=21;
    
    //Aun me falta saber hacer correctamente los comentarios internos
    public Articulo(String nombre, double precio, int cuantosQuedan, int IVA){
        this.nombre = nombre;
        this.precio = precio;
        this.cuantosQuedan = cuantosQuedan;
        this.IVA = IVA;
        if(this.precio<0){
            System.err.println("ERROR! precio menor que 0");
        }
        if(this.cuantosQuedan<0){
            System.err.println("ERROR! no puede tener inventarios negativos");
        }
        if(IVA!=21){
            System.err.println("ERROR! no puede tener IVA diff de 21");
        }
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPvp(double pvp) {
        this.pvp = pvp;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        this.cuantosQuedan = cuantosQuedan;
    }

    public void setIVA(int iVA) {
        IVA = iVA;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public double getPvp() {
        return pvp;
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public int getIVA() {
        return IVA;
    }

    
}
