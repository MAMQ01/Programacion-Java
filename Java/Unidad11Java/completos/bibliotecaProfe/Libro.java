package Unidad11Java.completos.bibliotecaProfe;

public class Libro extends Publicacion implements Comparable<Publicacion>{
    private final String isbn;
    private final String titulo;
    private final Autor autor;
    private int numeroEjemplares;

    public Libro(String isbn,String titulo, Autor autor) throws ValorIncorrecto, PublicacionException{
        this(isbn, titulo, autor, 1);
    }

    public Libro(String isbn,String titulo, Autor autor,int ejemplares) throws ValorIncorrecto, PublicacionException{
        if (isbn.matches("^\\d{13}$"))
            this.isbn=isbn;
        else
            throw new PublicacionException("El ISBN del libro no es correcto");
        // TODO comprobar isbn
        this.titulo=titulo;
        this.autor=autor;
        if (ejemplares>0)
            this.numeroEjemplares=ejemplares;
        else
            throw new ValorIncorrecto(ejemplares);
    }

    @Override
    public void mostrarEnLinea() {
        System.out.printf("%4d - %6s %25s %20s %d %n",identificador,isbn,titulo,autor,numeroEjemplares);        
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

 

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
        result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
        result = prime * result + ((autor == null) ? 0 : autor.hashCode());
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
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        if (titulo == null) {
            if (other.titulo != null)
                return false;
        } else if (!titulo.equals(other.titulo))
            return false;
        if (autor == null) {
            if (other.autor != null)
                return false;
        } else if (!autor.equals(other.autor))
            return false;
        return true;
    }

    public int compareTo(Publicacion otraCosa) {
        if (otraCosa instanceof Revista)
            return -1;
        Libro otroLibro=(Libro)otraCosa;
        int comparacionTitulo=this.titulo.compareTo(otroLibro.titulo);
        if (comparacionTitulo==0)
            return this.autor.compareTo(otroLibro.autor);
        return comparacionTitulo;
    }





}
