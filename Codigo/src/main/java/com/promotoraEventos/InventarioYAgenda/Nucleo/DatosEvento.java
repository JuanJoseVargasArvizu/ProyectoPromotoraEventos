package com.promotoraEventos.InventarioYAgenda.Nucleo;

public class DatosEvento {
    private String m_evento;
    private String m_direccion;
    
    public String getNombre(){
        return m_evento;
    }

    public String getDireccion(){
        return m_direccion;
    }

    public void setNombre(String nombre){
        this.m_evento = nombre;
    }

    public void setDireccion(String direccion){
        this.m_direccion = direccion;
    }
    
}
