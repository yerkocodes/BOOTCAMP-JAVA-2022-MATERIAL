package org.example;

import org.example.model.Persona;
import org.example.services.ServicioPersona;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

public class ServicioPersonaTestMock {
    // Instancia falsa del sercicio a ejecutar para hacer llamada de los metodos y realizar la emulacion
    private ServicioPersona servicioPersona = mock(ServicioPersona.class);
    private Logger logger = Logger.getLogger("org.example");

    @Test
    @DisplayName("Test crearPersona method")
    public void crearPersona() {
        logger.info("Iniciando metodo de prueba crearPersona()");
        Persona persona = new Persona("27-0", "Fulanito");
        when(servicioPersona.crearPersona(persona)).thenReturn(true); // Cuando se ejecute mediante la instancia falsa mock el servicio, se puede setear el retorno.
        Boolean response = servicioPersona.crearPersona(persona);
        assertTrue(response); // Haciendo validacion del retorno.
        verify(servicioPersona).crearPersona(persona); // Verificando que el servicio ejecuto el metodo.
    }

    @Test
    public void actualizarPersona() {
        logger.info("Iniciando metodo de prueba actualizarPersona");
        Persona persona = new Persona("27-0", "Fulanito");
        when(servicioPersona.actualizarPersona(persona)).thenReturn(true);
        Boolean response = servicioPersona.actualizarPersona(persona);
        assertTrue(response);
        verify(servicioPersona).actualizarPersona(persona);
    }

    @Test
    public void eliminarPersona() {
        logger.info("Iniciando metodo de prueba eliminarPersona");
        Persona persona = new Persona("27-0", "Fulanito");
        when(servicioPersona.eliminarPersona(persona)).thenReturn(true);
        assertTrue(servicioPersona.eliminarPersona(persona));
        verify(servicioPersona).eliminarPersona(persona);
    }

    @Test
    public void listarPersonas() {
        logger.info("Iniciando metodo de prueba listarPersonas");
        Map<String, String> baseDatos = new LinkedHashMap<>();
        when(servicioPersona.listarPersonas()).thenReturn(baseDatos);
        assertNotNull(servicioPersona.listarPersonas());
        verify(servicioPersona).listarPersonas();
    }
}
