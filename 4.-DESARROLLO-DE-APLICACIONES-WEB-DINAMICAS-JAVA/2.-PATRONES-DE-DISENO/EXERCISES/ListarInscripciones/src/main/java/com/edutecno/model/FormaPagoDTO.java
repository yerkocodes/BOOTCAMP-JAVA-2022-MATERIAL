package com.edutecno.model;

public class FormaPagoDTO {

	// Atributos
	private String idFormaPago;
	private String descripcion;
	private String recargo;
	
	// Constructor empty
	public FormaPagoDTO() {
		// TODO Auto-generated constructor stub
	}

	//Constructor with params
	public FormaPagoDTO(String idFormaPago, String descripcion, String recargo) {
		super();
		this.idFormaPago = idFormaPago;
		this.descripcion = descripcion;
		this.recargo = recargo;
	}

	//Getters and Setters
	public String getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(String idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getRecargo() {
		return recargo;
	}

	public void setRecargo(String recargo) {
		this.recargo = recargo;
	}

	// ToString
	@Override
	public String toString() {
		return "FormaPagoDTO [idFormaPago=" + idFormaPago + ", descripcion=" + descripcion + ", recargo=" + recargo
				+ "]";
	}
}
