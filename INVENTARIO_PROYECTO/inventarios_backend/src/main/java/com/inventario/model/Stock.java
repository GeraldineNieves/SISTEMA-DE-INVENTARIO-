package com.inventario.model;

import java.util.List;

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
@Table(name="stock")
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idStock")
	private Long idStock;
	@Column(name="descripcion")
	private String descripcion;
	public Stock() {
		
	}
	
	
	public Long getIdStock() {
		return idStock;
	}


	public void setIdStock(Long idStock) {
		this.idStock = idStock;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Stock(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	public Stock(Long idStock, String descripcion) {
		super();
		this.idStock = idStock;
		this.descripcion = descripcion;
	}
	
	
	



	


}
