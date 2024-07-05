package com.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.modelo.Proveedores;
import com.inventario.modelo.Tipoproveedores;

public interface IProveedoresRepository extends JpaRepository<Proveedores, Long>{

}
