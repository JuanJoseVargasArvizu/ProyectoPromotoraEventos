package com.promotoraEventos.InventarioYAgenda.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class BienDeAlquilerEntidad {
    @Id 
    private String folio;

    private String modelo;
    private Integer clasificacion;
    private Double precioRentaPorDia;
    private Integer estado;
    
    public BienDeAlquilerEntidad() {
    }

    public String getFolio() {
        return folio;
    }

    public void setFolio(String folio) {
        this.folio = folio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Integer clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Double getPrecioRentaPorDia() {
        return precioRentaPorDia;
    }

    public void setPrecioRentaPorDia(Double precioRentaPorDia) {
        this.precioRentaPorDia = precioRentaPorDia;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    

}
