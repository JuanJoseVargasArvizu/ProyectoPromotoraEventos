package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Servicio {
    private boolean m_confirmada;
    private String m_nombreCliente;
    private DatosEvento m_datosDelEvento;
    private HorariosServicio m_horarios;
    private Costos m_costos;

    public String getNombreCliente(){
        return m_nombreCliente;
    }

    public String getNombreEvento(){
        return m_datosDelEvento.getNombre();
    }

    public String getDireccion(){
        return m_datosDelEvento.getDireccion();
    }

    public LocalDateTime getFechaYHoraEvento(){
        return m_horarios.getInicioEvento();
    }

    public LocalDateTime getFechayHoraFinalizacionEvento(){
        return m_horarios.getFinalEvento();
    }

    public LocalDateTime getHoraMontaje(){
        return m_horarios.getMontaje();
    }

    public LocalDateTime getHoraDesmontaje(){
        return m_horarios.getDesmontaje();
    }

    public double getDescuentoEnDecimales(){
        return m_costos.getDescuentoEnDecimales();
    }

    public double getCostoOperativo(){
        return m_costos.ObtenerCostoOperativo();
    }

    public ArrayList<Double> getCostosExtra(){
        return m_costos.getCostosExtras();
    }

    public ArrayList<String> getPersonalContratado(){
        return m_costos.getPersonalContratado();
    }

    public ArrayList<Elemento> getElementosPrestados(){
        return m_costos.getElementosPrestados();
    }

}
