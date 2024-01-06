import java.util.Scanner;
//Intente de todas la formas, revise apuntes busque en internet y no encontré como conseguir que diga Infinity
class TresDoce {
  public static void main(String[] args) {
    double base, operacion;
    int exponente, i;
    operacion = 1;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Ingrese el numero al cual va a elevar");
      base = sc.nextDouble();
      System.out.println("Ingrese el numero que va a elevar");
      exponente = sc.nextInt();
      for (i=1; i<=exponente; i++) {
        operacion = operacion * base;
        System.out.println(operacion);
      }
      sc.close();
    }
  }
}