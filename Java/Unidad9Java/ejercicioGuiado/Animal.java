package Unidad9Java.ejercicioGuiado;

public class Animal {
    
    private final String NOMBRE; //Acá debería ir en Mayuscúlas?
    private int estancia;

    public Animal(String nombre, int estancia) {
        this.NOMBRE = nombre;
        this.estancia = estancia;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }
    public int getEstancia() {
        return estancia;
    }
    public void setEstancia(int estancia) {
        this.estancia = estancia;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((NOMBRE == null) ? 0 : NOMBRE.hashCode());
        result = prime * result + estancia;
        return result;
    }

    @Override
    public boolean equals(Object obj){
        /* if (obj.getClass().getSimpleName()=="Animal"){
            return true;
        }; */ //Quiero saber si esto es posible para saber que un objeto es del mismo tipo, si no me equivoco es porque esta forma sólo sirve para subclases, si?
        //Quiero saber qué logica está siguiendo acá
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Animal)) {
            return false;
        }
        return this.NOMBRE.equals(((Animal) obj).NOMBRE); //No entiendo la necesidad de tenerlo, compara los nombres y sabe que son iguales o no los nombres. Lo que no entiendo es con qué fin y por qué al final de los otros if
    }
    
}
