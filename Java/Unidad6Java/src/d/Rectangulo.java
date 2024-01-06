package Unidad6Java.src.d;

public class Rectangulo {
    private int x1,x2,y1,y2;

    public Rectangulo(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }



    public void imprime(){
        System.out.printf("La primer coordenada es (%d,%d) la segunda coordenada es (%d,%d) %n",this.x1,this.y1,this.x2,this.y2);
    }

    public void setX1Y1(int x1, int y1){
        setX1(x1);
        setY1(y1);
    }

    public void setX2Y2(int x2, int y2){
        setX2(x2);
        setY2(y2);
    }

    public void setAll(){
        setX1Y1(x1, y1);
        setX2Y2(x2, y2);
    }

    public double getPerimetro(){
        return 2*(Math.abs(getX2()-getX1())+Math.abs(getY2()-getY1()));
    }

    public double getArea(){
        return (getX2()-getX1())*(getY2()-getY1());
    }
    


}


/* System.out.printf("Del retangulo el perimetro: %d el area: %d %n"); */