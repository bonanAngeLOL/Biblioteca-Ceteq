package com.ceteq.biblioteca.bean;

import java.io.Serializable;

public class Categoria implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private int idCategoria;
	private String nombre;
	
	public Categoria() {
		
	}
	
	public Categoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public int getIdCategoria() {
		return this.idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
