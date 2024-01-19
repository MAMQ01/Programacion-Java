package EJerciciosArrayList;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Factura {
    private int numeroIdentificador;
    private int numeroCliente;
    private Date fechaAlta;
    private ArrayList<ItemFactura> listaDeItems;
    public static final double IVA = 1.21;


    public Factura(int numeroIdentificador, int numeroCliente) {
        this.numeroIdentificador = numeroIdentificador;
        this.numeroCliente = numeroCliente;
        this.listaDeItems = new ArrayList<>();
        fechaAlta = new Date();
    }

    public static char pideOpcionChar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la opcion que desea: ");
        char opcionSeleccionada = sc.nextLine().charAt(0);
        return opcionSeleccionada;
    }

    public static ArrayList<Factura> anadirFacturas(int identificadorCliente , int numeroCliente, Factura itemFactura){
        System.out.println("Menú añadir Instancia de Factura");
        ArrayList<Factura> arrayFactura = new ArrayList<>();
        arrayFactura.add(itemFactura);
        return arrayFactura;
    }

    public void agregarItem(String descripcion, double precioUnitario, int cantidadUnidades) {
        ItemFactura nuevoItem = new ItemFactura(descripcion, precioUnitario, cantidadUnidades);
        this.listaDeItems.add(nuevoItem);
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

    public static ArrayList<Factura> mostrarListaFacturas(ArrayList<Factura> arrayList){
        for (Factura factura : arrayList) {
            System.out.println(factura);
        }
        return arrayList;
    }

    public static ArrayList<ItemFactura> mostrarItemsFactura(ArrayList<ItemFactura> arrayList){
        for (ItemFactura factura : arrayList) {
            System.out.println(factura);
        }
        return arrayList;
    }

    public static ArrayList<Factura> eliminarPorPosicionFactura(ArrayList<Factura> arrayListFactura, int posicionAEliminar){
        System.out.println("Menú eliminarPosicion");
        if (posicionAEliminar >= 0 && posicionAEliminar < arrayListFactura.size()) {
            arrayListFactura.remove(posicionAEliminar);
        } else {
            System.out.println("Posición inválida. No se pudo eliminar.");
        }
        return arrayListFactura;
    }


    public static ArrayList<ItemFactura> eliminarPorPosicionItem(ArrayList<ItemFactura> arrayListItem, int posicionAEliminar) {
        System.out.println("Menú eliminarPosicion");
        if (posicionAEliminar >= 0 && posicionAEliminar < arrayListItem.size()) {
            arrayListItem.remove(posicionAEliminar);
        } else {
            System.out.println("Posición inválida. No se pudo eliminar.");
        }
        return arrayListItem;
    }

    public static int pidePosicionAEliminar() {
        Scanner sc = new Scanner(System.in);
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
    

    @Override
    public String toString() {
        return "Factura [numeroIdentificador=" + numeroIdentificador + ", numeroCliente=" + numeroCliente
                + ", fechaAlta=" + fechaAlta + ", listaDeItems=" + listaDeItems + "]";
    }

    public static String pideDescripcion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la descripción del producto: ");
        String descripcion = sc.nextLine();
        return descripcion;
    }

    public static double pidePrecioUnitario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el precio unitario del producto: ");
        return sc.nextDouble();
    }

    public static int pideCantidadUnidades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de unidades del producto: ");
        return sc.nextInt();
    }

    public double calcularImporteTotal() {
        double total = 0;
        for (ItemFactura item : listaDeItems) {
            total += item.getImporteTotal();
        }
        return total * IVA;
    }

    public void agregarItem(ItemFactura item) {
        this.listaDeItems.add(item);
    }

}
