package Unidad10Java.ejercicioNueve;

public class Libro extends Publicacion implements Comparable<Libro> {

    private final Autor AUTOR;
    private final String ISBN;
    private final String TITULO;
    private static int numEjemplares;
    
    public Libro(Autor aUTOR, String iSBN, String tITULO) throws Exception {
        AUTOR = aUTOR;
        if (iSBN.matches("^\\d{13}$")) {
            ISBN = iSBN;
        }else{
            //this.ISBN = "0000000000000";
            throw new Exception("ISBN incorrecto.");
        }
        TITULO = tITULO;
        Libro.numEjemplares = 1;
    }

    public Libro(Autor aUTOR, String iSBN, String tITULO, int numEjemplares) throws Exception {
        this(aUTOR, iSBN, tITULO);
        Libro.numEjemplares = numEjemplares;
        if (numEjemplares>0) {
            Libro.numEjemplares = numEjemplares;
        } else {
            throw new ValorIncorrecto("No puede ingresar ejemplares negativos: ", numEjemplares);
        }
    }

    public Autor getAUTOR() {
        return AUTOR;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTITULO() {
        return TITULO;
    }

    public static int getNumEjemplares() {
        return numEjemplares;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((TITULO == null) ? 0 : TITULO.hashCode());
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
        Libro other = (Libro) obj;
        if (TITULO == null) {
            if (other.TITULO != null)
                return false;
        } else if (!TITULO.equals(other.TITULO))
            return false;
        return true;
    }

    @Override
    public int compareTo(Libro otroLibro) {
        int valorComparacionTitulo = this.TITULO.compareTo(otroLibro.TITULO);
        
        if (valorComparacionTitulo!=0) {
            return valorComparacionTitulo;
        } else  {
            return this.AUTOR.compareTo(otroLibro.AUTOR);
        }
    }

}
