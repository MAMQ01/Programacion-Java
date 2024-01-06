package Unidad6Java.src.c;

public class EjercicioC1 {
    public static void main(String[] args) {

    Punto puntob1 = new Punto(2,5);
    Punto puntob2 = new Punto(3,8);
    Punto puntob3 = new Punto(12, 7);


    System.out.println("Del punto 1, la coordenada x es: " + puntob1.getX());
    System.out.println("Del punto 1, la coordenada y es: " + puntob1.getY());

    puntob1.setX(+puntob1.getX());
    puntob1.setY(puntob1.getY()+1);
    System.out.printf("Punto 1, Ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntob1.getX(), puntob1.getY());

    puntob2.setY(2);
    puntob2.setX(puntob2.getX()-8);
    System.out.printf("Punto 2, Ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntob2.getX(), puntob2.getY());

    puntob3.setX(puntob1.getX()*3);
    puntob3.setY(puntob3.getY()+5);
    System.out.printf("Punto 3, Ahora las cordenadas X y Y respectivamente son: (%d,%d) %n", puntob3.getX(), puntob3.getY());

    }
}

