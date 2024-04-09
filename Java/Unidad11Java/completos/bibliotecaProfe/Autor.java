package Unidad11Java.completos.bibliotecaProfe;

public record Autor (String nombre,String pseudonimo) implements Comparable<Autor>{

    @Override
    public int compareTo(Autor arg0) {
        return this.nombre.compareTo(arg0.nombre);
    }

};
