package cl.reciclaJeans.service;

import cl.reciclaJeans.model.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductoServicio {
    // Generar una clase ProductoServicio que contendrá una ArrayList llamada listaProductos, con su respectivo getters y setters. Además, esta clase debe contar con el siguiente método y su respectiva aplicación:
    //     ● listarProductos.
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

    public void listarProductos(){
        // CODE HERE
        if ( this.getListaProductos().size() != 0 ) {
            System.out.println("Productos disponibles: ");
            for (Producto producto : listaProductos) {
                System.out.println("Datos del producto: ");
                System.out.println("Nombre del articulo: " + producto.getArticulo());
                System.out.println("Codigo: " + producto.getCodigo());
                System.out.println("Marca: " + producto.getMarca());
                System.out.println("Color: " + producto.getColor());
                System.out.println("Descripcion: " + producto.getDescripcion());
                System.out.println("Precio: " + producto.getPrecio());
                System.out.println("Talla: " + producto.getTalla());
                System.out.println("-------------------------------------------------");
                //System.out.println(producto.toString());
            }
        } else {
            System.out.println("+-----------------------------+");
            System.out.println("|           No hay            |");
            System.out.println("|   productos disponibles.    |");
            System.out.println("+-----------------------------+");
        }
    }

    public void agregarProducto() {
        // Code here
        //Producto(String articulo, String precio, String descripcion, String codigo, String talla, String marca, String color)
        Scanner sc = new Scanner(System.in);
        String articulo, precio, descripcion, codigo, talla, marca, color;

        System.out.println("+-----------------------------+");
        System.out.println("|       Agregar Producto      |");
        System.out.println("+-----------------------------+");
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
        System.out.println("+-----------------------------------+");
        System.out.println("|   Producto registrado con exito!  |");
        System.out.println("+-----------------------------------+");
    }

    public void editarProducto(String productCode, Scanner scanner) {
        for ( Producto producto : getListaProductos() ) {
            if ( producto.getCodigo().contains(productCode) ) {
                System.out.println("1.-El nombre del articulo actual es: " + producto.getArticulo());
                System.out.println("2.-El código del producto: " + producto.getCodigo());
                System.out.println("3.-El color del producto: " + producto.getColor());
                System.out.println("4.-La descripción del producto: " + producto.getDescripcion());
                System.out.println("5.-La marca del producto: " + producto.getMarca());
                System.out.println("6.-El precio del producto: " + producto.getPrecio());
                System.out.println("7.-La talla del producto: " + producto.getTalla());

                System.out.println("Ingrese la opción a editar de los datos del producto:");
                switch ( scanner.nextLine() ) {
                    case "1":
                        System.out.println("Ingrese el nuevo nombre del articulo: ");
                        producto.setArticulo(scanner.nextLine());
                        break;
                    case "2":
                        System.out.println("Ingrese el nuevo codigo del articulo: ");
                        producto.setCodigo(scanner.nextLine());
                        break;
                    case "3":
                        System.out.println("Ingrese el nuevo color del articulo: ");
                        producto.setColor(scanner.nextLine());
                        break;
                    case "4":
                        System.out.println("Ingrese la nueva descripcion del articulo: ");
                        producto.setDescripcion(scanner.nextLine());
                        break;
                    case "5":
                        System.out.println("Ingrese la nueva marca del articulo: ");
                        producto.setMarca(scanner.nextLine());
                        break;
                    case "6":
                        System.out.println("Ingrese el nuevo precio del articulo: ");
                        producto.setPrecio(scanner.nextLine());
                        break;
                    case "7":
                        System.out.println("Ingrese la nueva talla del articulo: ");
                        producto.setTalla(scanner.nextLine());
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        editarProducto(productCode, scanner);
                        break;
                }
            } else {
                System.out.println("El producto no se encuentra en nuestros registros.");
            }
        }
    }
}
