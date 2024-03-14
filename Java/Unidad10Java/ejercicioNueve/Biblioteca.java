package Unidad10Java.ejercicioNueve;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {

    private ArrayList<Publicacion> listaPublicaciones = new ArrayList<>();

    public void anyadir(Publicacion publicacionAAnyadir) {
        listaPublicaciones.add(publicacionAAnyadir);
    }

    public boolean anyadirLibro(Autor autor, String iSBN, String titulo) throws Exception {
        try {
            Libro libro = new Libro(autor, iSBN, titulo);
            listaPublicaciones.add(libro);
            return true;
            
        } catch (PublicationException | ValorIncorrecto e) {
            return false;
        }
    }

    public Publicacion buscar(String tituloABuscar) throws Exception {
        for (Publicacion publicacion : listaPublicaciones) {
            if (publicacion instanceof Libro) {
                Libro libro = (Libro) publicacion;
                if (libro.getTITULO().equals(tituloABuscar)) {
                    return libro;
                }
            } else if (publicacion instanceof Revista) {
                Revista revista = (Revista) publicacion;
                if (revista.getNOMBRE().equals(tituloABuscar)) {
                    return revista;
                }
            }
        }
        throw new PublicationException("Se generó una Excepción buscando su título. " + tituloABuscar);
    }

    public boolean buscarLibro(Libro libroBuscado) {
        for (Publicacion publicacion : listaPublicaciones) {
            if (publicacion.equals(libroBuscado)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Revista> revistasOrdenadas() {
        ArrayList<Revista> listaRevistas = new ArrayList<>();
        for (Publicacion publicacion : listaPublicaciones) {
            if (publicacion instanceof Revista) {
                listaRevistas.add((Revista)publicacion);
            }
        }
        Collections.sort(listaRevistas);
        return listaRevistas;
    }

    public void ordenar() {
        //Collections.sort(listaPublicaciones);
        for (Publicacion publicacion : listaPublicaciones) {
            ArrayList<Publicacion> listaPublicacionesOrdenadas = new ArrayList<>();
            if (publicacion instanceof Libro) {
                listaPublicacionesOrdenadas.add((Libro)publicacion);
            }
            if (publicacion instanceof Revista) {
                listaPublicacionesOrdenadas.add((Revista)publicacion);
            }
        }
    }

    

}