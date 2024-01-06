package Unidad6Java.src.e;

import java.util.concurrent.ThreadLocalRandom;

public class Rectangulo {
    private int x1, x2, y1, y2;
    private static int min = 0, max = 100;

    public Rectangulo(int x1, int x2, int y1, int y2) {
        if (x1 >= min && x1 <= max) {
            this.x1 = x1;
        } else {
            System.err.println("Error guardando x1");
        }
        if(x2 >=min && x2 <= max){
            this.x2 = x2;
        } else {
            System.err.println("Error guardando x2");
        }
        if(y1 >= min && y1 <= max){
            this.y1 = y1;
        } else {
            System.err.println("Error guardando y1");
        }
        if(y2 >= min && y2 <= max){
            this.y2 = y2;
        } else {
            System.err.println("Error guardando y2");
        }
        
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        if (x1 >= min && x1 <= max) {
            this.x1 = x1;
        } else {
            System.err.println("Error seteando x1");
        }
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        if(x2 >=min && x2 <= max){
            this.x2 = x2;
        } else {
            System.err.println("Error guardando x2");
        }
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        if(y1 >= min && y1 <= max){
            this.y1 = y1;
        } else {
            System.err.println("Error guardando y1");
        }
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        if(y2 >= min && y2 <= max){
            this.y2 = y2;
        } else {
            System.err.println("Error guardando y2");
        }
    }

    public void imprime() {
        System.out.printf("La primer coordenada es (%d,%d) la segunda coordenada es (%d,%d) %n", this.x1, this.y1, this.x2, this.y2);
    }

    public void setX1Y1(int x1, int y1) {
        setX1(x1);
        setY1(y1);
    }

    public void setX2Y2(int x2, int y2) {
        setX2(x2);
        setY2(y2);
    }

    public void setAll() {
        setX1Y1(x1, y1);
        setX2Y2(x2, y2);
    }

    public double getPerimetro() {
        return 2 * (Math.abs(getX2() - getX1()) + Math.abs(getY2() - getY1()));
    }

    public double getArea() {
        return (getX2() - getX1()) * (getY2() - getY1());
    }

    public static Rectangulo creaDosCoordenadasAleatorias(){
        int x11 = ThreadLocalRandom.current().nextInt(min,max+1);
        int x22 = ThreadLocalRandom.current().nextInt(min,max+1);
        int y11 = ThreadLocalRandom.current().nextInt(min,max+1);
        int y22 = ThreadLocalRandom.current().nextInt(min,max+1);
        return new Rectangulo(x11, x22, y11, y22); 
    }

}
