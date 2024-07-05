package com.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.model.Proveedores;
import com.inventario.repository.IProveedoresRepository;

@Service
public class ProveedoresService {
	
	@Autowired
	IProveedoresRepository repositorio;
	
	public List<Proveedores> listarProveedores(){
		return repositorio.findAll();
	}
	
	public Proveedores guardarProveedores(Proveedores proveedores) {
		return repositorio.save(proveedores);
	}
	
	public Proveedores buscarProveedores(Long idProveedores) {
		return repositorio.findById(idProveedores).orElse(null);
	}
	
	public void eliminarProveedores(Long idProveedores) {
		 repositorio.deleteById(idProveedores);;
	}



}
