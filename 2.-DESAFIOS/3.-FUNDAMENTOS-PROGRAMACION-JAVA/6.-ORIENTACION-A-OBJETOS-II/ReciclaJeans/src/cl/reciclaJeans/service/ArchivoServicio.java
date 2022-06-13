package cl.reciclaJeans.service;
// Generar una clase ArchivoServicio para hacer la carga de datos externos. Crear el
// método cargarDatos() y generar aquellos códigos que nos ayuden a importar la lista
// de productos desde un archivo “ProductosImportados.csv”.

import cl.reciclaJeans.model.Producto;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArchivoServicio {
    public void cargarDatos(String path, ProductoServicio productoServicio) {
        // CODE HERE TO IMPORT PRODUCT LIST FROM CSV FILE.
        ArrayList<Producto> productList = new ArrayList<>();

        try {
            File archivo = new File(path);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();

            while(linea != null) {
                ArrayList<String> listaTemporal = new ArrayList<>(Arrays.asList(linea.split(",")));

                Producto producto = new Producto();
                producto.setArticulo(listaTemporal.get(0));
                producto.setPrecio(listaTemporal.get(1));
                producto.setDescripcion(listaTemporal.get(2));
                producto.setCodigo(listaTemporal.get(3));
                producto.setTalla(listaTemporal.get(4));
                producto.setMarca(listaTemporal.get(5));
                producto.setColor(listaTemporal.get(6));

                productList.add(producto);
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();

            if (productList != null) {
                productoServicio.getListaProductos().addAll(productList);
                System.out.println("Datos cargados correctamente!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void exportarDatos(String path, List<Producto> listOfProducts) throws IOException {
        File directory = new File(path);
        File file = new File(path + "/productos.csv");

        if ( directory.exists() ) { //Si el directorio existe
            FileWriter fw = null;
            try {
                file.createNewFile();
                fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Producto product : listOfProducts) {
                    bw.write(String.valueOf(product));
                    bw.newLine();
                }
                bw.close();
                System.out.println("Datos de los productos exportados correctamente en formato .csv");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fw.close();
            }
        } else { //Si el directorio no existe
            System.out.println("No existe un directorio " + path);
            System.out.println("La exportacion no se ha realizado.");
        }
    }
}
