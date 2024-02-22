package Unidad9Java.agenda_v1;

import java.util.ArrayList;

public class Agenda {

    protected ArrayList<Contacto> lista = new ArrayList<>();

    public ArrayList<Contacto> getLista() {
        return lista;
    }
    public void setLista(ArrayList<Contacto> lista) {
        this.lista = lista;
    }

    public boolean anyadirContacto(Contacto c){
        if (!existeContacto(c)) {
            lista.add(c);
            System.out.println("El contacto: " + c.getNombre() + " fué añadido exitosamente");
            return true;
        }
        System.out.println("No se agregó el contacto: " + c.getNombre() + " porque ya existe");
        return false;
    }

    public boolean eliminarContacto(Contacto c){
        if (lista.remove(c)) {
            return true;
        }
        return false;
    }

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
    
    public int buscaContacto(String nombre){
        for (Contacto contacto : lista) {
            if (contacto.getNombre().equals(nombre)) {
                return lista.indexOf(contacto);
            }
        }
        return -1;
    }
    
}
