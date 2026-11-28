package com.promotoraEventos.InventarioYAgenda.Repository;

import org.springframework.data.repository.CrudRepository;
import com.promotoraEventos.InventarioYAgenda.Entidades.UsuarioEntidad;

public interface UsuarioRepository extends CrudRepository<UsuarioEntidad,String> {
    
}
