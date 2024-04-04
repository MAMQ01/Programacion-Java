package Unidad11Java.ejercicioBiblioteca.gpt;

class Revista extends Publicacion {
    private int id; // Agregar el campo id
    private String issn;
    private String nombre;
    private int numero;

    Revista(String issn, String nombre, int numero) {
        this.id = GeneradorId.generarIdUnico();
        this.issn = issn;
        this.nombre = nombre;
        this.numero = numero;
    }

    @Override
    void mostrarEnLinea() {
        System.out.printf("| %-5d | %-8s | %-30s | %-5d |\n", this.id, this.issn, this.nombre, this.numero);
    }

    public int getId() {
        return id;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    


}