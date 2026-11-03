package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.time.LocalDate;

public class RegistroDeDaños {
    private LocalDate m_fecha;
    private boolean m_estaResuelto;
    private String m_descripcionDaños;
    private String m_folioElemento;
    private String m_nombreDelEventoDelDaño;

    public boolean EstaResuelto(){
        return m_estaResuelto;
    }

    public void setDescripcion(String descripcion){
        this.m_descripcionDaños = descripcion;
    }

    public void setFolioElemento(String folio){
        this.m_folioElemento = folio;
    }

    public void setEventoDelDaño(String nombreEvento){
        this.m_nombreDelEventoDelDaño = nombreEvento;
    }

    public String getDescripcion(){
        return m_descripcionDaños;
    }

    public String getFolio(){
        return m_folioElemento;
    }

    public String getNombreEvento(){
        return m_nombreDelEventoDelDaño;
    }

    public LocalDate getFecha(){
        return m_fecha;
    }
}
