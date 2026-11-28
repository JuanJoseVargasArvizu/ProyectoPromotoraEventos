package com.promotoraEventos.InventarioYAgenda.Nucleo.Clases_Logica;

import java.util.ArrayList;

public class RegistroServicioDeRenta {
    private int m_id;
    private String m_nombreCliente;
    private String m_nombreEvento;
    private ArrayList<String> m_foliosBienes;
    private Horarios m_horarios;
    private Tarifas m_tarifas;

    public int getId() {
        return m_id;
    }
    public void setId(int m_id) {
        this.m_id = m_id;
    }
    public String getNombreCliente() {
        return m_nombreCliente;
    }
    public void setNombreCliente(String m_nombreCliente) {
        this.m_nombreCliente = m_nombreCliente;
    }
    public String getNombreEvento() {
        return m_nombreEvento;
    }
    public void setNombreEvento(String m_nombreEvento) {
        this.m_nombreEvento = m_nombreEvento;
    }
    public ArrayList<String> getFoliosBienes() {
        return m_foliosBienes;
    }
    public void setFoliosBienes(ArrayList<String> m_foliosBienes) {
        this.m_foliosBienes = m_foliosBienes;
    }
    public Horarios getHorarios() {
        return m_horarios;
    }
    public void setHorarios(Horarios m_horarios) {
        this.m_horarios = m_horarios;
    }
    public Tarifas getTarifas() {
        return m_tarifas;
    }
    public void setTarifas(Tarifas m_tarifas) {
        this.m_tarifas = m_tarifas;
    }

    
}
