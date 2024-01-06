import java.util.Scanner;
  class TresDiez {
    public static void main(String[] args) {
      int secuenciaNotas, contadorNotaDiez;
      String deseaSalir;
      contadorNotaDiez = 0;
      deseaSalir = "NO";
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese la secuencia de notas entre 0-10 y -1 para salir");
        do {
          secuenciaNotas = sc.nextInt();
          if (secuenciaNotas >= 0 && secuenciaNotas <=10 ){
            if(secuenciaNotas == 10){
              contadorNotaDiez = contadorNotaDiez + 1;
            }
          }
        }
        while (secuenciaNotas != -1);
        if (contadorNotaDiez != 0){
          if(secuenciaNotas == -1){
            System.out.println("Escribio -1 ya no puede ingresar mas numeros a la secuencia" + "ingreso : " + contadorNotaDiez + " del numero diez");
            deseaSalir = "SI";
          }
        }
        System.out.println(deseaSalir);
        sc.close();
      }
    }
  