package com.ERP.solution.Modelos;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "Finanzas")

public class Finanzas {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "TransaccionID")
    private int id;

    @Column(name = "Total")
    private float total;


}
