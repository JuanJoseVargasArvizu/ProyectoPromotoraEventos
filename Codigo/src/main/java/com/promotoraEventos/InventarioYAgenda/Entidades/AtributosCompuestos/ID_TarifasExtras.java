package com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos;

import java.io.Serializable;
import java.util.Objects;

public class ID_TarifasExtras implements Serializable {
    private Integer id;
    private Integer discriminante;

    public ID_TarifasExtras(){
    }

    public ID_TarifasExtras(Integer id, Integer discriminante) {
        this.id = id;
        this.discriminante = discriminante;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ID_TarifasExtras that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(discriminante, that.discriminante);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, discriminante);
    }
    
    
}
