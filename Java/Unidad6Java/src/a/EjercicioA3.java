package Unidad6Java.src.a;

public class EjercicioA3 {
    public static void main(String[] args) {
        int perimetroRectanguloUno,longitudRectanguloUno,altoRectanguloUno, areaRectanguloUno, perimetroRectanguloDos,longitudRectanguloDos, altoRectanguloDos, areaRectanguloDos;

        Rectangulo rectanguloUno = new Rectangulo();
        rectanguloUno.x1 = 0;
        rectanguloUno.y1 = 0;
        rectanguloUno.x2 = 5;
        rectanguloUno.y2 = 5;
        System.out.printf("Primer rectangulo (%d,%d) y (%d,%d) %n", rectanguloUno.x1, rectanguloUno.y1,rectanguloUno.x2, rectanguloUno.y2);

        if(rectanguloUno.x2>rectanguloUno.x1){
            longitudRectanguloUno = rectanguloUno.x2-rectanguloUno.x1;
        }else{
            longitudRectanguloUno = rectanguloUno.x1-rectanguloUno.x2;
        }

        if(rectanguloUno.y2>rectanguloUno.y1){
            altoRectanguloUno = rectanguloUno.y2-rectanguloUno.y1;
        }else{
            altoRectanguloUno = rectanguloUno.y1-rectanguloUno.y2;
        }

        perimetroRectanguloUno = 2*(longitudRectanguloUno+altoRectanguloUno);
        areaRectanguloUno = (longitudRectanguloUno*altoRectanguloUno);
        System.out.println("Perimetro rectangulo Uno: "+perimetroRectanguloUno+" area del rectangulo "+areaRectanguloUno);

        
        Rectangulo rectanguloDos = new Rectangulo();
        rectanguloDos.x1 = 7;
        rectanguloDos.y1 = 9;
        rectanguloDos.x2 = 2;
        rectanguloDos.y2 = 3;
        System.out.printf("Segundo rectangulo (%d,%d) y (%d,%d) %n", rectanguloDos.x1, rectanguloDos.y1, rectanguloDos.x2, rectanguloDos.y2);
        
        if(rectanguloDos.x2>rectanguloDos.x1){
            longitudRectanguloDos = rectanguloDos.x2-rectanguloDos.x1;
        }else{
            longitudRectanguloDos = rectanguloDos.x1-rectanguloDos.x2;
        }
        
        if(rectanguloDos.y2>rectanguloDos.y1){
            altoRectanguloDos = rectanguloDos.y2-rectanguloDos.y1;
        }else{
            altoRectanguloDos = rectanguloDos.y1-rectanguloDos.y2;
        }

        perimetroRectanguloDos = 2*(longitudRectanguloDos+altoRectanguloDos);
        areaRectanguloDos = (longitudRectanguloDos*altoRectanguloDos);
        System.out.println("Perimetro rectangulo Uno: "+perimetroRectanguloDos+" area del rectangulo "+areaRectanguloDos);
    }
}

class Rectangulo {
    int x1, y1, x2, y2;
}