package EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Factura {
    private int numeroIdentificador;
    private int numeroCliente;
    private Date fechaAlta;
    public static final double IVA = 1.21;
    private String descripcion;
    private double precioUnitario;
    private int cantidadUnidades;
    private static final double DESCUENTO = 0.95;
    private double importeTotal = 0;


    public Factura(int numeroIdentificador, int numeroCliente) {
        this.numeroIdentificador = numeroIdentificador;
        this.numeroCliente = numeroCliente;
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

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
        
        /* Un número indeterminado de lineaFactura que contienen:
        ◦ Descripción del producto
        ◦ Precio unitario
        ◦ Cantidad de unidades
        ◦ Porcentaje de descuento: 5% para líneas con más de 10 unidades.
        ◦ Importe total de la línea.
        • Importe total: inicialmente cero, y se va actualizando siempre que se
        añadan/eliminen líneas. */

    public Factura(String descripcion, double precioUnitario, int cantidadUnidades,
            double importeTotal) {
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidadUnidades = cantidadUnidades;
        this.importeTotal = importeTotal;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public int getCantidadUnidades() {
        return cantidadUnidades;
    }

    public void setCantidadUnidades(int cantidadUnidades) {
        this.cantidadUnidades = cantidadUnidades;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }


    public static void mostrarMenu(){
        char opcionSeleccionada = 'f';
        ArrayList<Double> arrayLineas = new ArrayList<>();
        do {
            opcionesASeleccionar();
            opcionSeleccionada =  EjercicioUno.pideOpcionChar();
            switch (opcionSeleccionada) {
                case 'a': 
                    Factura facturaUno = new Factura(pideNumeroIdentificadorCliente(), pideNumeroCliente());
                    Factura facturaDos = new Factura(pideNumeroIdentificadorCliente(), pideNumeroCliente());
                    Factura facturaTres = new Factura(pideNumeroIdentificadorCliente(), pideNumeroCliente());
                    anadirAltura(1,3,facturaUno);
                    System.out.println("Salida Alta Factura");
                    break;
                case 'b': 
                    EjercicioUno.mostrarListaActual(arrayLineas); 
                    System.out.println(arrayLineas);
                System.out.println("Salida Agregar Producto");

                    break;
                case 'c': 
                    EjercicioUno.eliminarPorPosicion(arrayLineas, EjercicioUno.pidePosicionAEliminar());
                    System.out.println("Salida Alta Factura");
                    break;
                case 'd': 
                    EjercicioUno.eliminarPorValor(arrayLineas, EjercicioUno.pideValorAEliminar());
                    System.out.println("Salida Alta Factura");
                    break;
                case '0': System.exit(0);
                    break;
                default:
                System.err.println("Introdujo una opción no válida.");
                    break;
            }
        } while (opcionSeleccionada!='0');
    }

    public static ArrayList<Factura> anadirAltura(int identificadorCliente , int numeroCliente, Factura factura){
        System.out.println("Menú añadir Instancia de Factura");
        ArrayList<Factura> arrayFactura = new ArrayList<>();
        arrayFactura.add(factura);
        return arrayFactura;
    }

    public static void opcionesASeleccionar(){
        System.out.println(
            """
            El menú que puede selecionar es: 
            a) Alta Factura
            b) Agregar Producto
            c) Elimina Producto
            d) Ordenar lista

            0) SALIR
            """);
    }

    public static int pideNumeroCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero cliente");
        int numeroCliente = sc.nextInt();
        return numeroCliente;
    }

    public static int pideNumeroIdentificadorCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero identificador cliente");
        int numeroCliente = sc.nextInt();
        return numeroCliente;
    }

}
