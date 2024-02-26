package Unidad8Java.EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Factura {
    public static Scanner sc = new Scanner(System.in);
    private int numeroIdentificador;
    private int numeroCliente;
    private Date fechaAlta;
    private ArrayList<LineaFactura> lineaFacturas;
    public static final int IVA = 21;


    public Factura(int numeroIdentificador, int numeroCliente) {
        this.numeroIdentificador = numeroIdentificador;
        this.numeroCliente = numeroCliente;
        this.lineaFacturas = new ArrayList<>();
        fechaAlta = new Date();
    }
 

    public int getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(int numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }



    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }



    public static char pideOpcionChar() {
        System.out.println("Ingrese la opcion que desea: ");
        String input = sc.next();
        sc.nextLine();
        return input.charAt(0);
    }
    

    public static void opcionesASeleccionar(){
        System.out.println(
            """
            El menú que puede selecionar es: 
            a) Alta Factura
            b) Agregar Linea/Item
            c  Mostrar Factura
            d) Elimina Producto Linea/Item

            0) SALIR
            """);
    }
    public static int pideNumeroIdentificadorCliente(){
        System.out.println("Ingrese el numero identificador cliente");
        int numeroCliente = sc.nextInt();
        sc.nextLine();
        return numeroCliente;
    }

    public static int pideNumeroCliente(){
        System.out.println("Ingrese el numero cliente");
        int numeroCliente = sc.nextInt();
        sc.nextLine();
        return numeroCliente;
    }


    public static ArrayList<LineaFactura> eliminarPorPosicionLineaFactura(ArrayList<LineaFactura> lineaFacturas, int posicionAEliminar){
        System.out.println("Menú eliminarPosicion");
        if (posicionAEliminar >= 0 && posicionAEliminar < lineaFacturas.size()) {
            lineaFacturas.remove(posicionAEliminar);
        } else {
            System.out.println("Posición inválida. No se pudo eliminar.");
        }
        return lineaFacturas;
    }


    public static ArrayList<LineaFactura> eliminarPorPosicionItem(ArrayList<LineaFactura> arrayListItem, int posicionAEliminar) {
        System.out.println("Menú eliminarPosicion");
        if (posicionAEliminar >= 0 && posicionAEliminar < arrayListItem.size()) {
            arrayListItem.remove(posicionAEliminar);
        } else {
            System.out.println("Posición inválida. No se pudo eliminar.");
        }
        return arrayListItem;
    }

    public static int pidePosicionAEliminar() {
        int posicion;
        do {
            System.out.println("Ingrese la posición que desea eliminar: ");
            posicion = sc.nextInt();
            if (posicion <= 0) {
                System.err.println("Posición inválida. Debe ser mayor que 0.");
            }
        } while (posicion <= 0);
        if (posicion > 0) {
            posicion--;
        }
        return posicion;
    }

    public static String pideDescripcion(){
        System.out.println("Ingrese la descripción del producto: ");
        String descripcion = sc.nextLine();
        return descripcion;
    }

    public static double pidePrecioUnitario() {
        System.out.println("Ingrese el precio unitario del producto: ");
        return sc.nextDouble();
    }

    public static int pideCantidadUnidades() {
        System.out.println("Ingrese la cantidad de unidades del producto: ");
        return sc.nextInt();
    }

    public void agregarItem(LineaFactura item) {
        this.lineaFacturas.add(item);
    }


    @Override
    public String toString() {
        return "Factura [numeroIdentificador=" + numeroIdentificador + ", numeroCliente=" + numeroCliente
                + ", fechaAlta=" + fechaAlta + ", lineaFacturas=" + lineaFacturas + "]";
    }


    public Factura() {
    }

    

}
