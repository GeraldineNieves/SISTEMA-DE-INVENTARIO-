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
import com.inventario.model.Tiposproveedores;
import com.inventario.service.TiposproveedoresService;
@CrossOrigin
@RequestMapping("/api/tiposproveedores")
@RestController
public class TiposproveedoresController {

	@Autowired
	TiposproveedoresService tiposproveedoresService;
	
	@GetMapping("/listartipop")
	public List<Tiposproveedores> listarTiposproveedores(){
		return tiposproveedoresService.listarTiposproveedores();
	}
	
	
	@PostMapping("/guardar")
    public Tiposproveedores guardarTiposproveedores(@RequestBody Tiposproveedores tiposproveedores) {
        return tiposproveedoresService.guardarTiposproveedores(tiposproveedores);
    }
	
	 @GetMapping("/listartipop/{id}")
	    public Tiposproveedores buscarTiposproveedores( Long idTipoprov) {
	        return tiposproveedoresService.buscarTiposproveedores(idTipoprov);
	    }
	    
	    @PostMapping("/eliminar/{idTipoprov}")
	    public void eliminarTiposproveedores(@PathVariable Long idTipoprov) {
	        tiposproveedoresService.eliminarTiposproveedores(idTipoprov);
	    }
}
