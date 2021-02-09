package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.util.Date;

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

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}

	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

}
