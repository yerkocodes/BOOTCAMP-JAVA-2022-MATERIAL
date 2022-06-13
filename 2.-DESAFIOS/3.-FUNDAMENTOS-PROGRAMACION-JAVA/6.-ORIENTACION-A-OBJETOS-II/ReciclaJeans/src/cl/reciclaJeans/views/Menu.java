package cl.reciclaJeans.views;
// Crear una clase Menu que contendrá un menú similar al que vemos a continuación,
// recordar que debemos generar todas las instancias de scanner en esta clase.
/*
    1 Listar Producto
    2 Agregar Producto
    3 Exportar Datos
    4 Salir
    Ingrese una opción:
*/

import cl.reciclaJeans.service.ArchivoServicio;
import cl.reciclaJeans.service.ProductoServicio;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio = new ProductoServicio();
    private ArchivoServicio archivoServicio = new ArchivoServicio();
    private Scanner sc = new Scanner(System.in);
    public void ejecutarMenu() throws IOException {
        // CODE HERE
        String userOption = null;
        do {
            System.out.println();
            System.out.println("+-----------------------------+");
            System.out.println("|  Bienvenido a ReciclaJeans  |");
            System.out.println("+-----------------------------+");
            System.out.println("|   1 Listar Producto         |");
            System.out.println("|   2 Agregar Producto        |");
            System.out.println("|   3 Editar Producto         |");
            System.out.println("|   4 Exportar Datos          |");
            System.out.println("|   5 Importar Datos          |");
            System.out.println("|   6 Salir                   |");
            System.out.println("+-----------------------------+");
            System.out.println();
            System.out.print("Elija una opcion: ");
            userOption = sc.nextLine();

            switch (userOption) {
                case "1":
                    // Code to print list of products.
                    productoServicio.listarProductos();
                    break;
                case "2":
                    // Code to add product to list of products.
                    productoServicio.agregarProducto();
                    break;
                case "3":
                    // Code to edit product.
                    editarProducto();
                    break;
                case "4":
                    // Code to export data.
                    exportarDatos();
                    break;
                case "5":
                    // Code to import data.
                    cargarDatos();
                    break;
                case "6":
                    // Code to exit to the program.
                    System.out.println("+-----------------------------+");
                    System.out.println("|   Hasta pronto!             |");
                    System.out.println("|   Saliendo del programa...  |");
                    System.out.println("+-----------------------------+");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Ha elegido una opcion no valida.");
                    break;
            }
        } while (!userOption.equals("4"));
    }

    private void editarProducto() {
        System.out.println("+-----------------------------+");
        System.out.println("|  1. Editar producto         |");
        System.out.println("|  2. Volver al menu          |");
        System.out.println("+-----------------------------+");
        String userOption = sc.nextLine();
        switch (userOption) {
            case "1":
                System.out.println("Ingrese código del producto a editar:");
                productoServicio.editarProducto(sc.nextLine(), sc);
                break;
            case "2":
                break;
            default:
                editarProducto();
                break;
        }
    }

    private void exportarDatos() throws IOException {
        System.out.println("Ingresa la ruta en donde se exportara el archivo productos.csv: ");
        archivoServicio.exportarDatos(sc.nextLine(), productoServicio.getListaProductos());
    }

    private void cargarDatos() {
        System.out.println("Ingresa la ruta en donde se encuentra el archivo, por ejemplo '/home/desafioLatam/ProductosImportados.csv': ");
        archivoServicio.cargarDatos(sc.nextLine(), productoServicio);
    }
}
