package Unidad6Java.src.triangulo;

import Unidad6Java.src.e.Punto;

public class Triangulo {
    Punto verticeUno, verticeDos, verticeTres ;


    public Triangulo() {
        this.verticeUno = Punto.crearPuntoAleatorio();
        this.verticeDos = Punto.crearPuntoAleatorio();
        this.verticeTres = Punto.crearPuntoAleatorio();
    }

    public double perimetroTriangulo(){

        double ladoUno = Math.sqrt(Math.pow(verticeDos.getX() - verticeUno.getX(), 2) + Math.pow(verticeDos.getY() - verticeUno.getY(), 2));
        double ladoDos = Math.sqrt(Math.pow(verticeTres.getX() - verticeDos.getX(), 2) + Math.pow(verticeTres.getY() - verticeDos.getY(), 2));
        double ladoTres = Math.sqrt(Math.pow(verticeTres.getX() - verticeUno.getX(), 2) + Math.pow(verticeTres.getY() - verticeUno.getY(), 2));

        return ladoUno+ladoDos+ladoTres ;
    }

    public double areaTriangulo() {
        double area = 0.5 * Math.abs(
                verticeUno.getX() * (verticeDos.getY() - verticeTres.getY()) +
                verticeDos.getX() * (verticeTres.getY() - verticeUno.getY()) +
                verticeTres.getX() * (verticeUno.getY() - verticeDos.getY())
        );

        return area;
    }
    
}
