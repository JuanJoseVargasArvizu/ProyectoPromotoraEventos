package com.promotoraEventos.InventarioYAgenda.Nucleo.Clases_Logica;

public class Cliente {
    private int m_id;
    private String m_nombre;
    private String m_contacto;
    private double m_descuentoEnDecimales;
    private int m_tipo;

    public Cliente(String nombre, String contacto, double descuentoEnDecimales, int tipo){
        this.m_nombre = nombre;
        this.m_contacto = contacto;
        this.m_descuentoEnDecimales = descuentoEnDecimales;
        this.m_tipo = tipo;     
    }

    public Cliente(){

    }

    public String getNombre() {
        return m_nombre;
    }

    public void setNombre(String m_nombre) {
        this.m_nombre = m_nombre;
    }

    public String getContacto() {
        return m_contacto;
    }

    public void setContacto(String m_contacto) {
        this.m_contacto = m_contacto;
    }

    public double getDescuentoEnDecimales() {
        return m_descuentoEnDecimales;
    }

    public void setDescuentoEnDecimales(double m_descuentoEnDecimales) {
        this.m_descuentoEnDecimales = m_descuentoEnDecimales;
    }

    public int getTipo(){
        return this.m_tipo;
    }
    
    public int getId(){
        return this.m_id;
    }

}
