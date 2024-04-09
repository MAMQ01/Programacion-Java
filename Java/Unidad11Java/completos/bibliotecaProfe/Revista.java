package Unidad11Java.completos.bibliotecaProfe;

public class Revista extends Publicacion implements Comparable<Publicacion>{
    private final String issn;
    private final String nombre;
    private final int numero;


    public Revista(String issn, String nombre, int numero) throws PublicacionException {
        if (issn.matches("^\\d{8}$"))
            this.issn = issn;
        else
            throw new PublicacionException("El código ISSN no es correcto");
        this.nombre = nombre;
        this.numero = numero;
    }


    @Override
    public void mostrarEnLinea() {
        System.out.printf("%4d - %6s %25s %3d %n",identificador,issn,nombre,numero);        
    }


    public String getIssn() {
        return issn;
    }


    public String getNombre() {
        return nombre;
    }


    public int getNumero() {
        return numero;
    }


    @Override
    public int compareTo(Publicacion otraCosa) {
        if (otraCosa instanceof Libro)
            return 1;
        Revista laOtraRevista=(Revista)otraCosa;
        int comparacionNombre=this.nombre.compareTo(laOtraRevista.nombre);
        if (comparacionNombre==0)
            return this.issn.compareTo(laOtraRevista.issn);
        return comparacionNombre;
    }



}
