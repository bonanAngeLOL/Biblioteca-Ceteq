package com.ceteq.biblioteca.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "b_usuarios")
public class UsuarioModel implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6419854752316493050L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private int idUsuario;

	@Column(name = "usuario", length = 50, nullable = false)
	private String nombre;

	@Column(name = "apellidos", length = 50, nullable = false)
	private String apellidos;

	@Column(name = "curp", length = 18, nullable = false, unique = true)
	private String curp;

	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", nullable = false)
	private Date fechaNacimiento;

	@Column(name = "telefono", length = 10, nullable = false)
	private String telefono;

	@Column(name = "direccion", length = 60, nullable = false)
	private String direcion;

	@Column(name = "correo", length = 30, nullable = false)
	private String correo;

//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "prestamo_id")
//	private PrestamoModel prestamoModel;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurp() {
		return curp;
	}

	public void setCurp(String curp) {
		this.curp = curp;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDirecion() {
		return direcion;
	}

	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public UsuarioModel(int idUsuario, String nombre, String apellidos, String curp, Date fechaNacimiento,
			String telefono, String direcion, String correo) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curp = curp;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono = telefono;
		this.direcion = direcion;
		this.correo = correo;
	}

	public UsuarioModel(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public UsuarioModel() {
	}

    @Override
    public String toString() {
        return "UsuarioModel [apellidos=" + apellidos + ", correo=" + correo + ", curp=" + curp + ", direcion="
                + direcion + ", fechaNacimiento=" + fechaNacimiento + ", idUsuario=" + idUsuario + ", nombre=" + nombre
                + ", telefono=" + telefono + "]";
    }

}
