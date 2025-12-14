package com.ERP.solution.Repositorios;

import com.ERP.solution.Modelos.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
}
