package com.promotoraEventos.InventarioYAgenda.Nucleo;

public class Cliente {
    
    enum ClienteTipo{
        FISCAL,
        PRIVADO,
        INFORMAL
    }
    
    private String m_nombre;
    private String m_contacto;
    private ClienteTipo m_tipo;
    private double m_descuentoEnDecimales;
    
    public Cliente(String nombre, String contacto, ClienteTipo tipo, double descuento){
        this.m_nombre = nombre;
        this.m_contacto = contacto;
        this.m_tipo = tipo;
        this.m_descuentoEnDecimales = descuento;
    }

    public String getNombre(){
        return m_nombre;
    }

    public String getContacto(){
        return m_contacto;
    }

    public ClienteTipo getTipo(){
        return m_tipo;
    }

    public double getDescuentoEnDecimales(){
        return m_descuentoEnDecimales;
    }

    public void setNombre(String nombre){
        this.m_nombre = nombre;
    }

    public void setContacto(String contacto){
        this.m_contacto = contacto;
    }

    public void setTipo(ClienteTipo tipo){
        this.m_tipo = tipo;
    }

    public void setDescuentoEnDecimales(double descuento){
        if( (descuento <= 1) && (descuento >= 0) ){
            setDescuentoEnDecimales(descuento);
        }
    }
}
