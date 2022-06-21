package com.edutecno.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GeneraFactura
 * Tiene como responsabilidad recibir los datos de ProcesaFactura y servir de puente hacia factura.jsp
 */
@WebServlet("/generaFactura")
public class GeneraFactura extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Se despacha hacia factura.jsp el request y el response.
		request.getRequestDispatcher("factura.jsp").forward(request, response);
	}

}
