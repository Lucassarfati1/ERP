package com.ERP.solution.Modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Ingredientes")
public class Stock {

    @Id
    private Long id;
    @Column(name = "Nombre")
    private String nombre;
    @Column(name = "Cantidad")
    private int cantidad;
    @Column(name = "Unidad de medida")
    private String unidadMedida;
    @Column(name = "Stock minimo")
    private int stockMinimo;


}
