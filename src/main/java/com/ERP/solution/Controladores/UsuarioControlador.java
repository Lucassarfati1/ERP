package com.ERP.solution.Controladores;

import com.ERP.solution.Modelos.Usuario;
import com.ERP.solution.Servicios.Implementaciones.UsuarioImplementacion;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioControlador {
    private final UsuarioImplementacion usuarioServicio;
    public UsuarioControlador(UsuarioImplementacion usuarioServicio){
        this.usuarioServicio = usuarioServicio;
    }
    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioServicio.save(usuario);

    }
    @GetMapping("/ping")
    public String ping() {
        return "Servidor ERP corriendo OK ✅";
    }


}