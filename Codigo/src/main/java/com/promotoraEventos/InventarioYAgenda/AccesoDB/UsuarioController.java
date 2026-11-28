package com.promotoraEventos.InventarioYAgenda.AccesoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.promotoraEventos.InventarioYAgenda.Entidades.UsuarioEntidad;
import com.promotoraEventos.InventarioYAgenda.Repository.UsuarioRepository;


@Controller 
@RequestMapping(path="/usuario")
public class UsuarioController {
    @Autowired 
    private UsuarioRepository usuarioRepository;

    @PostMapping(path="/agregar")
    public @ResponseBody boolean AgregarUsuario(@RequestParam String nombre,
/* */                                           @RequestParam String contraseña,
/* */                                           @RequestParam String rol){
        UsuarioEntidad nuevoUsuario = new UsuarioEntidad();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setContraseña(contraseña);
        nuevoUsuario.setContraseña(contraseña);
        usuarioRepository.save(nuevoUsuario);
        return true;
    }

    public @ResponseBody Iterable<UsuarioEntidad> ObtenerUsuarios(){
        return usuarioRepository.findAll();
    } 

    public @ResponseBody UsuarioEntidad ObtenerClientePorId(@RequestParam String id){
        return usuarioRepository.findById(id).orElse(null);
    }

}
