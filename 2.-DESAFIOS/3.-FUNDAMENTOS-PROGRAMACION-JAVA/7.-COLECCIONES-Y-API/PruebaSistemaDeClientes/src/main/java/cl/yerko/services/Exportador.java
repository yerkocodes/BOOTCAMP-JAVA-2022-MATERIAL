package cl.yerko.services;

import cl.yerko.model.Cliente;

import java.io.IOException;
import java.util.List;

public abstract class Exportador {
    //Metodo abstracto
    public abstract void toExport(String fileName, List<Cliente> listaClientes) throws IOException;
}
