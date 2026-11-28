package com.promotoraEventos.InventarioYAgenda.Entidades;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity 
public class RegistroServicioDeRentaEntidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne 
    @JoinColumn(name= "nombre")
    private ClienteEntidad cliente;
    
    private String evento;
    private LocalDateTime inicioEvento;
    private LocalDateTime finalEvento;
    private LocalDateTime montaje;
    private LocalDateTime desmontaje;
    private Double tarifaOperativa;

    public RegistroServicioDeRentaEntidad(){
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad cliente) {
        this.cliente = cliente;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public LocalDateTime getInicioEvento() {
        return inicioEvento;
    }

    public void setInicioEvento(LocalDateTime inicioEvento) {
        this.inicioEvento = inicioEvento;
    }

    public LocalDateTime getMontaje() {
        return montaje;
    }

    public void setMontaje(LocalDateTime montaje) {
        this.montaje = montaje;
    }

    public LocalDateTime getDesmontaje() {
        return desmontaje;
    }

    public void setDesmontaje(LocalDateTime desmontaje) {
        this.desmontaje = desmontaje;
    }

    public Double getTarifaOperativa() {
        return tarifaOperativa;
    }

    public void setTarifaOperativa(Double tarifaOperativa) {
        this.tarifaOperativa = tarifaOperativa;
    }



    public LocalDateTime getFinalEvento() {
        return finalEvento;
    }



    public void setFinalEvento(LocalDateTime finalEvento) {
        this.finalEvento = finalEvento;
    }

    
    

}
