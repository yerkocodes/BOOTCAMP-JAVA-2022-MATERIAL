package org.example;

import org.example.model.Persona;
import org.example.services.ServicioPersona;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class ServicioPersonaTest {

    private ServicioPersona servicioPersona = new ServicioPersona(); // Instacia para invocar a los metodos del servicio
    private Logger logger = Logger.getLogger("org.example"); // Logger para dar informacion en el momento de la ejecucion

    //Metodos de pruebas unitarias
    @Test // Anotacion para indicar que es un metodo de prueba, de lo contrario no se ejecuta
    @DisplayName("Test crear persona")
    public void crearPersona() {
        logger.info("Iniciando metodo de prueba crearPersona en ServicioPersonaTest");
        Persona persona = new Persona("27-0", "Fulanito");
        Boolean respuesta = servicioPersona.crearPersona(persona); //Invocando al metodo que se quiere probar y realizar test
        assertEquals(true, respuesta);
        assertTrue(respuesta);
    }

    @Test
    @DisplayName("Test metodo acutalizarPersona()")
    public void actualizarPersona() {
        logger.info("iniciando el metodo de prueba actualizarPersona en la clase ServicioPersonaTest()");
        Persona persona = new Persona("27-0", "Fulanito");
        servicioPersona.crearPersona(persona); // Creando la persona para que exista y poder realizar la actualizacion
        Boolean respuesta = servicioPersona.actualizarPersona(persona); // Se actualiza la persona luego de creada
        assertTrue(respuesta); // Se verifica la respuesta del servicio actualizarPersona()
    }

    @Test
    public void eliminarPersona() {
        logger.info("Iniciando metodo de prueba eliminarPersona en la case ServicioPersonaTest");
        Persona persona = new Persona("27-0", "Fulanito");
        servicioPersona.crearPersona(persona);
        Boolean respuesta = servicioPersona.eliminarPersona(persona);
        assertTrue(respuesta);
    }

//    public void listarPersonas() {
//        logger.info("Iniciando metodo de prueba eliminarPersona");
//        Map<String, String> respuesta = servicioPersona.listarPersonas();
//        assertNotNull(respuesta);
//
//        Persona persona = new Persona("27-0", "Fulanito");
//        servicioPersona.crearPersona(persona);
//    }
@Test
@DisplayName("Test metodo listarPersonas()")
public void listarPersonas() {
    logger.info("Iniciando metodo de prueba eliminarPersona en la clase ServicioPersonaTest");
    Map<String, String> respuesta = servicioPersona.listarPersonas();
    assertNotNull(respuesta); //verificando que la respuesta no sea null
    Persona persona = new Persona("27-0","Fulanito");
    servicioPersona.crearPersona(persona);
    assertEquals(1,respuesta.size()); //assertEquals(esperado,actual);
    assertNotEquals(0, respuesta.size());
}
}
