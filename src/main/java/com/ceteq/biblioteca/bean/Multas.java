package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.util.Date;

import com.sun.istack.NotNull;

public class Multas implements Serializable {
	private static final long serialVersionUID = 1L;
	private int idMulta;
	@NotNull
	private int idPrestamo;
	@NotNull
	private float saldo;
	@NotNull
	private Date fechaMulta;
	@NotNull
	private Date fechaPago;
	
	public Multas() {
		
	}
	
	public Multas(int idMulta) {
		this.idMulta = idMulta;
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
	
	public float getSaldo() {
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
