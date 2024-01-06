package Unidad6Java.src.b;

public class EjercicioB3 {
    public static void main(String[] args) {
        
        int perimetroRectanguloUno,longitudRectanguloUno,altoRectanguloUno, areaRectanguloUno, perimetroRectanguloDos,longitudRectanguloDos, altoRectanguloDos, areaRectanguloDos;
        Rectangulo rectanguloUno = new Rectangulo(0, 0, 5, 5);
        Rectangulo rectanguloDos = new Rectangulo(7, 9, 2, 3);

        
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
        System.out.println("Perimetro rectangulo Dos: "+perimetroRectanguloDos+" area del rectangulo "+areaRectanguloDos);
    }
}
