package Unidad6Java.src.c;

class Rectangulo {

    private int x1, y1, x2, y2;

    public Rectangulo(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        if (this.x2 < this.x1 || this.y2 < this.y1) {
            System.err.printf(
                    "Error! no permitimos coordenadas donde x2/y2 sea mayor que x1/y1, igual te enseño las coordenadas (%d,%d) (%d,%d) %n",
                    this.x1, this.y1, this.x2, this.y2);
        }
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

}
