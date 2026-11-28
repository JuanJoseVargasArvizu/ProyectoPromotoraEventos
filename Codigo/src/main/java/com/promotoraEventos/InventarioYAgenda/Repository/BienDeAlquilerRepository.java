package com.promotoraEventos.InventarioYAgenda.Repository;

import org.springframework.data.repository.CrudRepository;

import com.promotoraEventos.InventarioYAgenda.Entidades.BienDeAlquilerEntidad;

public interface BienDeAlquilerRepository extends CrudRepository<BienDeAlquilerEntidad,String> {
    
}
