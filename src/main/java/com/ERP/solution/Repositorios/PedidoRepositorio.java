package com.ERP.solution.Repositorios;

import com.ERP.solution.Modelos.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long> {
}
