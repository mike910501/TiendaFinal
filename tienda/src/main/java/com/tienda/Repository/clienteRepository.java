package com.tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tienda.model.clientes;

public interface clienteRepository extends JpaRepository<clientes, Integer>{

}
