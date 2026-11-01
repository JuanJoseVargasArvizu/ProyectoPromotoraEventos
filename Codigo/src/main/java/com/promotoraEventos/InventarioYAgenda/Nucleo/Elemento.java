package com.promotoraEventos.InventarioYAgenda.Nucleo;

public class Elemento {
    private String m_folio;
    private String m_modelo;
    private String m_categoria;
    private String m_descripcion;
    private String m_estado;
    private double m_costoPorDia;
    
    public void PonerEnMantenimiento(){
        this.m_estado = "Mantenimiento";
    }

    public void EstablecerComoDisponible(){
        this.m_estado = "Disponible";
    }

    public void EstablecerComoOcupado(){
        this.m_estado = "Ocupado";
    }

    public String getFolio() {
        return m_folio;
    }
    
    public String getModelo() {
        return m_modelo;
    }
    public void setModelo(String modelo) {
        this.m_modelo = modelo;
    }
    public String getCategoria() {
        return m_categoria;
    }
    public void setCategoria(String categoria) {
        this.m_categoria = categoria;
    }
    public String getDescripcion() {
        return m_descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.m_descripcion = descripcion;
    }

    public double getCostoPorDia() {
        return m_costoPorDia;
    }
    
    public void setCostoPorDia(double costoPorDia) {
        if(costoPorDia>0){
            this.m_costoPorDia = costoPorDia;
        }
    }
}
