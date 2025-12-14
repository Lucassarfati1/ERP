package com.ERP.solution.Repositorios;

import com.ERP.solution.Modelos.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepositorio extends JpaRepository<Stock, Long> {
}
