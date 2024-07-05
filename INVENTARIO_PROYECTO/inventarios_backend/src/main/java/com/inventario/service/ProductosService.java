package com.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.model.Productos;
import com.inventario.model.Stock;
import com.inventario.repository.IProductosRepository;
import com.inventario.repository.IStockRepository;

@Service
public class ProductosService {

	@Autowired
	IProductosRepository repositorio;
	
	public List<Productos> listarProductos(){
		return repositorio.findAll();
	}
	
	public Productos guardarProductos(Productos productos) {
		return repositorio.save(productos);
	}
	
	public Productos buscarProductos(Long idProductos) {
		return repositorio.findById(idProductos).orElse(null);
	}
	
	public void eliminarProductos(Long idProductos) {
		 repositorio.deleteById(idProductos);
	}
}
