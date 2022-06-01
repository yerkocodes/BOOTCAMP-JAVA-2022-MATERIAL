package cl.reciclaJeans.service;
// Generar una clase cl.reciclaJeans.service.ProductoServicio que contendrá una ArrayList llamada
// listaProductos, con su respectivo getters y setters. Además, esta clase debe contar
// con el siguiente método y su respectiva aplicación:
//     ● listarProductos.

import cl.reciclaJeans.model.Producto;

import java.util.ArrayList;

public class ProductoServicio {
    ArrayList<Producto> listaProductos = new ArrayList<>();

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listarProductos(){
        // CODE HERE
    }
}
