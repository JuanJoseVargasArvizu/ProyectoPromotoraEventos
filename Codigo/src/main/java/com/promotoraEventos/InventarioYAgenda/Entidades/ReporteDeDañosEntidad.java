package com.promotoraEventos.InventarioYAgenda.Entidades;

import java.time.LocalDate;

import com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos.ID_ReporteDeDaños;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
@IdClass(ID_ReporteDeDaños.class)
public class ReporteDeDañosEntidad {
    
    @Id 
    private Integer id;

    @Id 
    @ManyToOne 
    @JoinColumn(name = "folio") 
    private BienDeAlquilerEntidad bienDeAlquiler;
    
    private LocalDate fecha;
    private String descripcion;
    private String evento;

    public ReporteDeDañosEntidad() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BienDeAlquilerEntidad getBienDeAlquiler() {
        return bienDeAlquiler;
    }

    public void setBienDeAlquiler(BienDeAlquilerEntidad bienDeAlquiler) {
        this.bienDeAlquiler = bienDeAlquiler;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    
    

}
