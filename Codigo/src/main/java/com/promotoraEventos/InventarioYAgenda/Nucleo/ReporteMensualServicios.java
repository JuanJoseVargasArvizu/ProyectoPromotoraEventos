package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReporteMensualServicios {
    private LocalDate m_fecha;
    private ArrayList<RegistroServicioFinalizado> m_servicios;

    public LocalDate getFecha(){
        return m_fecha;
    }

    public ArrayList<RegistroServicioFinalizado> getServicios(){
        return m_servicios;
    }
}
