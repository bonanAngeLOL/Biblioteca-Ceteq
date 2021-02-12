package com.ceteq.biblioteca.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "b_prestamos")
public class PrestamoModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 824378326574766098L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_prestamo")
	private int idPrestamo;

	@ManyToOne
	@JoinColumn(name = "id_usuario", nullable = false)
	private UsuarioModel idUsuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_prestamo", nullable = false)
	private Date fechaPrestamo;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha_entrega", nullable = true)
	private Date fechaEntrega;

	@OneToOne
	@JoinColumn(name = "id_libro", nullable = false)
	private LibroModel idLibro;

	public PrestamoModel(int idPrestamo, UsuarioModel idUsuario, Date fechaPrestamo, Date fechaEntrega,
			LibroModel idLibro) {
		this.idPrestamo = idPrestamo;
		this.idUsuario = idUsuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaEntrega = fechaEntrega;
		this.idLibro = idLibro;
	}

	public PrestamoModel(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public PrestamoModel() {
	}

	public int getIdPrestamo() {
		return idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public UsuarioModel getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(UsuarioModel idUsuario) {
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

	public LibroModel getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(LibroModel idLibro) {
		this.idLibro = idLibro;
	}

}
