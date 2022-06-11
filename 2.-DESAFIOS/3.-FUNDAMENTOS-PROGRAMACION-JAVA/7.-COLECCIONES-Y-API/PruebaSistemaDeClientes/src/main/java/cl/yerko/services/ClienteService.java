package cl.yerko.services;

import cl.yerko.model.Cliente;
import cl.yerko.utilities.Utilidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static cl.yerko.model.CategoriaEnum.ACTIVO;
import static cl.yerko.model.CategoriaEnum.INACTIVO;

public class ClienteService {
    private List<Cliente> listaClientes;
    private Scanner sc = new Scanner(System.in);

    //Constructores
    public ClienteService() {
        listaClientes = new ArrayList<>();
    }

    //Getter y Setters
    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    //metodos
    public void retornoListarClientes() {
        //CODE HERE
        if ( !listaClientes.isEmpty() && listaClientes != null) {
            for ( Cliente cliente : listaClientes ) {
                Utilidad.message(String.valueOf(cliente));
            }
        } else {
            Utilidad.message("La lista se encuentra vacia.");
        }
    }

    public void agregarCliente(Cliente cliente) {
        //CODE HERE
        if ( cliente.getRunCliente() != null && listaClientes != null) {
            listaClientes.add(cliente);
            Utilidad.message("Cliente agregado con exito!");
        } else {
            Utilidad.message("ERROR: Cliente no fue agregado");
        }
    }

    public void editarCliente(String run) {
        //CODE HERE
        if (listaClientes != null) {
            for (Cliente cliente : listaClientes) {
                if (cliente.getRunCliente().equals(run)) {
                    Utilidad.message("Seleccione qué desea hacer:");
                    Utilidad.message("1.-Cambiar el estado del Cliente");
                    Utilidad.message("2.-Editar los datos ingresados del Cliente");
                    Utilidad.message("Ingrese opcion: ");
                    String option = sc.nextLine();

                    switch (option) {
                        case "1":
                            editarEstadoCliente(cliente);
                            break;
                        case "2":
                            editarDatosCliente(cliente);
                            break;
                        default:
                            Utilidad.message("Opcion incorrecta");
                            break;
                    }
                }
            }
        }
    }

    public void editarDatosCliente(Cliente cliente) {
        Utilidad.message("----Actualizando datos del Cliente-----");
        Utilidad.message("1.-El RUN del Cliente es: " + cliente.getRunCliente());
        Utilidad.message("2.-El Nombre del Cliente es: " + cliente.getNombreCliente());
        Utilidad.message("3.-El Apellido del Cliente es: " + cliente.getApellidoCliente());
        Utilidad.message("4.-Los años como Cliente son: " + cliente.getAniosCliente());
        Utilidad.message("5.-Regresar al menu");
        Utilidad.message();
        Utilidad.message("Ingrese opcion a editar de los datos del cliente: ");
        String userOption = Utilidad.validateArgumentNotNull(sc);

        switch (userOption) {
            case "1":
                Utilidad.message("Ingrese el nuevo RUN del cliente: ");
                cliente.setRunCliente(Utilidad.validateArgumentNotNull(sc));
                Utilidad.message("Datos cambiados con éxito");
                break;
            case "2":
                Utilidad.message("Ingrese el nuevo nombre del cliente:");
                cliente.setNombreCliente(Utilidad.validateArgumentNotNull(sc));
                Utilidad.message("Datos cambiados con éxito");
                break;
            case "3":
                Utilidad.message("Ingrese el nuevo apellido del cliente:");
                cliente.setApellidoCliente(Utilidad.validateArgumentNotNull(sc));
                Utilidad.message("Datos cambiados con éxito");
                break;
            case "4":
                Utilidad.message("Ingrese la nueva edad del cliente:");
                cliente.setAniosCliente(Utilidad.validateArgumentNotNull(sc));
                Utilidad.message("Datos cambiados con éxito");
                break;
            case "5":
                Utilidad.message("Regresando al menu principal");
                break;
            default:
                Utilidad.message("Opcion incorrecta");
                editarDatosCliente(cliente);
                break;
        }
    }

    public void editarEstadoCliente(Cliente cliente) {
        Utilidad.message("-----Actualizando estado del Cliente----");
        Utilidad.message("El estado actual es: " + cliente.getNombreCategoria().toString());
        Utilidad.message("1.-Si desea cambiar el estado del Cliente a Inactivo");
        Utilidad.message("2.-Si desea mantener el estado del cliente Activo");
        Utilidad.message("Ingrese opcion: ");
        String option = sc.nextLine();

        switch (option) {
            case "1":
                cliente.setNombreCategoria(INACTIVO);
                break;
            case "2":
                cliente.setNombreCategoria(ACTIVO);
                break;
            default:
                Utilidad.message("ERROR: Opcion invalida.");
                editarEstadoCliente(cliente);
                break;
        }
    }
}
