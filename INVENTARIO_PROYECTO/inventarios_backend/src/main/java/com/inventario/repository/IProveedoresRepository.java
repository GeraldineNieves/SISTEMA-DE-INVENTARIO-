package com.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.model.Proveedores;


public interface IProveedoresRepository extends JpaRepository<Proveedores, Long> {

}
