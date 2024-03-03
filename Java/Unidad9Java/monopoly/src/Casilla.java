package Unidad9Java.monopoly.src;

public class Casilla {
    private final String NOMBRE;
    private int codigo;
    private static int contadorCodigos = 0;

    public Casilla(String nOMBRE) {
        NOMBRE = nOMBRE;
        this.codigo = contadorCodigos++;
    } 

    @Override
    public String toString() {
        return "Casilla [NOMBRE=" + NOMBRE + ", codigo=" + codigo + "]";
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((NOMBRE == null) ? 0 : NOMBRE.hashCode());
        result = prime * result + codigo;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Casilla other = (Casilla) obj;
        if (NOMBRE == null) {
            if (other.NOMBRE != null)
                return false;
        } else if (!NOMBRE.equals(other.NOMBRE))
            return false;
        if (codigo != other.codigo)
            return false;
        return true;
    }

}
