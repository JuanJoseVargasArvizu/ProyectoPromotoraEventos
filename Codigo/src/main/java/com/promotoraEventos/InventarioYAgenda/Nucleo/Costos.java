package com.promotoraEventos.InventarioYAgenda.Nucleo;

import java.util.ArrayList;


public class Costos {
    private ArrayList<String> m_personalContratado;
    private ArrayList<String> m_matriculasVehiculosAUsar;
    private ArrayList<Double> m_costosExtra;
    private ArrayList<Elemento> m_elementosPrestados;
    private double m_descuentoEnDecimales;
    private double m_costoOperativo;

    public double getDescuentoEnDecimales(){
        return m_descuentoEnDecimales;
    }

    public ArrayList<String> getPersonalContratado(){
        return m_personalContratado;
    }

    public ArrayList<String> getMatriculasVehiculos(){
        return m_matriculasVehiculosAUsar;
    }

    public ArrayList<Elemento> getElementosPrestados(){
        return m_elementosPrestados;
    }

    public double ObtenerCostoPorElementosPrestados(){
        ArrayList<Elemento> elementosPrestados = m_elementosPrestados;

        double costoTotalPorElementos = 0;
        for (int i = 0; i < (elementosPrestados.size() - 1); i++){
            Elemento elementoPrestado = elementosPrestados.get(i);
            costoTotalPorElementos = costoTotalPorElementos + elementoPrestado.getCostoPorDia();
        }

        return costoTotalPorElementos;
    }

    public double ObtenerCostoOperativo(){
        return m_costoOperativo;
    }

    public double TotalCostosExtra(){
        double totalCostosExtra = 0;
        ArrayList<Double> CostosExtra = m_costosExtra;
        
        for(int i = 0; i<= ( m_costosExtra.size() - 1 ) ; i++){
            totalCostosExtra = totalCostosExtra + CostosExtra.get(i);
        }

        return totalCostosExtra;
    }

    public double CostoTotalSinDescuento(){
        double costoTotalSinDescuento = m_costoOperativo + TotalCostosExtra();
        return costoTotalSinDescuento;
    }

    public double CostoTotalConDescuento(){
        double costoTotalSinDescuento = CostoTotalSinDescuento();
        double costoTotalConDescuento = costoTotalSinDescuento - (costoTotalSinDescuento * m_descuentoEnDecimales);
        
        return  costoTotalConDescuento;
    }

}
