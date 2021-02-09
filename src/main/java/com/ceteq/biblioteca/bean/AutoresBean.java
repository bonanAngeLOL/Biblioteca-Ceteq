package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.sql.Date;

import com.sun.istack.NotNull;

public class AutoresBean implements Serializable {
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
	
	public AutoresBean() {
		
	}
	
	public AutoresBean(int idAutor) {
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
	
	public String setNacionalidad() {
		return this.nacionalidad;
	}
	
	public void getNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	

}
