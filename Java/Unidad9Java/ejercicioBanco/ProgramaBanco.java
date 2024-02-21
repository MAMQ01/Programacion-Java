package Unidad9Java.ejercicioBanco;

import java.util.ArrayList;

public class ProgramaBanco {
    ArrayList<CuentaBancaria> lista = new ArrayList<>();
    public static void main(String[] args) {

        ProgramaBanco bancoBBVA = new ProgramaBanco();

        CuentaAhorros ahorros = new CuentaAhorros("IBAN ·12345678", 330);
        CuentaCorriente corriente = new CuentaCorriente("IBAN ·1234", 10000);
        CuentaAhorros ahorrosDos = new CuentaAhorros("IBAN ·12345678", 10);
        CuentaCorriente corrienteDos = new CuentaCorriente("IBAN ·1234", 100);

        bancoBBVA.lista.add(ahorros);
        bancoBBVA.lista.add(corriente);
        bancoBBVA.lista.add(ahorrosDos);
        bancoBBVA.lista.add(corrienteDos);

        System.out.println(ahorros.consultaSaldo());
        System.out.println(ahorros.calcularIntereses());

        bancoBBVA.muestraCuentas();
    }

    public void muestraCuentas(){
        for (CuentaBancaria cuentaBancaria : lista) {
            System.out.println(cuentaBancaria.toString());
        }
    }

}
