package com.edutecno.model;

public class InscripcionDTO {
	
	//Atributos
	private int idInscripcion;
	private String nombre;
	private String telefono;
	private int idCurso;
	private int idFormaPago;
	
	//Constructor empty
	public InscripcionDTO() {
		// TODO Auto-generated constructor stub
	}

	//Constructor with params
	public InscripcionDTO(int idInscripcion, String nombre, String telefono, int idCurso, int idFormaPago) {
		super();
		this.idInscripcion = idInscripcion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.idCurso = idCurso;
		this.idFormaPago = idFormaPago;
	}

	// Getters and Setters
	public int getIdInscripcion() {
		return idInscripcion;
	}

	public void setIdInscripcion(int idInscripcion) {
		this.idInscripcion = idInscripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public int getIdFormaPago() {
		return idFormaPago;
	}

	public void setIdFormaPago(int idFormaPago) {
		this.idFormaPago = idFormaPago;
	}

	// ToString
	@Override
	public String toString() {
		return "InscripcionDTO [idInscripcion=" + idInscripcion + ", nombre=" + nombre + ", telefono=" + telefono
				+ ", idCurso=" + idCurso + ", idFormaPago=" + idFormaPago + "]";
	}
}
