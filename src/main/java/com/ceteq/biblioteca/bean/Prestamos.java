package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.sql.Date;

public class Prestamos implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idPrestamos;
	private int idUsuario;
	private Date fechaPrestamo;
	private Date fechaEntrega;
	
	Prestamos(){
		
	}
	
	Prestamos(int idPrestamos){
		this.idPrestamos = idPrestamos;
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
