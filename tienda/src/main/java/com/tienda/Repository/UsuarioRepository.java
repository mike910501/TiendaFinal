package com.tienda.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tienda.model.*;

@Repository
public interface UsuarioRepository extends JpaRepository<usuarios, Integer> {

}
