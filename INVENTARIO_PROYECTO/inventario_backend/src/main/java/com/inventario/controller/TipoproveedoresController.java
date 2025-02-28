package com.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.modelo.Tipoproveedores;
import com.inventario.repository.ITipoproveedoresRepository;

@RestController
@RequestMapping("api/v1/")
public class TipoproveedoresController {

	@Autowired
	private ITipoproveedoresRepository repositorio;

	@GetMapping("/tipoproveedores")

	public List<Tipoproveedores> listarTipoproveedores() {
		return repositorio.findAll();
	}

}
