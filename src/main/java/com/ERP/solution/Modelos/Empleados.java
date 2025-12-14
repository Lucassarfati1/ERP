package com.ERP.solution.Modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Empleados")

public class Empleados {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "EmpleadoID")
    private Long id;

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "DNI")
    private String DNI;

    @Column(name = "FechaNacimiento")
    private Date fechaNacimiento;

    @Column(name = "Posicion")
    private String posicion;

    @Column(name = "sueldo")
    private float sueldo;

    @Column(name = "FechaIngreso")
    private Date fechaIngreso;


}
