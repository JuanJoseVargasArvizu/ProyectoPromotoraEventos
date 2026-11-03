package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.util.ArrayList;

public class RegistroServicioFinalizado {
    private String m_nombreCliente;
    private DatosEvento m_datosDelEvento;
    private Costos m_costos;

    public String getNombreCliente(){
        return m_nombreCliente;
    }

    public String ObtenerNombreEvento(){
        return m_datosDelEvento.getNombre();
    }

    public String ObtenerDireccionEvento(){
        return m_datosDelEvento.getDireccion();
    }

    public ArrayList<String> ObtenerPersonalContratado(){
        return m_costos.getPersonalContratado();
    }

    public ArrayList<String> ObtenerMatriculasVehiculos(){
        return m_costos.getMatriculasVehiculos();
    }

    public ArrayList<String> getPersonalContratado(){
        return m_costos.getPersonalContratado();
    }

    public ArrayList<Elemento> getElementosPrestados(){
        return m_costos.getElementosPrestados();
    }

    public double ObtenerDescuentoEnDecimales(){
        return m_costos.getDescuentoEnDecimales();
    }

    public double ObtenerCostoPorElementosPrestados(){
        return m_costos.ObtenerCostoPorElementosPrestados();
    }

    public double ObtenerCostoOperativo(){
        return m_costos.ObtenerCostoOperativo();
    }

    public double ObtenerTotalCostosExtras(){
        return m_costos.TotalCostosExtra();
    }

    public double ObtenerCostoTotalSinDescuento(){
        return m_costos.CostoTotalSinDescuento();
    }

    public double ObtenerCostoTotalConDescuento(){
        return m_costos.CostoTotalConDescuento();
    }

}
