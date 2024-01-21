package EjercicioTienda;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {
    static ArrayList<Articulo> inventario = new ArrayList<>();
    static ArrayList<Articulo> articulosVendidos = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println("Debes decidir cual es el producto inicial que vas a tener en tu tienda :D");
        anadirArticulo();
        System.out.println("Los articulos de su tienda son: ");
        mostrarDescripcionArticulos(inventario);
        if ((inventario.get(0).getStock())>0) {
            System.out.println("Ya tienes inventario!");
        } else {
            System.out.println("Debes comprar un inventario para iniciar tu Tienda :(");
            comprarAProveedor();
        }
        menu();
    }

    /**
     * Menú principal Tienda
     */
    public static void menu(){
            do {
                System.out.println("""

                    Seleccione una opción:
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
                        venderACliente("Manuel");
                    break;
                    case 3:
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("-----------------------  HACIENDO COMPRA A PROVEEDOR ----------------------");
                        System.out.println("---------------------------------------------------------------------------");
                        comprarAProveedor();
                    break;
                    case 4:
                        System.out.println("---------------------------------------------------------------------------");
                        System.out.println("-----------------------  ENTRANDO AL SUBMENU GESTIÓN ----------------------");
                        System.out.println("---------------------------------------------------------------------------");
                        submenuGestionArticulos();
                    break;
                    default:
                        System.err.println("Valor inválido");
                    break;
                }      
            } while (true);
    }

    /**
     * Pide, valida y devuelte el número si es entero entre 1-5
     * @return int
     */
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

    /**
     * Muestra el listado de articulos en la Tienda
     * @param arrayListArticulos Inventario
     */
    public static void mostrarDescripcionArticulos(ArrayList<Articulo> arrayListArticulos){
        for (Articulo articulo : arrayListArticulos) {
            System.out.println(articulo);
        }
    }

    /**
     * Busca un elemento por su indice y lo devuelve de acuerdo al indice ingresado
     * @param elementosFactura Objeto con la información necesaria para la creación de una factura
     * @param indexABuscar Indice del Objeto que desea devolver
     * @return Objeto que contiene un valor de tipo int, double o String
     */
    private static Object buscarResumen(ArrayList<Object> elementosFactura, int indexABuscar) {
        return elementosFactura.get(indexABuscar);
    }


    /**
     * Trae cualquier articulo en el inventario por su identificador
     * @param identificador Recibe el identificador a buscar
     * @return Articulo si existe
     */
    private static Articulo buscarArticuloPorIdentificador(int identificador) {
        for (Articulo articulo : inventario) {
            if (articulo.getIdentificador() == identificador) {
                return articulo;
            }
        }
        return null;
    }

    /**
     * Realiza la venta al cliente si la confirmaición es exitosa
     * @param nombreCliente
     */
    public static void venderACliente(String nombreCliente){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el identificador del articulo: ");
        int identificador = sc.nextInt();

        System.out.println("Ingrese la cantidad a comprar: ");
        int cantidadAComprar = sc.nextInt();

        Articulo articuloBuscado = buscarArticuloPorIdentificador(identificador);
        ArrayList<Object> elementosFactura = new ArrayList<>();
        elementosFactura.add(articuloBuscado.getNombre());
        elementosFactura.add(articuloBuscado.getPrecioVentaCliente());
        elementosFactura.add(cantidadAComprar);
        
        if (confirmaVenta(elementosFactura)) {
            articuloBuscado.vender(cantidadAComprar);
        }
    }

    /**
     * Confirma o cancela la compra
     * @param elementosFactura Informacion del articulo buscado por el comprador
     * @return boolean Si el comprador aprueba la compra
     */
    public static boolean confirmaVenta(ArrayList<Object> elementosFactura) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Artículo: " + buscarResumen(elementosFactura, 0));
        System.out.println("Precio Unitario: " + buscarResumen(elementosFactura, 1));
        System.out.println("Cantidad: " + buscarResumen(elementosFactura, 2));
    
        double precioUnitario = ((Number) buscarResumen(elementosFactura, 1)).doubleValue();
        double cantidadComprada = ((Number) buscarResumen(elementosFactura, 2)).doubleValue();

        double precioTotal = precioUnitario * cantidadComprada;
        System.out.println("Precio total: " + precioTotal);
    
        System.out.println("¿Confirmar la compra? (S/N)");
        String respuesta = sc.next().toUpperCase();
    
        if (respuesta.equals("S")) {
            System.out.println("Compra realizada con éxito");
            return true;
        } else {
            System.out.println("Compra cancelada");
            return false;
        }
    }

    /**
     * Pide la informacion necesaria para hacer una compra y realiza la compra actualizando los inventarios y pidiendo confirmacion al comprador
     */
    public static void comprarAProveedor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese identificador del artículo a comprar");
        int identificador = sc.nextInt();
        Articulo articulo = buscarArticuloPorIdentificador(identificador);
        if (articulo != null) {

            System.out.println("Ingrese cantidad a comprar:");
            int cantidadAComprar = sc.nextInt();

            System.out.println("Ingrese nombre del proveedor:");
            String nombreProveedor = sc.next();

            double precioTotal = articulo.getPrecioCompraProveedor() * cantidadAComprar;
            System.out.println("Precio total: " + precioTotal);
            System.out.println("¿Confirmar la compra? (S/N)");

            String respuesta = sc.next().toUpperCase();
            articulo.setNombreProveedor(nombreProveedor);
            if (respuesta.equals("S")) {
                articulo.comprar(cantidadAComprar);
                System.out.println("Compra realizada con éxito.");
            } else {
                System.out.println("Compra cancelada.");
            }
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

    public static void submenuGestionArticulos(){{
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("""

                Seleccione una opción:
                1. Añadir artículo
                2. Editar artículo
                3. Eliminar artículo
                4. Volver
                    """);
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("-------------------  ENTRANDO AL MENU AÑADIR ARTICULO  --------------------");
                    System.out.println("---------------------------------------------------------------------------");
                    anadirArticulo();
                break;
                case 2:
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("-------------------  ENTRANDO AL MENU EDITAR ARTICULO  --------------------");
                    System.out.println("---------------------------------------------------------------------------");
                    editarArticulo();
                break;
                case 3:
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("------------------  ENTRANDO AL MENU ELIMINAR ARTICULO  -------------------");
                    System.out.println("---------------------------------------------------------------------------");
                    eliminarArticulo();
                break;
                case 4:
                    System.out.println("---------------------------------------------------------------------------");
                    System.out.println("----------------------  ENTRANDO AL MENU PRINCIPAL  -----------------------");
                    System.out.println("---------------------------------------------------------------------------");
                break;
                default:
                    System.out.println("Opción no válida (1-4)");
            }
        } while (opcion != 4);
    }}

    /**
     * Añade articulo por identificador
     */
    public static void anadirArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del artículo:");
        String nombre = sc.nextLine();
        System.out.println("Ingrese precio de venta al cliente:");
        double precioVentaCliente = sc.nextDouble();
        System.out.println("Ingrese precio de compra al proveedor:");
        double precioCompraProveedor = sc.nextDouble();
        System.out.println("Ingrese stock:");
        int stock = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el proveedor:");
        String nombreProveedor = sc.nextLine();

        if(precioCompraProveedor>precioVentaCliente){
            System.err.println("Su artículo no se creó exitosamente porque el precio de compra es menor al precio de venta al cliente");
        } else {
            Articulo nuevoArticulo = new Articulo(nombre, precioVentaCliente, precioCompraProveedor, stock, nombreProveedor);
            inventario.add(nuevoArticulo);
            System.out.println("Artículo añadido con éxito.");
        }
    }

    /**
     * Edita articulo por identificador
     */
    public static void editarArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese identificador del artículo a editar:");
        int identificador = sc.nextInt();

        Articulo articulo = buscarArticuloPorIdentificador(identificador);
        if (articulo != null) {
            
            System.out.println("Ingrese nuevo precio de venta al cliente:");
            double nuevoPrecioVentaCliente = sc.nextDouble();
            System.out.println("Ingrese nuevo precio de compra al proveedor:");
            double nuevoPrecioCompraProveedor = sc.nextDouble();
            System.out.println("Ingrese nuevo stock:");
            int nuevoStock = sc.nextInt();

            articulo.setPrecioVentaCliente(nuevoPrecioVentaCliente);
            articulo.setPrecioCompraProveedor(nuevoPrecioCompraProveedor);
            articulo.setStock(nuevoStock);
            System.out.println("Artículo editado con éxito.");
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

    /**
     * Elimina articulo por identificador
     */
    public static void eliminarArticulo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese identificador del artículo a eliminar:");
        int identificador = sc.nextInt();

        Articulo articulo = buscarArticuloPorIdentificador(identificador);
        if (articulo != null) {
            inventario.remove(articulo);
            System.out.println("Artículo eliminado con éxito.");
        } else {
            System.out.println("Artículo no encontrado.");
        }
    }

}
