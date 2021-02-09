package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.sql.Date;

import com.sun.istack.NotNull;

public class LibroBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idLibro;
	@NotNull
	private String nombre;
	@NotNull
	private int idAutor;
	@NotNull
	private int idCategoria;
	private Date fechaPublicacion;
	private int existencia;
	private String edicion;
	
	public LibroBean() {
		
	}
	
	public LibroBean(int idLibro) {
		this.idLibro = idLibro;
	}
	
	public LibroBean(int idLibro, String nombre, int idAutor, int idCategoria, Date fechaPublicacion, int existencia,
			String edicion) {
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.idAutor = idAutor;
		this.idCategoria = idCategoria;
		this.fechaPublicacion = fechaPublicacion;
		this.existencia = existencia;
		this.edicion = edicion;
	}

	//get&set
	public int getIdLibro() {
		return this.idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getIdAutor() {
		return this.idAutor;
	}
	public void seIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	
	public int getIdCategoria() {
		return this.idCategoria;
	}
	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}
	
	public Date getFechaPublicacion() {
		return this.fechaPublicacion;
	}
	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	public int getExistencia() {
		return this.existencia;
	}
	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	public String getEdicion() {
		return this.edicion;
	}
	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}
}
