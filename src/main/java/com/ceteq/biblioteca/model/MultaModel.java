package com.ceteq.biblioteca.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "b_multas")
public class MultaModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8033106117381885687L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_multa")
	private int idMulta;

	@OneToOne
	@JoinColumn(name = "id_prestamo")
	private PrestamoModel idPrestamo;

	@Column(name = "saldo", nullable = false)
	private Double saldo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_multa", nullable = false)
	private Date fechaMulta;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_pago", nullable = false)
	private Date fechaPago;

	public MultaModel(int idMulta, PrestamoModel idPrestamo, Double saldo, Date fechaMulta, Date fechaPago) {
		this.idMulta = idMulta;
		this.idPrestamo = idPrestamo;
		this.saldo = saldo;
		this.fechaMulta = fechaMulta;
		this.fechaPago = fechaPago;
	}

	public MultaModel(int idMulta) {
		this.idMulta = idMulta;

	}

	public MultaModel() {
	}

	public int getIdMulta() {
		return idMulta;
	}

	public void setIdMulta(int idMulta) {
		this.idMulta = idMulta;
	}

	public PrestamoModel getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(PrestamoModel idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
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

}
