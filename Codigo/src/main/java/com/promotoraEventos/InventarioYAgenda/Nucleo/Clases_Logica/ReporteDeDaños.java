package com.promotoraEventos.InventarioYAgenda.Nucleo.Clases_Logica;

import java.time.LocalDate;

public class ReporteDeDaños {
    private int m_id;
    private LocalDate m_fecha;
    private String m_folioBienDañado;
    private String m_descripcion;
    private String m_nombreEvento;

    public int getId() {
        return m_id;
    }
    public void setId(int m_id) {
        this.m_id = m_id;
    }
    public LocalDate getFecha() {
        return m_fecha;
    }
    public void setFecha(LocalDate m_fecha) {
        this.m_fecha = m_fecha;
    }
    public String getFolioBienDañado() {
        return m_folioBienDañado;
    }
    public void setFolioBienDañado(String m_folioBienDañado) {
        this.m_folioBienDañado = m_folioBienDañado;
    }
    public String getDescripcion() {
        return m_descripcion;
    }
    public void setDescripcion(String m_descripcion) {
        this.m_descripcion = m_descripcion;
    }
    public String getNombreEvento() {
        return m_nombreEvento;
    }
    public void setNombreEvento(String m_nombreEvento) {
        this.m_nombreEvento = m_nombreEvento;
    }

    

}
