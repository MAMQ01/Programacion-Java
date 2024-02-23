package Unidad9Java.agenda_v2;

import java.util.ArrayList;

public class Agenda {

    protected ArrayList<Contacto> lista = new ArrayList<>();

    
    /**
     * Añade el contacto pasado como argumento a la agenda.
     * @param c contacto a agregar.
     * @return true, si se añadió exitosamente. false, si ya existe en la lista.
     */
    public boolean anyadirContacto(Contacto c){
        if (!existeContacto(c)) {
            lista.add(c);
            System.out.println("El contacto: " + c.getNombre() + " fué añadido exitosamente");
            return true;
        }
        System.out.println("No se agregó el contacto: " + c.getNombre() + " porque ya existe");
        return false;
    }
    
    public ArrayList<Contacto> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Contacto> lista) {
        this.lista = lista;
    }

    /**
     * Elimina el contacto pasado como argumento de la agenda.
     * @param c contacto a eliminar.
     * @return true, si se removió exitosamente. false, si no se removio o no existe.
     */
    public boolean eliminarContacto(Contacto c){
        if (existeContacto(c)) {
            lista.remove(c);
            return true;
        } else if (!existeContacto(c)){
            System.err.println("El contacto" + c.toString() + " no existe");
        }
        return false;
    }
    
    /**
     * Comprueba si existe el contacto pasado como parametro.
     * @param c contacto a buscar en la agenda.
     * @return true, si existe en la agenda. false, si no existe en la agenda.
     */
    public boolean existeContacto(Contacto c){
        for (Contacto contacto : lista) {
            if (contacto.equals(c)) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos(){
        for (Contacto contacto : lista) {
            System.out.println(contacto.toString());
        }
    }

    /**
     * Busca por nombre el contacto en la agenda.
     * @param nombre nombre del contacto a buscar.
     * @return true, si el nombre existe en la agenda. false, si no existe en la agenda.
     */
    public int buscaContacto(String nombre){
        for (Contacto contacto : lista) {
            if (contacto.getNombre().equals(nombre)) {
                return lista.indexOf(contacto);
            }
        }
        return -1;
    }
    
}
