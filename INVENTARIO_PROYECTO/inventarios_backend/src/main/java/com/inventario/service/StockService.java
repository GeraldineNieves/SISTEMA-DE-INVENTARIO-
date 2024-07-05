package com.inventario.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventario.model.Stock;
import com.inventario.model.Tiposproveedores;
import com.inventario.repository.IStockRepository;
import com.inventario.repository.ITiposproveedoresRepository;
@Service
public class StockService {
	
	@Autowired
	IStockRepository repositorio;
	
	public List<Stock> listarStock(){
		return repositorio.findAll();
	}
	
	public Stock guardarStock(Stock stock) {
		return repositorio.save(stock);
	}
	
	public Stock buscarStocks(Long idStock) {
		return repositorio.findById(idStock).orElse(null);
	}
	
	public void eliminarStock(Long idStock) {
		 repositorio.deleteById(idStock);
	}

}
