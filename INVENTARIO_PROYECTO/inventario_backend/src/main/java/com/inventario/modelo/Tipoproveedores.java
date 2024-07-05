package com.inventario.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tipoproveedores")
public class Tipoproveedores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTipoprov")
	private Long idTipoprov;
	@Column(name="descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy = "tipoproveedores")
	private List<Proveedores> proveedores;

	public Tipoproveedores() {
		
	}

	public Long getIdTipoprov() {
		return idTipoprov;
	}

	public void setIdTipoprov(Long idTipoprov) {
		this.idTipoprov = idTipoprov;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Proveedores> getProveedores() {
		return proveedores;
	}

	public void setProveedores(List<Proveedores> proveedores) {
		this.proveedores = proveedores;
	}

	public Tipoproveedores(String descripcion, List<Proveedores> proveedores) {
		super();
		this.descripcion = descripcion;
		this.proveedores = proveedores;
	}

	public Tipoproveedores(Long idTipoprov, String descripcion, List<Proveedores> proveedores) {
		super();
		this.idTipoprov = idTipoprov;
		this.descripcion = descripcion;
		this.proveedores = proveedores;
	}
	
	

}
