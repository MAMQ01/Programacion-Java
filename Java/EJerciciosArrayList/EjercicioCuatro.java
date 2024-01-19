package EJerciciosArrayList;

import java.util.ArrayList;

public class EjercicioCuatro {
    public static void main(String[] args) {

        ArrayList<Factura> arrayFacturas = new ArrayList<>();
        ArrayList<ItemFactura> arrayListItems = new ArrayList<>();

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
        LíneaFactura. */
        
        mostrarMenu(arrayFacturas, arrayListItems);
    }

    public static void mostrarMenu(ArrayList<Factura> arrayFacturas, ArrayList<ItemFactura> arrayListItems){
        char opcionSeleccionada = 'f';
        do {
            Factura.opcionesASeleccionar();
            opcionSeleccionada = Factura.pideOpcionChar();
            switch (opcionSeleccionada) {
                case 'a':
                    System.out.println("Realizando el Alta Factura");
                    Factura nuevaFactura = new Factura(Factura.pideNumeroIdentificadorCliente(), Factura.pideNumeroCliente());
                    arrayFacturas.add(nuevaFactura);
                    Factura.mostrarListaFacturas(arrayFacturas);
                    System.out.println("-----------------------");
                    ItemFactura creandoItem = new ItemFactura(Factura.pideDescripcion(), Factura.pidePrecioUnitario(), Factura.pideCantidadUnidades());
                    nuevaFactura.agregarItem(creandoItem);
                    break;
                case 'b':
                    System.out.println("Añadiendo un item a la factura");
                    ItemFactura item = new ItemFactura(Factura.pideDescripcion(), Factura.pidePrecioUnitario(), Factura.pideCantidadUnidades());
                    arrayListItems.add(item);
                    break;
                case 'c':
                    System.out.println("Mostrando array List de las Facturas");
                    Factura.mostrarListaFacturas(arrayFacturas);
                    System.out.println("Mostrando arrayList Items");
                    Factura.mostrarItemsFactura(arrayListItems);
                    break;
                case 'd':
                    System.out.println("Eliminando Linea/Item por posicion");
                    Factura.eliminarPorPosicionItem(arrayListItems, Factura.pidePosicionAEliminar());
                    System.out.println("Mostrando arrayListItems DESPUES DE ELIMINAR-------------");
                    Factura.mostrarItemsFactura(arrayListItems);
                    break;
                case '0':
                    System.exit(0);
                    break;
                default:
                    System.err.println("Introdujo una opción no válida.");
                    break;
            }
        } while (opcionSeleccionada != '0');
    }
}
