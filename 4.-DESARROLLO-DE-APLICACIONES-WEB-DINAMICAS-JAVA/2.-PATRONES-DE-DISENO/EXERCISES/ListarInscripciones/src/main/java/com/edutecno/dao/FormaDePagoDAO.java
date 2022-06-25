package com.edutecno.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edutecno.model.FormaPagoDTO;

// Tiene la responsabilidad de acceder a la base de datos y consultar por las formas de pago
public class FormaDePagoDAO {
	
	// Metodo para consultar todas las formas de pago, los registros existentes en la base de datos
	public List<FormaPagoDTO> obtieneFormasDePago() throws SQLException, ClassNotFoundException {
		// lista para agregar las formas de pago existentes
		List<FormaPagoDTO> listaFormaPago = new ArrayList<FormaPagoDTO>();
		
		
		Connection conn = null;

		//clase del driver de conexion
		Class.forName("com.mysql.cj.jdbc.Driver");

		//"jdbc:mysql://localhost/DATABASENAME?user=USERNAME&password=MYPASSWORD"
		conn = DriverManager.getConnection("jdbc:mysql://localhost/edutecno?user=root&password=mypass");
		
		try {
			// Preparar la query con el PreparedStatement y la conexion
			PreparedStatement pstm = conn.prepareStatement("SELECT * FROM forma_pago");
			ResultSet rs = pstm.executeQuery(); //executeQuery SELECT y retorna un ResultSet
			
			while(rs.next()) { //Mientras el rs siga teniendo valores, que son los registros en cada fila
				// Se instancia el objeto a construir mediante el ResultSet
				FormaPagoDTO formaDePago = new FormaPagoDTO();
				formaDePago.setIdFormaPago(rs.getString("id_forma_pago")); // Entre comillas va el nombre de la columna en la base de datos
				formaDePago.setDescripcion(rs.getString("descripcion"));
				formaDePago.setRecargo(rs.getString("recargo"));

				listaFormaPago.add(formaDePago);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			conn.close();
		}

		return listaFormaPago;
	}

}
