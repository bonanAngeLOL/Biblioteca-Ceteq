package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.util.Date;

import com.sun.istack.NotNull;

public class MultaBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idMulta;
	@NotNull
	private int idPrestamo;
	@NotNull
	private double saldo;
	@NotNull
	private Date fechaMulta;
	@NotNull
	private Date fechaPago;
	
	public MultaBean() {
		
	}
	
	public MultaBean(int idMulta) {
		this.idMulta = idMulta;
	}
	
	
	
	public MultaBean(int idMulta, int idPrestamo, double saldo, Date fechaMulta, Date fechaPago) {
		this.idMulta = idMulta;
		this.idPrestamo = idPrestamo;
		this.saldo = saldo;
		this.fechaMulta = fechaMulta;
		this.fechaPago = fechaPago;
	}

	//get&set
	public int getIdMulta() {
		return this.idMulta;
	}
	public void setIdMulta(int idMulta) {
		this.idMulta = idMulta;
	}
	
	public int getIdPrestamo() {
		return this.idPrestamo;
	}
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public Date getFechaMulta() {
		return this.fechaMulta;
	}
	public void setFechaMulta(Date fechaMulta) {
		this.fechaMulta = fechaMulta;
	}
	
	public Date getFechaPago() {
		return this.fechaPago;
	}
	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}
}
