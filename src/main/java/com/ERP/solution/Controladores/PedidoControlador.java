package com.ERP.solution.Controladores;

import com.ERP.solution.Servicios.Implementaciones.PedidoImplementacion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Pedidos")
public class PedidoControlador {
    private final PedidoImplementacion pedidoServicio;


    public PedidoControlador(PedidoImplementacion pedidoServicio) {
        this.pedidoServicio = pedidoServicio;
    }

    // creacion de pedidos

    // Endpoint para cambiarle el estado

    // Endpoint para listarlos

    // Endpoint para filtrarlos por rango de precio

    // Endpoint para filtrarlos por Fecha

    // Endpoint para filtrarlos por estado



}
