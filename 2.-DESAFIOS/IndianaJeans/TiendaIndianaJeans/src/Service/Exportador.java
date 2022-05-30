package Service;

import Model.Producto;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Exportador {
    public abstract void exportar(String nombreArchivo, ArrayList<Producto> listaProductos) throws IOException;
}
