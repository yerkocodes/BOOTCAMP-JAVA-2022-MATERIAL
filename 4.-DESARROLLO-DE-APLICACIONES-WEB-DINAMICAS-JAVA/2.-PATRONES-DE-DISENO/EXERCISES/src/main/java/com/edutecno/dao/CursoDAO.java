package com.edutecno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutecno.model.CursoDTO;

// DATA ACCESS OBJECT, objeto que contiene los metodos para acceder mediante la conexion a la base de datos.
public class CursoDAO {
	
	//List<CursoDTO> findAll()
	//CursoDTO findById(int id)
	//CursoDTO add(CursoDTO cursoDTO) / boolean save(CursoDTO cursoDTO)
	//CursoDTO update(CursoDTO cursoDTO) / boolean update(CursoDTO cursoDTO)
	//boolean delete(int id) / int delete(CursoDTO cursoDTO)

	// Metodo para obtener todos los cursos existentes en la base de datos
	public List<CursoDTO> obtieneCursos() throws ClassNotFoundException, SQLException {

		// lista para almacenar los cursos obtenidos de la consulta
		List<CursoDTO> listaCursos = new ArrayList<CursoDTO>();
		
		Connection conn = null;

		//clase del driver de conexion
		Class.forName("com.mysql.cj.jdbc.Driver");

		//"jdbc:mysql://localhost/DATABASENAME?user=USERNAME&password=MYPASSWORD"
		conn = DriverManager.getConnection("jdbc:mysql://localhost/edutecno?user=root&password=mypass");
		
		try {
			PreparedStatement pstm = conn.prepareStatement("SELECT * FROM curso");
			ResultSet rs = pstm.executeQuery(); // Se utiliza para los select
			
			while(rs.next()) { // Si ResultSet contiene elementos se crean los objetos CursoDTO
				CursoDTO curso = new CursoDTO(); // Objeto para setear los valores obtenidos de la base de datos
				curso.setIdCurso(rs.getInt("id_curso"));
				curso.setDescripcion(rs.getString("descripcion"));
				curso.setPrecio(rs.getInt("precio"));
				
				listaCursos.add(curso); // se anade el curso a la lista existente
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		

		return listaCursos;
	}

}
