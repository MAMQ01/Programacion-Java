package Unidad10Java.ejercicioNueve;

import java.util.InputMismatchException;

public class Revista extends Publicacion implements Comparable<Revista> {

    private final String ISSN;
    private final String NOMBRE;
    private final int numero;

    public Revista(String iSSN, String nOMBRE, int numero) throws PublicationException {

        if (iSSN.matches("^\\d{8}$") && nOMBRE.matches("^\\S{25}")) {
            ISSN = iSSN;
            NOMBRE = nOMBRE;
            try {
                this.numero = numero;
            } catch (InputMismatchException e) {
                throw new InputMismatchException("No introdujo un entero en su numero de Revista. " + this.NOMBRE);
            }
        } else {
            throw new PublicationException("Error! creando la Revista");
        }
    }

    public String getISSN() {
        return ISSN;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public int compareTo(Revista otraRevista) {
        int numeroCompare = this.NOMBRE.compareTo(otraRevista.NOMBRE);
        
        if (numeroCompare!=0) {
            return numeroCompare;
        } else {
            return this.ISSN.compareTo(otraRevista.ISSN);
        }
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = prime * result + ((ISSN == null) ? 0 : ISSN.hashCode());
        result = prime * result + ((NOMBRE == null) ? 0 : NOMBRE.hashCode());
        result = prime * result + numero;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!super.equals(obj))
            return false;
        if (getClass() != obj.getClass())
            return false;
        Revista other = (Revista) obj;
        if (ISSN == null) {
            if (other.ISSN != null)
                return false;
        } else if (!ISSN.equals(other.ISSN))
            return false;
        if (NOMBRE == null) {
            if (other.NOMBRE != null)
                return false;
        } else if (!NOMBRE.equals(other.NOMBRE))
            return false;
        if (numero != other.numero)
            return false;
        return true;
    }

}