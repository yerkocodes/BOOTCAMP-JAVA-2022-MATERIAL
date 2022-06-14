package cl.yerko.views;

import cl.yerko.model.CategoriaEnum;
import cl.yerko.model.Cliente;
import cl.yerko.services.ArchivoServicio;
import cl.yerko.services.ClienteService;
import cl.yerko.services.ExportadorCsv;
import cl.yerko.services.ExportadorTxt;
import cl.yerko.utilities.Utilidad;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    //Atributos
    private ClienteService clienteService = new ClienteService();
    private ArchivoServicio archivoServicio = new ArchivoServicio();
    private ExportadorCsv exportadorCsv = new ExportadorCsv();
    private ExportadorTxt exportadorTxt = new ExportadorTxt();
    private String fileName = "Clientes";
    private String fileName1 = "DBClientes.csv";
    private Scanner sc = new Scanner(System.in);

    //Metodos
    public void iniciarMenu() throws IOException {
        String userOption;

        do {
            Utilidad.message("-------------------------");
            Utilidad.message("Menu principal");
            Utilidad.message("-------------------------");
            Utilidad.message("1. Listar Clientes");
            Utilidad.message("2. Agregar Cliente");
            Utilidad.message("3. Editar Cliente");
            Utilidad.message("4. Cargar Datos");
            Utilidad.message("5. Exportar datos");
            Utilidad.message("6. Salir");

            Utilidad.message("Ingrese una opcion");
            Utilidad.message("-------------------------");
            userOption = sc.nextLine();

            switch (userOption) {
                case "1": // Listar Clientes
                    //code here
//                    Runtime.getRuntime().exec("clear");
                    Utilidad.limpiarPantalla();
                    listarCliente();
                    break;
                case "2": // Agregar Cliente
                    agregarClientes();
                    //code here
                    break;
                case "3": // Editar cliente
                    //code here
                    editarCliente();
                    break;
                case "4": // Cargar datos
                    //code here
                    cargarDatos();
                    break;
                case "5": // Exportar datos
                    //code here
                    exportarDatos();
                    break;
                case "6": // Terminar programa
                    //code here
                    terminarPrograma();
                    break;
            }

        } while( !userOption.equals("6") );
    }

    public void listarCliente() {
        //CODE HERE
        Utilidad.message("Menu listar clientes: ");
        clienteService.retornoListarClientes();
    }

    public void agregarClientes() {
        //CODE HERE
        Cliente cliente = new Cliente();
        Utilidad.message("-------------Crear Cliente-------------");
        Utilidad.message("Ingresa RUN del Cliente: ");
        cliente.setRunCliente(Utilidad.validateArgumentNotNull(sc));
        Utilidad.message();

        Utilidad.message("Ingresa Nombre del Cliente: ");
        cliente.setNombreCliente(Utilidad.validateArgumentNotNull(sc));
        Utilidad.message();

        Utilidad.message("Ingresa Apellido del Cliente: ");
        cliente.setApellidoCliente(Utilidad.validateArgumentNotNull(sc));
        Utilidad.message();

        Utilidad.message("Ingresa años del Cliente: ");
        cliente.setAniosCliente(Utilidad.validateArgumentNotNull(sc));
        Utilidad.message();

        cliente.setNombreCategoria(CategoriaEnum.ACTIVO);

        clienteService.agregarCliente(cliente);
    }

    public void editarCliente() {
        //CODE HERE
        Utilidad.message("-------------Editar Cliente-------------");
        Utilidad.message("Ingrese el run del cliente");
        clienteService.editarCliente(Utilidad.validateArgumentNotNull(sc));
    }

    public void cargarDatos() {
        //CODE HERE
        Utilidad.message("---------Cargar Datos en Linux o Mac-----------");
        Utilidad.message("Ingresa la ruta en donde se encuentra el archivo DBClientes.csv:");
        ArchivoServicio.cargarDatos(Utilidad.validateArgumentNotNull(sc), clienteService);
    }

    public void exportarDatos() throws IOException {
        //CODE HERE
        Utilidad.message("---------Exportar Datos-----------");
        Utilidad.message("Seleccione el formato a exportar: ");
        Utilidad.message("1.-Formato csv");
        Utilidad.message("2.-Formato txt");
        Utilidad.message("3.-Salir");
        Utilidad.message();
        Utilidad.message("Ingrese una opción para exportar: ");
        String userOption = sc.nextLine();

        switch (userOption) {
            case "1":
                Utilidad.message("Ingresa la ruta en donde desea exportar el archivo clientes.csv:");
                exportadorCsv.toExport(Utilidad.validateArgumentNotNull(sc), clienteService.getListaClientes());
                break;
            case "2":
                Utilidad.message("Ingresa la ruta en donde desea exportar el archivo clientes.txt:");
                exportadorTxt.toExport(Utilidad.validateArgumentNotNull(sc), clienteService.getListaClientes());
                break;
            case "3":
                break;
            default:
                exportarDatos();
                break;
        }
    }

    public void terminarPrograma() {
        //CODE HERE
        Utilidad.message("Adios!");
        System.exit(0);
    }

}
