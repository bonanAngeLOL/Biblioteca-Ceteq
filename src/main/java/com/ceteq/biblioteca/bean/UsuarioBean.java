package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.sql.Date;

import com.sun.istack.NotNull;

public class UsuarioBean implements Serializable{
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
	private int idPrestamo;
	
	public UsuarioBean() {
	}
	
	public UsuarioBean(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public UsuarioBean(int idUsuario, String nombre, String apellidos, String curp, Date fechaNacimiento,
			String telefono, String direccion, String email, int idPrestamo) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curp = curp;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.idPrestamo = idPrestamo;
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
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
