package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.util.ArrayList;
import java.time.LocalDate;

public class ReporteMensualDeDaños {
    private LocalDate m_fecha;
    private ArrayList<RegistroDeDaños> m_reportes;

    public LocalDate getFecha(){
        return m_fecha;
    }

    public ArrayList<RegistroDeDaños> getReportes(){
        return m_reportes;
    }

}
