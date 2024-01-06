import java.util.Scanner;

class DosCinco {
  public static void main(String[] args) {
    int numero, contador, factorial;
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese un numero positivo");
    numero = sc.nextInt();
    contador = 0;
    factorial = 1;
    if (numero >= 0) {
      while (contador <= numero) {
        System.out.println(contador + "! = " + factorial);
        contador = contador + 1;
        factorial = factorial * contador;
      }
    } else {
      System.out.println("Ingrese un numero positivo o 0");
    }
    sc.close();
  }
}