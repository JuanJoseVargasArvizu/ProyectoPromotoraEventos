package com.promotoraEventos.InventarioYAgenda.Repository;

import org.springframework.data.repository.CrudRepository;
import com.promotoraEventos.InventarioYAgenda.Entidades.TarifasExtras;
import com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos.ID_TarifasExtras;

public interface TarifasExtrasRepository extends CrudRepository<TarifasExtras,ID_TarifasExtras> {
    
}
