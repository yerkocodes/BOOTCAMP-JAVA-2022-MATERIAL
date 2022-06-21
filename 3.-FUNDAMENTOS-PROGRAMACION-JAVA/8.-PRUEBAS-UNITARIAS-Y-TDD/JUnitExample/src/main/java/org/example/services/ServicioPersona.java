package org.example.services;

import org.example.model.Persona;

import java.util.LinkedHashMap;
import java.util.Map;

public class ServicioPersona {

    // Map para emular una base de datos, como clave el rut y como valor el nombre
    Map<String, String> baseDatos = new LinkedHashMap<>();

    //Metodo para el servicio para crear persona
    public Boolean crearPersona(Persona persona) {
        if (persona.getRut() != null && persona.getNombre() != null) {
            baseDatos.put(persona.getRut(), persona.getNombre());
            return true;
        } else {
            return false;
        }
    };

    public Boolean actualizarPersona(Persona persona) {
        if ( persona.getRut() != null && persona.getNombre() != null && baseDatos.containsKey(persona.getRut()) ) {
            baseDatos.replace(persona.getRut(), persona.getNombre());
            return true;
        } else {
            return false;
        }

    }

    public Boolean eliminarPersona(Persona persona) {
            return baseDatos.remove(persona.getRut(), persona.getNombre());
    }

    public Map<String, String> listarPersonas () {
        return baseDatos;
    }
}
