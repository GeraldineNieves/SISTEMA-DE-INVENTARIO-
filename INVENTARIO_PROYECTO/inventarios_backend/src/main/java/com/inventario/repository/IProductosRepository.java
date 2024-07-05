package com.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.model.Productos;
import com.inventario.model.Tiposproveedores;

public interface IProductosRepository extends JpaRepository<Productos, Long> {

}
