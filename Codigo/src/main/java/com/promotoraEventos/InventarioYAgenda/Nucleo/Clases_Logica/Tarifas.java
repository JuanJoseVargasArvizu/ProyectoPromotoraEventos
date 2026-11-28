package com.promotoraEventos.InventarioYAgenda.Nucleo.Clases_Logica;

import java.util.ArrayList;

public class Tarifas {
    private ArrayList<Double> m_tarifasExtras;
    private double m_tarifaOperativa;

    public ArrayList<Double> getTarifasExtras() {
        return m_tarifasExtras;
    }
    public void setTarifasExtras(ArrayList<Double> m_tarifasExtras) {
        this.m_tarifasExtras = m_tarifasExtras;
    }
    public double getTarifaOperativa() {
        return m_tarifaOperativa;
    }
    public void setTarifaOperativa(double m_tarifaOperativa) {
        this.m_tarifaOperativa = m_tarifaOperativa;
    }

    

}
