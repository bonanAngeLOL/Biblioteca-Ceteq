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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "b_libros")
public class LibroModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8596203693747298812L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_libro")
	private int idLibro;

	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "id_autor")
	private AutorModel idAutor;

	@ManyToOne
	@JoinColumn(name = "id_categoria")
	private CategoriaModel idCategoria;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha", nullable = false)
	private Date fechaPublicacion;

	@Column(name = "existencia", nullable = false)
	private int existencia;

	@Column(name = "edicion", nullable = false, length = 11)
	private String edicion;

	public LibroModel(int idLibro, String nombre, AutorModel idAutor, CategoriaModel idCategoria, Date fechaPublicacion,
			int existencia, String edicion) {
		this.idLibro = idLibro;
		this.nombre = nombre;
		this.idAutor = idAutor;
		this.idCategoria = idCategoria;
		this.fechaPublicacion = fechaPublicacion;
		this.existencia = existencia;
		this.edicion = edicion;
	}

	public LibroModel(int idLibro) {
		this.idLibro = idLibro;
	}

	public LibroModel() {
	}

	public int getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public AutorModel getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(AutorModel idAutor) {
		this.idAutor = idAutor;
	}

	public CategoriaModel getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(CategoriaModel idCategoria) {
		this.idCategoria = idCategoria;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public String getEdicion() {
		return edicion;
	}

	public void setEdicion(String edicion) {
		this.edicion = edicion;
	}

}
