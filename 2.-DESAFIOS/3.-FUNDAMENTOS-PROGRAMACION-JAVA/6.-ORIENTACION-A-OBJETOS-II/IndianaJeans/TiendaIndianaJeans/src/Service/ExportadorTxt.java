package Service;

import Model.Producto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportadorTxt extends Exportador {
    @Override
    public void exportar(String path, ArrayList<Producto> listaProductos) throws IOException {
        File directory = new File(path);
        File file = new File(path + "/clientes.txt");

        if ( directory.exists() ) { //Si el directorio existe
            FileWriter fw = null;
            try {
                file.createNewFile();
                fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Producto producto : listaProductos) {
                    bw.write(String.valueOf(producto));
                    bw.newLine();
                }
                bw.close();
                System.out.println("Datos de clientes exportados correctamente en formato .txt");
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
