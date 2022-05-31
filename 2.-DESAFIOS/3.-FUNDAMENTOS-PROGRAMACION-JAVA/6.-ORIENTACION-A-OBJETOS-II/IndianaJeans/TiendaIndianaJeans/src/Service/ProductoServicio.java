package Service;

import Model.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {
    private ArrayList<Producto> listaProductos;

    public ProductoServicio() {
        listaProductos = new ArrayList<>();
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listarProductos() {
        if ( this.getListaProductos().size() != 0 ) {
            System.out.println("------------- Productos disponibles -------------");
            for (Producto producto : listaProductos) {
                System.out.println(producto);
            }
            System.out.println("-------------------------------------------------");
        } else {
            System.out.println("Lista vacia.");
        }
    }

    public void agregarProductos() {
        //Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color)
        Scanner sc = new Scanner(System.in);
        String articulo, precio, descripcion, codigo, talla, marca, color;

        System.out.println("Crear Producto");
        System.out.println("Ingresar nombre articulo: ");
        articulo = sc.nextLine();

        System.out.println("Ingresa precio:");
        precio = sc.nextLine();

        System.out.println("Ingresa descripción:");
        descripcion = sc.nextLine();

        System.out.println("Ingresa código:");
        codigo = sc.nextLine();

        System.out.println("Ingresa talla:");
        talla = sc.nextLine();

        System.out.println("Ingresa marca:");
        marca = sc.nextLine();

        System.out.println("Ingresa color:");
        color = sc.nextLine();

        listaProductos.add(new Producto(articulo, precio, descripcion, codigo, talla, marca, color));
        System.out.println("Producto registrado con exito!");
    }
}
