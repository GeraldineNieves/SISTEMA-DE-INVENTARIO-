package com.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.model.Stock;


public interface IStockRepository extends JpaRepository<Stock, Long>{

}
