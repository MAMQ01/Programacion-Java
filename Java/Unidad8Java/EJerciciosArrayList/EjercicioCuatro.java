package Unidad8Java.EJerciciosArrayList;

import java.util.ArrayList;

public class EjercicioCuatro {
    public static ArrayList<Factura> listaDeFacturas = new ArrayList<>();
    ArrayList<LineaFactura> lineaFacturas = new ArrayList<>();
    Factura facturaUno = new Factura();

    public static void main(String[] args) {
        /* Ejercicio 4 – Factura
        Diseñar una clase Factura que consta de:
        • Número identificador: lo proporciona el usuario en el alta de la factura.
        • Fecha de la factura: la toma del sistema en el momento del alta.
        • Número de cliente: : lo proporciona el usuario en el alta de la factura.
        • Porcentaje de IVA: 21% para todas las facturas.
        • Un número indeterminado de lineaFactura que contienen:
        ◦ Descripción del producto
        ◦ Precio unitario
        ◦ Cantidad de unidades
        ◦ Porcentaje de descuento: 5% para líneas con más de 10 unidades.
        ◦ Importe total de la línea.
        • Importe total: inicialmente cero, y se va actualizando siempre que se
        añadan/eliminen líneas.
        Implementar la clase con su constructor y métodos para añadir línea de factura, eliminar
        línea de factura y mostrar la factura por consola. Te hará falta una clase LineaFactura con
        su constructor. Para añadir línea de factura, habrá que solicitar al usuario los campos
        necesarios para añadirlo (descripción, precio unitario y cantidad de unidades). Para
        eliminar una línea, solicitaremos el número de línea.
        Hacer también un programa con un menú para gestionar una factura (alta,
        añadir/eliminar líneas, mostrar factura) Nota: pensar en método toString() para
        LíneaFactura. */;
        mostrarMenu();
    }

    public static void mostrarMenu() {
        char opcionSeleccionada;
        boolean salir = false;
    
        do {
            Factura.opcionesASeleccionar();
            opcionSeleccionada = Factura.pideOpcionChar();
    
            switch (opcionSeleccionada) {
                case 'a':
                    Factura facturaUno = new Factura(Factura.pideNumeroIdentificadorCliente(), Factura.pideNumeroCliente());
                    listaDeFacturas.add(facturaUno);
                    System.out.println(listaDeFacturas);
                    break;
                case 'b':
                    String descripcion = Factura.pideDescripcion();
                    Double precioUnitario = Factura.pidePrecioUnitario();
                    int cantidadUnidades = Factura.pideCantidadUnidades();
                    LineaFactura nuevaLineaFactura = new LineaFactura(descripcion, precioUnitario, cantidadUnidades);
                    // Obtén la última factura agregada
                    Factura ultimaFactura = listaDeFacturas.get(listaDeFacturas.size() - 1);
                    // Agrega la nueva línea a la última factura
                    ultimaFactura.agregarItem(nuevaLineaFactura);
                    System.out.println("Línea de factura agregada correctamente.");
                    System.out.println(ultimaFactura);
                    break;
                case 'c':
                    
                    break;
                case 'd':
                    break;
                case '0':
                    salir = true;
                    break;
                default:
                    System.err.println("Introdujo una opción no válida.");
                    break;
            }
        } while (!salir);
    }
    
}
