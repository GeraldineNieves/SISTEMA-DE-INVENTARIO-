package com.inventario.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="proveedores")
public class Proveedores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProveedores")
	private Long idProveedores;
	@Column(name="nombre")
	private String nombre;
	@Column(name="telefono")
	private String telefono;
	@Column(name="direccion")
	private String direccion;
	@Column(name="email", unique = true)
	private String email;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "idTipoprov", nullable = false)
	private Tipoproveedores tipoproveedores ;

	public Proveedores() {
		
	}

	public Long getIdProveedores() {
		return idProveedores;
	}

	public void setIdProveedores(Long idProveedores) {
		this.idProveedores = idProveedores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Tipoproveedores getTipoproveedores() {
		return tipoproveedores;
	}

	public void setTipoproveedores(Tipoproveedores tipoproveedores) {
		this.tipoproveedores = tipoproveedores;
	}

	public Proveedores(String nombre, String telefono, String direccion, String email,
			Tipoproveedores tipoproveedores) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.tipoproveedores = tipoproveedores;
	}

	public Proveedores(Long idProveedores, String nombre, String telefono, String direccion, String email,
			Tipoproveedores tipoproveedores) {
		super();
		this.idProveedores = idProveedores;
		this.nombre = nombre;
		this.telefono = telefono;
		this.direccion = direccion;
		this.email = email;
		this.tipoproveedores = tipoproveedores;
	}

	
}
