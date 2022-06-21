package cl.yerko.services;

import cl.yerko.model.CategoriaEnum;
import cl.yerko.model.Cliente;
import cl.yerko.utilities.Utilidad;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArchivoServicio {

    //Metodos
    public static void cargarDatos(String path, ClienteService clienteService) {
        ArrayList<Cliente> listaCliente = new ArrayList<>();

        try {
            File archivo = new File(path);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();

            while(linea != null) {
                ArrayList<String> listaTemporal = new ArrayList<>(Arrays.asList(linea.split(",")));

                Cliente cliente = new Cliente();
                cliente.setRunCliente(listaTemporal.get(0));
                cliente.setNombreCliente(listaTemporal.get(1));
                cliente.setApellidoCliente(listaTemporal.get(2));
                cliente.setAniosCliente(listaTemporal.get(3));
                cliente.setNombreCategoria(CategoriaEnum.valueOf(listaTemporal.get(4)));

                listaCliente.add(cliente);
                linea = bufferedReader.readLine();
            }
            bufferedReader.close();
            fileReader.close();

            if (listaCliente != null) {
                clienteService.getListaClientes().addAll(listaCliente);
                Utilidad.message("Datos cargados correctamente!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
