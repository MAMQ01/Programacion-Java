package Unidad6Java.src.programaEthicalBank;

public class EthicalBank {
    public static void main(String[] args) {
        CuentaBancaria nuevaCuenta = new CuentaBancaria("CARLOS MUÑOZ");
        System.out.println(nuevaCuenta.getSaldo());
        System.out.println(CuentaBancaria.getIBAN());
        nuevaCuenta.setIngreso(1000);

        System.out.println(nuevaCuenta.getTitular());
        System.out.println(nuevaCuenta.datosCuenta());
        nuevaCuenta.setIngreso(500);
        System.out.printf("Despues de ingresar 500 su saldo es: %.2f %n",nuevaCuenta.getSaldo());
    }
}
