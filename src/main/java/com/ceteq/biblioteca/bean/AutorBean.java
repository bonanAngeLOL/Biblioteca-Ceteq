package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.util.Date;

import com.sun.istack.NotNull;

public class AutorBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idAutor;
	
	@NotNull
	private String nombre;
	
	@NotNull
	private String apellidos;
	
	@NotNull
	private Date fechaNacimiento;
	
	@NotNull
	private String nacionalidad;
	
	public AutorBean() {
		
	}
	
	public AutorBean(int idAutor, String nombre, String apellidos, Date fechaNacimiento, String nacionalidad) {
		this.idAutor = idAutor;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.nacionalidad = nacionalidad;
	}
	
	public AutorBean(int idAutor) {
		this.idAutor = idAutor;
	}
	
	
	//getter&setter
	public int getIdAutor() {
		return this.idAutor;
	}
	public void setIdAutor(int idAutor) {
		this.idAutor = idAutor;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellidos() {
		return this.apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	

}
