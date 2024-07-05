package com.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.model.Categorias;
import com.inventario.model.Tiposproveedores;
import com.inventario.repository.ICategoriasRepository;
import com.inventario.repository.ITiposproveedoresRepository;

@Service
public class CategoriasService {
	
	@Autowired
	ICategoriasRepository repositorio;
	
	public List<Categorias> listarCategorias(){
		return repositorio.findAll();
	}
	
	public Categorias guardarCategorias(Categorias categorias) {
		return repositorio.save(categorias);
	}
	
	public Categorias buscarCategorias(Long idCategorias) {
		return repositorio.findById(idCategorias).orElse(null);
	}
	
	public void eliminarCatgeorias(Long idCategorias) {
		 repositorio.deleteById(idCategorias);;
	}

}
