package com.tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.model.Ventas;

@Repository
public interface VentasRepository extends JpaRepository<Ventas, Integer>{

}
