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

import cl.reciclaJeans.service.ProductoServicio;

import java.util.Scanner;

public class Menu {
    public void ejecutarMenu() {
        // CODE HERE
        ProductoServicio productoServicio = new ProductoServicio();
        Scanner sc = new Scanner(System.in);
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
                    break;
                case "4":
                    // Code to export data.
                    break;
                case "5":
                    // Code to import data.
                    break;
                case "6":
                    // Code to exit to the program.
                    System.out.println("+-----------------------------+");
                    System.out.println("|   Hasta pronto!             |");
                    System.out.println("|   Saliendo del programa...  |");
                    System.out.println("+-----------------------------+");
                    break;
                default:
                    System.out.println("Ha elegido una opcion no valida.");
                    break;
            }
        } while (!userOption.equals("4"));
    }
}
