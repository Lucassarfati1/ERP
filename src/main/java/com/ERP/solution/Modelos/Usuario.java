package com.ERP.solution.Modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Usuarios")
public class Usuario {


    public Usuario(String nombre, String apellido, String nombreUsuario, String contraseña){
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = nombreUsuario;
        this.contraseña = contraseña;
    }
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID")
    private Long id;
    @Column(name = "Nombre", nullable = false)
    private String nombre;
    @Column(name = "Apellido", nullable = false)
    private String apellido;
    @Column(name = "Usuario", nullable = false)
    private String usuario;
    @Column(name = "Contraseña", nullable = false)
    private String contraseña;
    @Column(name = "Rol", nullable = false)
    private int rol;

}
