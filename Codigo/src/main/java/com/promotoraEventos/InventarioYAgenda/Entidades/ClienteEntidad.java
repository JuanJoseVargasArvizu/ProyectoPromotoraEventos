package com.promotoraEventos.InventarioYAgenda.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class ClienteEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombre;
    private String contacto;
    private double descuentoEnDecimales;
    private int tipo;

    public ClienteEntidad(){}

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String name) {
        this.nombre = name;
    }
    public String getContacto() {
        return contacto;
    }
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    public double getDescuentoEnDecimales() {
        return descuentoEnDecimales;
    }
    public void setDescuentoEnDecimales(double descuentoEnDecimales) {
        this.descuentoEnDecimales = descuentoEnDecimales;
    }
    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    

}
