package Unidad11Java.ejercicioBiblioteca.gpt;

class Libro extends Publicacion {
    private String isbn;
    private String titulo;
    private Autor autor;
    private int numEjemplares;

    Libro(String isbn, String titulo, Autor autor) throws PublicacionException {
        // Comprobar ISBN
        if (!validarISBN(isbn)) {
            throw new PublicacionException("ISBN inválido", isbn);
        }
        
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = 1;
    }

    Libro(String isbn, String titulo, Autor autor, int numEjemplares) throws PublicacionException {
        // Comprobar ISBN
        if (!validarISBN(isbn)) {
            throw new PublicacionException("ISBN inválido", isbn);
        }

        // Comprobar número de ejemplares
        if (numEjemplares < 0) {
            try {
                throw new ValorIncorrecto("El número de ejemplares no puede ser negativo", numEjemplares);
            } catch (ValorIncorrecto e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
    }

    private boolean validarISBN(String isbn) {
        // Verificar que el ISBN tenga 13 dígitos
        return isbn.matches("[0-9]{13}");
    }

    @Override
    void mostrarEnLinea() {
        System.out.printf("| %-5d | %-13s | %-30s | %-20s | %-15s |\n", getId(), this.isbn, this.titulo, this.autor.getNombre(), this.autor.getPseudonimo());
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    

}