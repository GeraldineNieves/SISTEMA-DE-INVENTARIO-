package com.inventario.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")

public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idProductos")
	private Long idProductos;
	@Column(name="codProductos")
	private Long codProductos;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="preciounitario")
	private double preciounitario;
	
	
	@ManyToOne
	@JoinColumn(name = "idStock", referencedColumnName="idStock",  nullable = false)
	
	private Stock stock ;
	
	@ManyToOne
	@JoinColumn(name = "idCategorias", referencedColumnName="idCategorias",  nullable = false)
	
	private Categorias categorias ;
	
	@ManyToOne
	@JoinColumn(name = "idProveedores", referencedColumnName="idProveedores",  nullable = false)
	
	private Proveedores proveedores ;
	


	public Productos() {
		
	}



	public Long getIdProductos() {
		return idProductos;
	}



	public void setIdProductos(Long idProductos) {
		this.idProductos = idProductos;
	}



	public Long getCodProductos() {
		return codProductos;
	}



	public void setCodProductos(Long codProductos) {
		this.codProductos = codProductos;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public double getPreciounitario() {
		return preciounitario;
	}



	public void setPreciounitario(double preciounitario) {
		this.preciounitario = preciounitario;
	}



	public Stock getStock() {
		return stock;
	}



	public void setStock(Stock stock) {
		this.stock = stock;
	}



	public Categorias getCategorias() {
		return categorias;
	}



	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}



	public Proveedores getProveedores() {
		return proveedores;
	}



	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}



	public Productos(Long codProductos, String descripcion, double preciounitario, Stock stock, Categorias categorias,
			Proveedores proveedores) {
		super();
		this.codProductos = codProductos;
		this.descripcion = descripcion;
		this.preciounitario = preciounitario;
		this.stock = stock;
		this.categorias = categorias;
		this.proveedores = proveedores;
	}



	public Productos(Long idProductos, Long codProductos, String descripcion, double preciounitario, Stock stock,
			Categorias categorias, Proveedores proveedores) {
		super();
		this.idProductos = idProductos;
		this.codProductos = codProductos;
		this.descripcion = descripcion;
		this.preciounitario = preciounitario;
		this.stock = stock;
		this.categorias = categorias;
		this.proveedores = proveedores;
	}

	
	
	
}
