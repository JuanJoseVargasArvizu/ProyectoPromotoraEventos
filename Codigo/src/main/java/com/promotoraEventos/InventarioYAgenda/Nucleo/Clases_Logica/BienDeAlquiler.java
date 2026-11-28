package com.promotoraEventos.InventarioYAgenda.Nucleo.Clases_Logica;

public class BienDeAlquiler {
    private String m_folio;
    private String m_modelo;
    private int m_clasificacion;
    private double m_precioRentaPorDia;
    private int m_estado;

    public String getFolio() {
        return m_folio;
    }
    public void setFolio(String m_folio) {
        this.m_folio = m_folio;
    }
    public String getModelo() {
        return m_modelo;
    }
    public void setModelo(String m_modelo) {
        this.m_modelo = m_modelo;
    }
    public int getClasificacion() {
        return m_clasificacion;
    }
    public void setClasificacion(int m_clasificacion) {
        this.m_clasificacion = m_clasificacion;
    }
    public double getPrecioRentaPorDia() {
        return m_precioRentaPorDia;
    }
    public void setPrecioRentaPorDia(double m_precioRentaPorDia) {
        this.m_precioRentaPorDia = m_precioRentaPorDia;
    }
    public int getEstado() {
        return m_estado;
    }
    public void setEstado(int m_estado) {
        this.m_estado = m_estado;
    }


    

}
