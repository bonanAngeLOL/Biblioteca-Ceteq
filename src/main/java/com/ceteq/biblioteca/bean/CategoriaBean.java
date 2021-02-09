package com.ceteq.biblioteca.bean;

import java.io.Serializable;

import com.sun.istack.NotNull;

public class CategoriaBean implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private int idCategoria;
	@NotNull
	private String nombre;
	
	public CategoriaBean() {
	}
	
	public CategoriaBean(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public CategoriaBean(int idCategoria, String nombre) {
		this.idCategoria = idCategoria;
		this.nombre = nombre;
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
