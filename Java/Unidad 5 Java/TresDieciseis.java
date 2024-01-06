import java.util.Scanner;

class TresDieciseis {
  public static void main(String[] args) {
    double media, mayor, menor, numIntroducido, contadorMedia;
    int numAIntroducir, i;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Ingrese la cantidad total de numeros");
      numAIntroducir = sc.nextInt();
      contadorMedia = 0;
      mayor = Float.MIN_VALUE;
      menor = Float.MAX_VALUE;
      media = 0;
      for (i=1; i<=numAIntroducir; i++) {
        System.out.println("Ingrese un numero");   
        numIntroducido = sc.nextDouble();
        if(numIntroducido>mayor){
          mayor = numIntroducido;
        }
        if(numIntroducido<menor){
          menor = numIntroducido;
        }
        contadorMedia = numIntroducido + contadorMedia;
      }
      media = contadorMedia/numAIntroducir;
      System.out.println("Se han introducido " + numAIntroducir +  " numeros. El mayor es " + mayor + ", el menor es " + menor + " y la media es " + media);
      sc.close();
    }
  }
}