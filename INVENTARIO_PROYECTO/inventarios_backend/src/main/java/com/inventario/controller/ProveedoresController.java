package com.inventario.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.inventario.model.Proveedores;
import com.inventario.service.ProveedoresService;
@CrossOrigin
@RequestMapping("/api/proveedores")
@RestController

public class ProveedoresController {
	
	@Autowired
	ProveedoresService proveedoresService;
	
	//metodo para listar proveedores
	@GetMapping("/listarproveedores")
    public List<Proveedores> listarProveedores() {
        return proveedoresService.listarProveedores();
    }
    
    @GetMapping("/{idproveedores}")
    public Proveedores buscarProveedores(@PathVariable Long id) {
        return proveedoresService.buscarProveedores(id);
    }
    
    @PostMapping("/guardarproveedores")
    public Proveedores guardarProveedores(@RequestBody Proveedores proveedores) {
        return proveedoresService.guardarProveedores(proveedores);
    }
    
    @PostMapping("/eliminarproveedores/{id}")
    public void eliminarProveedores(@PathVariable Long id) {
        proveedoresService.eliminarProveedores(id);
    }
}
