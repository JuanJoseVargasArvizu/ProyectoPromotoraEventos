package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.time.LocalDateTime;

public class HorariosServicio {
    private LocalDateTime m_inicioEvento;
    private LocalDateTime m_finalEvento;
    private LocalDateTime m_montaje;
    private LocalDateTime m_desmontaje;
    
    public LocalDateTime getInicioEvento() {
        return m_inicioEvento;
    }
    public void setInicioEvento(LocalDateTime m_inicioEvento) {
        this.m_inicioEvento = m_inicioEvento;
    }
    public LocalDateTime getFinalEvento() {
        return m_finalEvento;
    }
    public void setFinalEvento(LocalDateTime m_finalEvento) {
        this.m_finalEvento = m_finalEvento;
    }
    public LocalDateTime getMontaje() {
        return m_montaje;
    }
    public void setMntaje(LocalDateTime m_montaje) {
        this.m_montaje = m_montaje;
    }
    public LocalDateTime getDesmontaje() {
        return m_desmontaje;
    }
    public void setDesmontaje(LocalDateTime m_desmontaje) {
        this.m_desmontaje = m_desmontaje;
    }

}
