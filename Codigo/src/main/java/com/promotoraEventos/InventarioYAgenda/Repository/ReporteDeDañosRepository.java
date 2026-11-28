package com.promotoraEventos.InventarioYAgenda.Repository;

import org.springframework.data.repository.CrudRepository;

import com.promotoraEventos.InventarioYAgenda.Entidades.ReporteDeDañosEntidad;
import com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos.ID_ReporteDeDaños;

public interface ReporteDeDañosRepository extends CrudRepository<ReporteDeDañosEntidad,ID_ReporteDeDaños> {
    
}
