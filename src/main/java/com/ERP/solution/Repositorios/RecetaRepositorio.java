package com.ERP.solution.Repositorios;

import com.ERP.solution.Modelos.Receta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecetaRepositorio extends JpaRepository<Receta, Long> {
}
