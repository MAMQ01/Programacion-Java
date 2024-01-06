package Unidad6Java.src.d;

class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void imprime(){
    System.out.printf("Sacado por el Metodo Imprime: La coordenada X y Y son respectivamente (%d,%d) %n",getX(),getY());
    }

    public int setXY(int x, int y){
        setX(x);
        setY(y);
        return x+y;
        //return x+y; Funciona si lo dejo como un metodo que devuelve un Int pero no sé por qué funciona 
    }

    public void desplaza(int dx, int dy){
        setX(x+dx);
        setY(y+dy);
    }

    public double distancia(Punto p){
        double resultado;
        resultado = Math.sqrt(Math.pow((p.x-getX()),2)+(Math.pow((p.y-getY()),2)));
        return (int)resultado;
    }
}
