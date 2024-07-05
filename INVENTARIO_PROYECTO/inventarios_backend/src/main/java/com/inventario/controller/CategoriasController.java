package com.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.model.Categorias;
import com.inventario.model.Stock;
import com.inventario.service.CategoriasService;
import com.inventario.service.StockService;

@CrossOrigin
@RequestMapping("/api/proveedores")
@RestController

public class CategoriasController {
	@Autowired
	CategoriasService categoriasService;
	
	//metodo para listar proveedores
	@GetMapping("/listarcategorias")
    public List<Categorias> listarCategorias() {
        return categoriasService.listarCategorias();
    }

}
