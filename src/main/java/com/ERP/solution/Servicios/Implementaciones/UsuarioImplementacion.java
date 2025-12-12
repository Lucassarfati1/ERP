package com.ERP.solution.Servicios.Implementaciones;

import com.ERP.solution.Modelos.Usuario;
import com.ERP.solution.Repositorios.UsuarioRepositorio;
import com.ERP.solution.Servicios.UsuarioServicio;
import org.springframework.stereotype.Service;



@Service
public class UsuarioImplementacion implements UsuarioServicio {
    private final UsuarioRepositorio repositorio;
    public UsuarioImplementacion (UsuarioRepositorio repositorio){
        this.repositorio = repositorio;
    }
    @Override
    public Usuario save(Usuario usuario){

        return repositorio.save(usuario);
    }


}
