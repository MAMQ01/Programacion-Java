package Unidad11Java.ejercicioUno;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Parking {

    /* Realizar un programa que contenga una LinkedList para almacenar las matrículas de los
    coches aparcados en un parking. El parking es un poco raro, mide solo 3 metros de ancho
    y caben 10 coches, pero uno detrás de otro por lo que el último en entrar debe ser el
    primero en salir (esta estructura se llama pila LIFO – Last Input, First Output). El programa
    tendrá un menú para:
    ◦ Aparcar: se le pasará el número de matrícula y lo almacenará a no ser que esté lleno.
    ◦ Desaparcar: Muestra la matrícula del coche a desaparcar o bien un mensaje
    informando cadena vacía si el parking está vacío.
    ◦ Mostrar la lista de las matrículas de los coches que hay en el parking, por orden
    inverso al de llegada, es decir primero el último en llegar
    Nota: Usa los métodos que meten y sacan por el principio de la lista: addFirst,
    removeFirst */

    LinkedList<Coche> listaMatriculasCochesAparcados = new LinkedList<>();
    
    public Parking(){
        
    }
    
    public LinkedList<Coche> getCochesAparcados() {
        return listaMatriculasCochesAparcados;
    }

    public void setListaMatriculasCochesAparcados(LinkedList<Coche> listaMatriculasCochesAparcados) {
        this.listaMatriculasCochesAparcados = listaMatriculasCochesAparcados;
    }

    public void aparcar(Coche coche) throws Exception {
        if (listaMatriculasCochesAparcados.size()<10) {
            listaMatriculasCochesAparcados.addFirst(coche);
        } else {
            throw new Exception("Sin capacidad en su parking.");
        }
    }

    public void desAparcar(Coche coche) throws Exception {
        /* if (cochesAparcados.size()>0) {
            cochesAparcados.removeLast();
        } else {
            throw new Exception("Sin coches en su parking.");
        } */
        if (!listaMatriculasCochesAparcados.isEmpty() && coche.getMATRICULA()==listaMatriculasCochesAparcados.getLast().getMATRICULA()) {
            listaMatriculasCochesAparcados.removeLast();
        } else throw new Exception("Sin coches en su parking.");
    }

    public void mostrarCochesAparcados() {
        for (Coche coche : listaMatriculasCochesAparcados) {
            System.out.println(coche);
        }
    }

    //Averiguar cómo funciona
    public void mostrarCochesAparcadosAlaInversa() {
        Iterator<Coche> it = listaMatriculasCochesAparcados.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        
    }

    public static void main(String[] args) {
        
        Parking parking = new Parking();
        Coche cocheUno = new Coche("1");
        Coche cocheUnoCopia = new Coche("1.1");
        Coche cocheDos = new Coche("2");
        Coche cocheTres = new Coche("3");
        Coche cocheCuatro = new Coche("4");
        Coche cocheCinco = new Coche("5");
        Coche cocheSeis = new Coche("6");
        Coche cocheSiete = new Coche("7");
        Coche cocheOcho = new Coche("8");
        Coche cocheNueve = new Coche("9");
        Coche cocheDiez = new Coche("10");
        Coche cocheOnce = new Coche("11");

        try {
            parking.aparcar(cocheUno);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheUno.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheUnoCopia);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheUnoCopia.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheDos);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheDos.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheTres);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheTres.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheCuatro);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheCuatro.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheCinco);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheCinco.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheSeis);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheSeis.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheSiete);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheSiete.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheOcho);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheOcho.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheNueve);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheNueve.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheDiez);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheDiez.getMATRICULA());
            e.printStackTrace();
        }
        try {
            parking.aparcar(cocheOnce);
        } catch (Exception e) {
            System.err.println("Error aparcando el coche con matricula: " + cocheOnce.getMATRICULA());
            e.printStackTrace();
        }

        try {
            parking.desAparcar(cocheOnce);
        } catch (Exception e) {
            System.err.println("Error desaparcando el coche con matricula: " + cocheOnce.getMATRICULA());
            e.printStackTrace();
        }

        parking.mostrarCochesAparcados();
        System.out.println("_______________________");
        parking.mostrarCochesAparcadosAlaInversa();
    }

}