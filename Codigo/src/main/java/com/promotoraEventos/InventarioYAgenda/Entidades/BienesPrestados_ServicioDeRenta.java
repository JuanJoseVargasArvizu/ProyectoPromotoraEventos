package com.promotoraEventos.InventarioYAgenda.Entidades;

import com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos.ID_BienesPrestados_ServicioDeRenta;

import jakarta.persistence.Entity;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Id;

@Entity 
@IdClass(ID_BienesPrestados_ServicioDeRenta.class)
public class BienesPrestados_ServicioDeRenta{
    @Id
    @ManyToMany
    @JoinColumn(name="id")
    private RegistroServicioDeRentaEntidad idRegistro;
    
    @Id
    @ManyToMany 
    @JoinColumn(name = "folio")
    private BienDeAlquilerEntidad bienDeAlquiler;


    public BienesPrestados_ServicioDeRenta(){}

    public RegistroServicioDeRentaEntidad getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(RegistroServicioDeRentaEntidad idRegistro) {
        this.idRegistro = idRegistro;
    }

    public BienDeAlquilerEntidad getBienDeAlquiler() {
        return bienDeAlquiler;
    }

    public void setBienDeAlquiler(BienDeAlquilerEntidad bienDeAlquiler) {
        this.bienDeAlquiler = bienDeAlquiler;
    }

    
    
    
    
}
