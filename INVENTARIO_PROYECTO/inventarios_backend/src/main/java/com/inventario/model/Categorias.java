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
@Table(name="categorias")
public class Categorias {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCategorias")
	private Long idCategorias;
	@Column(name="descripcion")
	private String descripcion;
	


public Categorias() {
	
}



public Long getIdCategorias() {
	return idCategorias;
}



public void setIdCategorias(Long idCategorias) {
	this.idCategorias = idCategorias;
}



public String getDescripcion() {
	return descripcion;
}



public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}



public Categorias(String descripcion) {
	super();
	this.descripcion = descripcion;
}



public Categorias(Long idCategorias, String descripcion) {
	super();
	this.idCategorias = idCategorias;
	this.descripcion = descripcion;
}



}
