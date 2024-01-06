import java.util.Scanner;

class Prueba {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero para contar de 1 a su numero");
    int numero = sc.nextInt();
    for (int i = 1; i <= numero; i++) {
      System.out.print(i + " ");
    }
    sc.close();
  }
}