package Unidad6Java.src.b;

class Articulo{
    String nombre;
    double precio, pvp;
    int cuantosQuedan; 
    int IVA=21;
    /**
     * 
     * @param nombre
     * @param precio
     * @param cuantosQuedan
     * @param IVA
    */
    public Articulo(String nombre, double precio, int cuantosQuedan, int IVA){
        this.nombre = nombre;
        this.cuantosQuedan = cuantosQuedan;
        this.precio = precio;
        if(this.precio<0){
            System.err.println("ERROR! precio menor que 0");
        }
        if(this.cuantosQuedan<0){
            System.err.println("ERROR! no puede tener inventarios negativos");
        }
        if(IVA!=21){
            System.err.println("ERROR! no puede tener IVA diff de 21");
        }else{
        this.IVA = IVA;
        }
    }
}