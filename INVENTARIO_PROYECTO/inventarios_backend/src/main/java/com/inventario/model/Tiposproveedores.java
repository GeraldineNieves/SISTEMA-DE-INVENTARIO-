package com.inventario.model;

import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tiposproveedores")

public class Tiposproveedores {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idTipoprov")
	private Long idTipoprov;
	@Column(name="descripcion")
	private String descripcion;
	
	

	public Tiposproveedores() {
		
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



	public Tiposproveedores(String descripcion) {
		super();
		this.descripcion = descripcion;
	}



	public Tiposproveedores(Long idTipoprov, String descripcion) {
		super();
		this.idTipoprov = idTipoprov;
		this.descripcion = descripcion;
	}

	
	
}
