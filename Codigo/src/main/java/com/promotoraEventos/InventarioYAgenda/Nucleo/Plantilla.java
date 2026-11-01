package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.util.ArrayList;

public class Plantilla {
    private String m_nombrePlantilla;
    private ArrayList<String> m_elementosPorNombreDeModelo;
    
    public void AgregarElemento(String nombreModelo){
        if (!(m_elementosPorNombreDeModelo.contains(nombreModelo))) {
            m_elementosPorNombreDeModelo.add(nombreModelo);
        }
    }

    public void EliminarElemento(String nombreModelo){
        if (m_elementosPorNombreDeModelo.contains(nombreModelo)) {
            m_elementosPorNombreDeModelo.remove(nombreModelo);
        }
    }

    public void setNombrePlantilla(String nombre){
        this.m_nombrePlantilla = nombre;
    }

    public String getNombrePlantilla(){
        return m_nombrePlantilla;
    }

    public ArrayList<String> getNombresModelos(){
        return m_elementosPorNombreDeModelo;
    }

}
