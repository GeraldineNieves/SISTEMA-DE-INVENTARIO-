package com.inventario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.model.Categorias;
import com.inventario.model.Tiposproveedores;

public interface ICategoriasRepository extends JpaRepository<Categorias, Long>{

}
