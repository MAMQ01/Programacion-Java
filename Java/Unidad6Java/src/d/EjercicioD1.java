package Unidad6Java.src.d;

public class EjercicioD1 {
    public static void main(String[] args) {

    Punto puntob1 = new Punto(2,5);
    Punto puntob2 = new Punto(3,8);
    Punto puntob3 = new Punto(12, 7);
    int distancia;


    System.out.println("Del punto 1, la coordenada x es: " + puntob1.getX());
    System.out.println("Del punto 1, la coordenada y es: " + puntob1.getY());

    puntob1.setX(+puntob1.getX());
    puntob1.setY(puntob1.getY()+1);
    puntob1.imprime();

    puntob2.setY(2);
    puntob2.setX(puntob2.getX()-8);
    puntob2.imprime();
    
    puntob3.setX(puntob1.getX()*3);
    puntob3.setY(puntob3.getY()+5);
    puntob3.imprime();

    puntob3.setXY(0, 0);
    puntob3.imprime();
    puntob3.desplaza(5, 10);
    puntob3.imprime();

    distancia = (int)puntob3.distancia(puntob1);
    System.out.printf("Distancia entre dos puntos: %d", distancia) ; //Tuve que crear distancia y y convertirlo a Int aun no se por qué
    }


}
