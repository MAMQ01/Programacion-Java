import java.util.Scanner;

class CuatroVeinte {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int longitud, a, b, i, c;
    a = 0;
    b = 1;
    System.out.println("Ingrese la cantidad de numeros fibbonacci que quiere ver");
    longitud = sc.nextInt();
    System.out.print(a + " ");
    System.out.print(b + " ");
    for (i = 2; i < longitud; i++) {
      c = a + b;
      System.out.print(c + " ");
      a = b;
      b = c;
      sc.close();
    }
  }
}