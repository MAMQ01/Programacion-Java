package Unidad11Java.ejercicioBiblioteca.gpt;

import java.util.ArrayList;
import java.util.Comparator;

class Biblioteca {
    private ArrayList<Publicacion> publicaciones;

    Biblioteca() {
        this.publicaciones = new ArrayList<>();
    }

    void anyadir(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    void anyadirLibro(String isbn, String titulo, Autor autor) throws PublicacionException {
        anyadirLibro(isbn, titulo, autor, 1);
    }

    void anyadirLibro(String isbn, String titulo, Autor autor, int numEjemplares) throws PublicacionException {
        Libro libro = new Libro(isbn, titulo, autor, numEjemplares);
        publicaciones.add(libro);
    }

    Publicacion buscar(String titulo) throws Exception {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Libro) {
                Libro libro = (Libro) publicacion;
                if (libro.getTitulo().equals(titulo)) {
                    return libro;
                }
            } else if (publicacion instanceof Revista) {
                Revista revista = (Revista) publicacion;
                if (revista.getNombre().equals(titulo)) {
                    return revista;
                }
            }
        }
        throw new Exception("No se encontró ninguna publicación con el título: " + titulo);
    }

    boolean buscarLibro(Libro libro) {
        return publicaciones.contains(libro);
    }

    ArrayList<Revista> revistasOrdenadas() {
        ArrayList<Revista> revistas = new ArrayList<>();
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Revista) {
                revistas.add((Revista) publicacion);
            }
        }
        revistas.sort(Comparator.comparing(Revista::getNombre).thenComparing(Revista::getIssn));
        return revistas;
    }

    void ordenar() {
        publicaciones.sort(new Comparator<Publicacion>() {
            @Override
            public int compare(Publicacion p1, Publicacion p2) {
                if (p1 instanceof Libro && p2 instanceof Libro) {
                    Libro l1 = (Libro) p1;
                    Libro l2 = (Libro) p2;
                    int compareTitulo = l1.getTitulo().compareTo(l2.getTitulo());
                    if (compareTitulo == 0) {
                        return l1.getAutor().getNombre().compareTo(l2.getAutor().getNombre());
                    }
                    return compareTitulo;
                } else if (p1 instanceof Revista && p2 instanceof Revista) {
                    Revista r1 = (Revista) p1;
                    Revista r2 = (Revista) p2;
                    int compareNombre = r1.getNombre().compareTo(r2.getNombre());
                    if (compareNombre == 0) {
                        return r1.getIssn().compareTo(r2.getIssn());
                    }
                    return compareNombre;
                } else {
                    return p1 instanceof Libro ? -1 : 1;
                }
            }
        });
    }

    void mostrarLineas() {
        System.out.println("===============================================================================");
        System.out.println("| ID    | ISBN          | Título                         | Autor            | Pseudónimo    |");
        System.out.println("===============================================================================");
        for (Publicacion publicacion : publicaciones) {
            publicacion.mostrarEnLinea();
        }
        System.out.println("===============================================================================");
    }

    public static void main(String[] args) {
        try {
            // Crear autores
            Autor autor1 = new Autor("Autor 1", "Pseudónimo 1");
            Autor autor2 = new Autor("Autor 2", "Pseudónimo 2");

            // Crear libros
            Libro libro1 = new Libro("9781234567890", "Libro 1", autor1);
            Libro libro2 = new Libro("9780987654321", "Libro 2", autor2, 3);

            // Crear revistas
            Revista revista1 = new Revista("12345678", "Revista 1", 1);
            Revista revista2 = new Revista("87654321", "Revista 2", 2);

            // Crear biblioteca
            Biblioteca biblioteca = new Biblioteca();

            // Añadir publicaciones a la biblioteca
            biblioteca.anyadir(libro1);
            biblioteca.anyadir(libro2);
            biblioteca.anyadir(revista1);
            biblioteca.anyadir(revista2);

            // Mostrar información de la biblioteca
            System.out.println("Contenido de la biblioteca:");
            biblioteca.mostrarLineas();

            // Buscar una publicación por título
            System.out.println("Buscar libro por título 'Libro 2':");
            try {
                Publicacion encontrado = biblioteca.buscar("Libro 2");
                System.out.println("Publicación encontrada:");
                encontrado.mostrarEnLinea();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            // Ordenar y mostrar revistas ordenadas
            biblioteca.ordenar();
            System.out.println("Revistas ordenadas:");
            for (Revista revista : biblioteca.revistasOrdenadas()) {
                revista.mostrarEnLinea();
            }

        } catch (PublicacionException e) {
            System.out.println("Error al crear la publicación: " + e.getMessage());
        }
    }
}
