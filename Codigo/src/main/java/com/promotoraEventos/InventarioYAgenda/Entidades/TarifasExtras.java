package com.promotoraEventos.InventarioYAgenda.Entidades;

import java.io.Serializable;

import com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos.ID_TarifasExtras;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
@IdClass(ID_TarifasExtras.class) 
public class TarifasExtras implements Serializable{
    @Id 
    @ManyToOne 
    @JoinColumn(name="id") 
    private RegistroServicioDeRentaEntidad registroServicioDeRentaEntidad;

    @Id 
    private Integer discriminante;

    private Double tarifa;

    public TarifasExtras(){}

    public RegistroServicioDeRentaEntidad getRegistroServicioDeRentaEntidad() {
        return registroServicioDeRentaEntidad;
    }

    public void setRegistroServicioDeRentaEntidad(RegistroServicioDeRentaEntidad registroServicioDeRentaEntidad) {
        this.registroServicioDeRentaEntidad = registroServicioDeRentaEntidad;
    }

    public Integer getDiscriminante() {
        return discriminante;
    }

    public void setDiscriminante(Integer discriminante) {
        this.discriminante = discriminante;
    }

    public Double getTarifa() {
        return tarifa;
    }

    public void setTarifa(Double tarifa) {
        this.tarifa = tarifa;
    }

    
    



}
