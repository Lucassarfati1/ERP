package com.ERP.solution.Modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

    @Data
    @Getter
    @AllArgsConstructor
    @NoArgsConstructor
    @Entity
    @Table(name = "Pedidos")

    public class Pedido {

        public Pedido(float total, Date fechaHora,  String estado){
            this.total = total;
            this.fechaHora = fechaHora;
            this.estado = estado;
        }
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Id
        @Column(name = "ID")
        private Long id;

        @Column(name = "Total", nullable = false)
        private float total;

        @Column(name = "fechaHora", nullable = false)
        private Date fechaHora;

        @Column(name = "estado", nullable = false)
        private String estado;


        @OneToMany(mappedBy = "pedido")
        private List<DetallePedido> ordenDetalles;
    }


