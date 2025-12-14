package com.ERP.solution.Modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rol {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "IDRol")
    private int id;

    @Column(name = "Nombre")
    private String nombre;


}
