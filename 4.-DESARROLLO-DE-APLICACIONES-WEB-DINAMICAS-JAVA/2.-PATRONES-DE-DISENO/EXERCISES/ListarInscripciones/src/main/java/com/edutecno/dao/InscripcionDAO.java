package com.edutecno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.edutecno.model.InscripcionDTO;

// Tendra la responsabilidad de obtener todas las inscripciones, los registros existentes
// Responsabilidad de insertar las inscripciones
public class InscripcionDAO {

	// Metodo para inbsertar una inscripcion en la base de datos
	public InscripcionDTO insertarInscripciones(InscripcionDTO inscripcionDTO) throws ClassNotFoundException, SQLException {
		
		int maxId = 0;

		Connection conn = null;

		// clase del driver de conexion
		Class.forName("com.mysql.cj.jdbc.Driver");

		// "jdbc:mysql://localhost/DATABASENAME?user=USERNAME&password=MYPASSWORD"
		conn = DriverManager.getConnection("jdbc:mysql://localhost/edutecno?user=root&password=mypass");

		String consultaProximoId = "SELECT MAX(id_inscripcion) FROM inscripcion";

		try {
//			"INSERT INTO inscripcion (nombre, telefono, id_curso, id_forma_pago) VALUES (?, ?, ?, ?)"
			PreparedStatement pstm = conn.prepareStatement(
					"INSERT INTO inscripcion (nombre, telefono, id_curso, id_forma_pago) VALUES (?, ?, ?, ?)");
			// Seteo de valores para los signos de interrogacion en el mismo orden de la
			// query
			pstm.setString(1, inscripcionDTO.getNombre());
			pstm.setString(2, inscripcionDTO.getTelefono());
			pstm.setInt(3, inscripcionDTO.getIdCurso());
			pstm.setInt(4, inscripcionDTO.getIdFormaPago());
			
			
			if (pstm.executeUpdate() == 1) { // Si executeUpdate retorna 1, la query se ejecuto, si retorna 0 no se ejecuta
				PreparedStatement pstm2 = conn.prepareStatement(consultaProximoId);
				ResultSet rs = pstm2.executeQuery();
				if (rs.next()) {
					maxId = rs.getInt(1);
					inscripcionDTO.setIdInscripcion(maxId);
				}
			} else {
				throw new RuntimeException("Ha ocurrido un error insertando la inscripcion");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}
		
		return inscripcionDTO;

	}

}
