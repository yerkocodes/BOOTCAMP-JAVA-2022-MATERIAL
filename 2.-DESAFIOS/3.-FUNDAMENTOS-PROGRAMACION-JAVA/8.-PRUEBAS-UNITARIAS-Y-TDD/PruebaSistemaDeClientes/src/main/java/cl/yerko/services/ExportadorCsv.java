package cl.yerko.services;

import cl.yerko.model.Cliente;
import cl.yerko.utilities.Utilidad;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorCsv extends Exportador {
    @Override
    public void toExport(String path, List<Cliente> listaClientes) throws IOException {
        File directory = new File(path);
        File file = new File(path + "/clientes.csv");

        if ( directory.exists() ) { //Si el directorio existe
            FileWriter fw = null;
            try {
                file.createNewFile();
                fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                for (Cliente cliente : listaClientes) {
                    bw.write(cliente.getRunCliente() + "," + cliente.getNombreCliente() + "," + cliente.getApellidoCliente() + "," + cliente.getAniosCliente() + "," + cliente.getNombreCategoria());
                    bw.newLine();
                }
                bw.close();
                Utilidad.message("Datos de clientes exportados correctamente en formato .csv");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                fw.close();
            }
        } else { //Si el directorio no existe
            Utilidad.message("No existe un directorio " + path);
            Utilidad.message("La exportacion no se ha realizado.");
        }
    }
}
