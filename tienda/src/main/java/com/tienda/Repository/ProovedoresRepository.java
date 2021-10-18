package com.tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tienda.model.Proovedores;

@Repository
public interface ProovedoresRepository extends JpaRepository<Proovedores, Integer>{

}
