package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.time.LocalDate;
import java.util.ArrayList;

public class ReporteMensualInventario {
    private LocalDate m_fecha;
    private ArrayList<Elemento> m_elementos;

    public LocalDate getFecha(){
        return m_fecha;
    }

    public ArrayList<Elemento> getElementos(){
        return m_elementos;
    }
}
