package cl.yerko.services;

import cl.yerko.model.Cliente;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ClienteServicioTest {

    private ClienteService clienteService = mock(ClienteService.class);
    private Logger logger = Logger.getLogger("cl.yerko.services");

    //Método agrearClienteTest para verificar el funcionamiento de agregarCliente (se debe agregar un cliente para que el test corra de manera correcta)
    @Test
    @DisplayName("Test agregarCliente()")
    public void agregarClienteTest() {
        logger.info("Iniciando metodo de prueba agregarCliente()");
        Cliente cliente = new Cliente("12-0", "Yerko", "Cortes", "24");
        when(clienteService.agregarCliente(cliente)).thenReturn(true);
        Boolean response = clienteService.agregarCliente(cliente);
        assertTrue(response);
        verify(clienteService).agregarCliente(cliente);
    }

    //Método agrearClienteNullTest para verificar el funcionamiento de agregarCliente en caso que vengan casos nulos (se debe agregar un cliente nulo para que el test corra de manera correcta).
    @Test
    @DisplayName("Test agregar cliente con parametros nulos")
    public void agregarClienteNullTest() {
        logger.info("Iniciando metodo de prueba agregarCliente() con valores null");
        Cliente cliente = new Cliente(null, null, null, null);
        when(clienteService.agregarCliente(cliente)).thenReturn(false);
        Boolean response = clienteService.agregarCliente(cliente);
        assertFalse(response);
        verify(clienteService).agregarCliente(cliente);
    }
}
