package com.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.modelo.Proveedores;
import com.inventario.repository.IProveedoresRepository;


@RestController
@RequestMapping("api/v2/")
public class ProveedorController {
	@Autowired
	private IProveedoresRepository repositorios;

	@GetMapping("/proveedores")

	public List<Proveedores> listarProveedores() {
		return repositorios.findAll();
	}

}
