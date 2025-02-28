package com.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.model.Proveedores;
import com.inventario.model.Tiposproveedores;
import com.inventario.repository.IProveedoresRepository;
import com.inventario.repository.ITiposproveedoresRepository;

@Service
public class TiposproveedoresService {

	@Autowired
	ITiposproveedoresRepository repositorio;
	
	public List<Tiposproveedores> listarTiposproveedores(){
		return repositorio.findAll();
	}
	
	public Tiposproveedores guardarTiposproveedores(Tiposproveedores tiposproveedores) {
		return repositorio.save(tiposproveedores);
	}
	
	public Tiposproveedores buscarTiposproveedores(Long idTipoprov) {
		return repositorio.findById(idTipoprov).orElse(null);
	}
	
	public void eliminarTiposproveedores(Long idTipoprov) {
		 repositorio.deleteById(idTipoprov);;
	}



}

