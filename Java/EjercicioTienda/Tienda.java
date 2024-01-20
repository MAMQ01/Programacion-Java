package EjercicioTienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    static ArrayList<Articulo> inventario = new ArrayList<>();
    static ArrayList<Articulo> articulosVendidos = new ArrayList<>();

    public static void main(String[] args) {
        //Muestra la funcion menu menu()
        //Pide la opcion un char pideOpcionMenuPrincipal()
        //Mostrar el listado de Articulo de la tienda mostrarDescripcionArticulos()
        //Hacer venta a cliente ventaACliente()


        //Creando instancias de Articulo
        Articulo articuloUno = new Articulo("Zapatos",50, 5, 30);
        Articulo articuloDos = new Articulo("Jean",40, 5, 20);
        Articulo articuloTres = new Articulo("Camiseta", 27, 7, 4);

        //Añadiendo articulos al ArrayList de tipo Articulo
        inventario.add(articuloUno);
        inventario.add(articuloDos);
        inventario.add(articuloTres);


        menu();
    }
    

    public static void menu(){
            do {
                System.out.println("""
                    1. Mostrar artículos.
                    2. Venta a cliente.
                    3. Compra a proveedor.
                    4. Gestionar artículos.
                    5. Salir.
                        """);
                switch (pideOpcionMenuPrincipal()) {
                    case 1:
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("----------  MOSTRANDO TODO EL LISTADO DE ARTICULOS DE LA TIENDA  ----------");
                        System.out.println("---------------------------------------------------------------------------");
                        mostrarDescripcionArticulos(inventario);
                    break;
                    case 2:
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("-----------------------  HACIENDO VENTA A CLIENTE  ------------------------");
                        System.out.println("---------------------------------------------------------------------------");
                        venderACliente(3, 1, "Manuel");
                    break;
                    case 3:
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("-----------------------  HACIENDO COMPRA A PROVEEDOR ----------------------");
                        System.out.println("---------------------------------------------------------------------------");
                    break;
                    default:
                    break;
                }      
            } while (true);
    }

    public static int pideOpcionMenuPrincipal() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            String numero = sc.nextLine();
            if (numero.matches("^[1-5]$")) {
                opcion = Integer.parseInt(numero);
                if (opcion>=1 && opcion<=5) {
                    entradaValida = true;
                }
            } else {
                System.out.println("Ingrese un número válido (1-5)");
            }
        }
        return opcion;
    }

    //La opción 1 mostrará por pantalla la descripción de todos los artículos de la
    //tienda.
    public static void mostrarDescripcionArticulos(ArrayList<Articulo> arrayListArticulos){
        for (Articulo articulo : arrayListArticulos) {
            System.out.println(articulo);
        }
    }

    //La opción 2 permitirá realizar una venta. Pedirá los identificadores y cantidades
    //de los artículos deseados además del nombre del cliente. Mostrará el precio total y
    //pedirá confirmar la venta.

    public static boolean venderACliente(int identificador, int cantidadAComprar, String nombreCliente){
        double precioTotal = 0;
        boolean confirmarVenta = false;
        double subtotal = 0;
        int seRepite = 0;
        for (Articulo articulo : inventario) {
            if (identificador==articulo.getIdentificador()) {
                articulosVendidos.add(articulo);
                subtotal = subtotal + articulo.getPrecioVentaCliente();
                confirmarVenta = articulo.vender(cantidadAComprar);
                for (Articulo vendido : articulosVendidos) {
                    if(articulo.equals(vendido)){
                        seRepite++;
                    }
                }
            }
            precioTotal=precioTotal+subtotal;
        }
        if (confirmarVenta) {
            System.out.println("La compra de " + nombreCliente + " fue: ");
            for (Articulo articulo : articulosVendidos) {
                System.out.println(articulo);
            }
            precioTotal = precioTotal * seRepite;
            subtotal = precioTotal/1.21;
            System.out.println("Precio subtotal: " + subtotal + " unidades: " + seRepite + " el precio Total es de: " + precioTotal);
        } else {
            System.out.println("No se pudo completar la venta.");
        }
        return confirmarVenta;
    }

}
