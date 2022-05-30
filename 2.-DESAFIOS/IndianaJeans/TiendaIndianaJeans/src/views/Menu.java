package views;

import Service.ExportadorTxt;
import Service.ProductoServicio;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public void ejecutarMenu() {
        Scanner sc = new Scanner(System.in);
        ProductoServicio productoServicio = new ProductoServicio();
        ExportadorTxt exportadorTxt = new ExportadorTxt();
        String opcion = "";

        do {
            System.out.println("-------------");
            System.out.println("Menu");
            System.out.println("-------------");

            System.out.println("1 Listar Producto");
            System.out.println("2 Agregar Producto");
            System.out.println("3 Exportar Datos");
            System.out.println("4 Salir");
            System.out.println("Ingrese una opción:");
            opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    productoServicio.listarProductos();
                    break;
                case "2":
                    productoServicio.agregarProductos();
                    break;
                case "3":
                    System.out.println("Exportar Datos");
                    System.out.println("Ingrese la opción 1 para exportar:");
                    String exportOption = sc.nextLine();
                    if (exportOption.equals("1")) {
                        System.out.println("Exportar Datos");
                        System.out.println("Ingresa la ruta en donde desea exportar el archivo clientes.txt:");
                        System.out.println("Ejemplo: /home/desafioLatam");
                        String path = sc.nextLine();
                        try {
                            exportadorTxt.exportar(path, productoServicio.getListaProductos());
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case "4":
                    System.out.println("Abandonando el sistema de productos...");
                    System.out.println("Acaba de salir del sistema");
                    break;
                default:
                    System.out.println("La opcion ingresada es incorrecta. Pongase vioh");
                    break;
            }


        } while ( !opcion.equals("4") );
    }
}
