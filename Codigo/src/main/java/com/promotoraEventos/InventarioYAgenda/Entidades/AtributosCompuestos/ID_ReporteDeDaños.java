package com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos;

import java.io.Serializable;
import java.util.Objects;

public class ID_ReporteDeDaños implements Serializable {
    private Integer id;
    private String folio;

    public ID_ReporteDeDaños() {
    }

    public ID_ReporteDeDaños(Integer id, String folio) {
        this.id = id;
        this.folio = folio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ID_ReporteDeDaños that)) return false;
        return Objects.equals(id, that.id) && Objects.equals(folio, that.folio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, folio);
    }
}