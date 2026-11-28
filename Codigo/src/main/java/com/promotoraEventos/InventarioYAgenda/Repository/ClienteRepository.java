package com.promotoraEventos.InventarioYAgenda.Repository;

import org.springframework.data.repository.CrudRepository;
import com.promotoraEventos.InventarioYAgenda.Entidades.ClienteEntidad;

public interface ClienteRepository extends CrudRepository<ClienteEntidad,Integer> {
    
}
