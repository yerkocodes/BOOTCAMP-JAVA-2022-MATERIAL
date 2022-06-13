package cl.reciclaJeans.service;
// Generar una clase ArchivoServicio para hacer la carga de datos externos. Crear el
// método cargarDatos() y generar aquellos códigos que nos ayuden a importar la lista
// de productos desde un archivo “ProductosImportados.csv”.

import cl.reciclaJeans.model.Producto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ArchivoServicio {
    public void cargarDatos() {
        // CODE HERE TO IMPORT PRODUCT LIST FROM CSV FILE.
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
