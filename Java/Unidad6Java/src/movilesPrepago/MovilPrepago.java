package Unidad6Java.src.movilesPrepago;

public class MovilPrepago {
    int numeroMovil;
    float costeEstableceLlamada;
    float costeMinutoLlamada;
    float costeConsumoMB;
    float saldo;

    public MovilPrepago(int numeroMovil, float costeEstableceLlamada, float costeMinutoLlamada, float costeConsumoMB,float saldo) {
        String numeroMovilStr = String.valueOf(numeroMovil);
        int longitudNumero = numeroMovilStr.length();
        if(longitudNumero==13){
            this.numeroMovil = numeroMovil;
        } else {
            System.err.println("No puede ser un numero diferente de 13 digitos igual lo gaurdo para poder continuar con el ejercicio (no consigo hacerlo funcionar con mas de 10 digitos)");
        }
        this.costeEstableceLlamada = costeEstableceLlamada;
        this.costeMinutoLlamada = costeMinutoLlamada;
        this.costeConsumoMB = costeConsumoMB;
        this.saldo = saldo;
    }
    public int getNumeroMovil() {
        return numeroMovil;
    }
    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }
    public float getCosteEstableceLlamada() {
        return costeEstableceLlamada;
    }
    public void setCosteEstableceLlamada(float costeEstableceLlamada) {
        this.costeEstableceLlamada = costeEstableceLlamada;
    }
    public float getCosteMinutoLlamada() {
        return costeMinutoLlamada;
    }
    public void setCosteMinutoLlamada(float costeMinutoLlamada) {
        this.costeMinutoLlamada = costeMinutoLlamada;
    }
    public float getCosteConsumoMB() {
        return costeConsumoMB;
    }
    public void setCosteConsumoMB(float costeConsumoMB) {
        this.costeConsumoMB = costeConsumoMB;
    }
    public float getSaldo() {
        return saldo;
    }


    public void efectuarLlamada(int segundos){
        float precioSegundoLlamada = costeMinutoLlamada/60;
        if(saldo>=costeMinutoLlamada && saldo - (precioSegundoLlamada*segundos) > 0 ){
            saldo = saldo - (precioSegundoLlamada*segundos);
        } else {
           System.err.printf("Se corta la llamada no tiene suficiente saldo para llamar %d Segundos %n",segundos);
        }
        //reduce el saldo si no es suficiente, se corta la llamada
    }

    public void navegar(int MB){
        if(saldo>=costeConsumoMB && saldo - (costeConsumoMB*MB) > 0){
            saldo = saldo - (costeConsumoMB*MB);
        } else {
            System.err.printf("Se corta la navegacion no tiene suficiente saldo para navegar %dMB %n",MB);
        }
        //analogo a efectar una llamada
    }

    public boolean recargar(int importe){
        if(importe % 5 == 0){
            saldo = saldo + importe;
            return true;
        } else {
            System.err.println("ERROR! Solo se permite recargar en multiplos de 5$");
            return false;
        }
        //aumenta el saldo, debe ser multiplo de 5 E sino devuelve false
    }

    public float consultarSaldo(){
        return getSaldo();
    }

}
