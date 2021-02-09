package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.sql.Date;

import com.sun.istack.NotNull;

public class PrestamoBean implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private int idPrestamos;
	@NotNull
	private int idUsuario;
	@NotNull
	private Date fechaPrestamo;
	@NotNull
	private Date fechaEntrega;
	
	PrestamoBean(){
		
	}
	
	PrestamoBean(int idPrestamos){
		this.idPrestamos = idPrestamos;
	}
	
	

	public PrestamoBean(int idPrestamos, int idUsuario, Date fechaPrestamo, Date fechaEntrega) {
		this.idPrestamos = idPrestamos;
		this.idUsuario = idUsuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaEntrega = fechaEntrega;
	}

	public int getIdPrestamos() {
		return idPrestamos;
	}

	public void setIdPrestamos(int idPrestamos) {
		this.idPrestamos = idPrestamos;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	
}
