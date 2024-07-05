package com.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.model.Productos;
import com.inventario.model.Stock;
import com.inventario.service.ProductosService;
import com.inventario.service.StockService;
@CrossOrigin
@RequestMapping("/api/proveedores")
@RestController
public class ProductosController {
	@Autowired
	ProductosService productosService;
	
	//metodo para listar proveedores
	@GetMapping("/listarproductos")
    public List<Productos> listarProductos() {
        return productosService.listarProductos();
    }

}
