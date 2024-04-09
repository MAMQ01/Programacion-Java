package Unidad11Java.completos.bibliotecaProfe;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {
    ArrayList<Publicacion> lista = new ArrayList<>();

    public void anyadir(Publicacion p) {
        lista.add(p);
    }

    /**
     * 
     * @param isbn
     * @param titulo
     * @param autor
     * @return 
     */
    public boolean anyadirLibro(String isbn, String titulo, Autor autor) {
        try {
            lista.add(new Libro(isbn, titulo, autor));
            return true;
        } catch (ValorIncorrecto | PublicacionException e) {
            System.err.println("Se ha producido un error en la inserción del libro: " + e.getMessage());
            return false;
        }
    }

    public Publicacion buscar(String titulo) throws PublicacionException {
        for (Publicacion laPublicacionActual : lista) {
            if (laPublicacionActual instanceof Libro) {
                Libro esunlibro = (Libro) laPublicacionActual;
                if (esunlibro.getTitulo().equals(titulo))
                    return esunlibro;
            } else {
                Revista esunarevista = (Revista) laPublicacionActual;
                if (esunarevista.getNombre().equals(titulo))
                    return esunarevista;
            }
        }
        throw new PublicacionException("El libro no se ha encontrado. Título: " + titulo);
    }

    public boolean buscarLibro(Libro libro) {
        for (Publicacion laPublicacionActual : lista) {
            if (laPublicacionActual.equals(libro))
                return true;
        }
        return false;
    }

    public ArrayList<Revista> revistasOrdenadas() {
        ArrayList<Revista> revistas = new ArrayList<>();
        for (Publicacion laPublicacionActual : lista) {
            if (laPublicacionActual instanceof Revista)
                revistas.add((Revista) laPublicacionActual);
        }
        Collections.sort(revistas);
        return revistas;
    }

    public void ordenar() {
        Collections.sort(lista);
    }

    public void mostrarLineas() {
        ordenar();
        for (Publicacion laPublicacionActual : lista) {
            laPublicacionActual.mostrarEnLinea();
        }
    }
}