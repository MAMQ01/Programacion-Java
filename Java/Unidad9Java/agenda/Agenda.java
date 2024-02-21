package Unidad9Java.agenda;

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
        if (lista.add(c)) {
            return true;
        }
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
            System.out.println(contacto);
        }
    }
    
    public int buscaContacto(String nombre){
        for (Contacto contacto : lista) {
            if (contacto.getNombre()==nombre) {
                return nombre.indexOf(nombre);
            }
        }
        return 10;
    }
    
}
