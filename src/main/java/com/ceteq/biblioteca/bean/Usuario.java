package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.sql.Date;

import com.sun.istack.NotNull;

public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idUsuario;
	
	@NotNull
	private String nombre;
	@NotNull
	private String apellidos;
	@NotNull
	private String curp;
	private Date fechaNacimiento;
	private String telefono;
	private String direccion;
	private String email;
	
	public Usuario() {
	}
	
	public Usuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	//get&set
	public int getIdUsuario() {
		return this.idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
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
	
	public String getCurp() {
		return this.curp;
	}
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	public Date getFechaNacimiento() {
		return this.fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
