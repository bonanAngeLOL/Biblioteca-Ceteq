package com.ceteq.biblioteca.bean;

import java.io.Serializable;
import java.util.Date;

import com.sun.istack.NotNull;

public class MultaBeanM implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private int idMulta;
	@NotNull
	private double saldo;
	@NotNull
	private Date fechaMulta;
	@NotNull
	private Date fechaPago;
	
	public int getIdMulta() {
		return idMulta;
	}

	public void setIdMulta(int idMulta) {
		this.idMulta = idMulta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getFechaMulta() {
		return fechaMulta;
	}

	public void setFechaMulta(Date fechaMulta) {
		this.fechaMulta = fechaMulta;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	public MultaBeanM() {
		
	}
	
	public MultaBeanM(int idMulta) {
		this.idMulta = idMulta;
	}
	
	

}
