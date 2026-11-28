package com.promotoraEventos.InventarioYAgenda.Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class UsuarioEntidad {
    
    @Id
    private String nombre;
    private String contraseña;
    private String rol;

    public UsuarioEntidad(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    

}
