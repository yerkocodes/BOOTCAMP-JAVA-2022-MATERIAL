package com.edutecno.model;

public class CursoDTO {
	
	//Atributos
	private int idCurso;
	private String descripcion;
	private int precio;
	
	//Constructor empty
	public CursoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	// Constructor with params
	public CursoDTO(int idCurso, String descripcion, int precio) {
		super();
		this.idCurso = idCurso;
		this.descripcion = descripcion;
		this.precio = precio;
	}

	// Getters and Setters
	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "CursoDTO [idCurso=" + idCurso + ", descripcion=" + descripcion + ", precio=" + precio + "]";
	}

}
