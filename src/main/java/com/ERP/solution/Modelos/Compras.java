package com.ERP.solution.Modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "Fecha Hora")
    private Date fechaHora;

    @Column(name = "Descripcion")
    private String descripcion;

    @Column(name = "total")
    private float total;

    @OneToMany(mappedBy = "compra")
    private List<DetalleCompras> detalleCompras;
}
