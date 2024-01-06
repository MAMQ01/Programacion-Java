package Unidad6Java.src.e;

import java.util.concurrent.ThreadLocalRandom;

public class Punto {
    private int x;
    private int y;


    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public static Punto crearPuntoAleatorio(){
        int xAzar = ThreadLocalRandom.current().nextInt(0,101);
        int yAzar = ThreadLocalRandom.current().nextInt(0,101);
        return new Punto(xAzar,yAzar);
    }
    public void imprime(){
        System.out.printf("Sacado por el Metodo Imprime: La coordenada X y Y son respectivamente (%d,%d) %n",getX(),getY());
    }
}
