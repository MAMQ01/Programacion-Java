package Unidad6Java.src.d;

public class EjercicioD3 {
    public static void main(String[] args) {
    Rectangulo r1 = new Rectangulo(10, 5, 20, 30);
//Testeo los setters
    r1.imprime();
    r1.setX1Y1(0, 0);
    r1.imprime();
    r1.setX2Y2(5, 5);
    r1.imprime();
    r1.setAll();
    r1.imprime();

    System.out.println("El perimetro es: "+(int)r1.getPerimetro());

    System.out.println("El area es: "+(int)r1.getArea());
    
    }
}
