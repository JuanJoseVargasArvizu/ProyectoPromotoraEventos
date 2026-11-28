package com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos;

import java.io.Serializable;
import java.util.Objects;

public class ID_BienesPrestados_ServicioDeRenta implements Serializable {
    private Integer id;
    private String folio;

    public ID_BienesPrestados_ServicioDeRenta() {
    }

    public ID_BienesPrestados_ServicioDeRenta(Integer id, String folio) {
        this.id = id;
        this.folio = folio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ID_BienesPrestados_ServicioDeRenta that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(folio, that.folio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, folio);
    }
}