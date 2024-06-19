package thiar;

import java.util.concurrent.ThreadLocalRandom;

public class Adivina {

    private final String numeroSecreto;

   
    public Adivina(int  longitud) {
        
        if (longitud > 0 && longitud > 3 && longitud < 10) {
            String numeros = "0123456789";
            String cadenaNueva = "";
            for (int i = 0; i < numeros.length(); i++) {
                int azar = ThreadLocalRandom.current().nextInt(0, numeros.length());
                cadenaNueva = cadenaNueva + numeros.charAt(azar);
                numeros = numeros.replace(String.valueOf(numeros.charAt(azar)), "");
                System.out.println(numeros);
            }

            this.numeroSecreto = cadenaNueva;
           
        } else {
            throw new IllegalArgumentException("WEFW ");
        }
    }

    public int correctos (String cadena){
        for (int i = 0; i < this.numeroSecreto.length(); i++) {
            if (this.numeroSecreto.length() == cadena.length()) {
                
            }
        }
        return 1;
    }


    public static void main(String[] args) {

        Adivina d = new Adivina(5);

        System.out.println(d.numeroSecreto);
    }

    
    
}
