package com.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.model.Proveedores;
import com.inventario.model.Stock;
import com.inventario.service.ProveedoresService;
import com.inventario.service.StockService;

@CrossOrigin
@RequestMapping("/api/proveedores")
@RestController

public class StockController {
	@Autowired
	StockService stockService;
	
	//metodo para listar proveedores
	@GetMapping("/listarstock")
    public List<Stock> listarStock() {
        return stockService.listarStock();
    }

}
