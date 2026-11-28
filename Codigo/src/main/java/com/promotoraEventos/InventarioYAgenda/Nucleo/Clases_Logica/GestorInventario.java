package com.promotoraEventos.InventarioYAgenda.Nucleo.Clases_Logica;



public class GestorInventario {
    public void RegistrarNuevoBienDeAlquiler(String modelo, int clasificacion, double precioRentaPorDia){
        
        if (!(clasificacion == 1) && !(clasificacion == 2) && !(clasificacion == 3) && !(clasificacion == 4) ) {
            throw new IllegalArgumentException("Categoria no valida");
        }

        if( precioRentaPorDia < 0){
            throw new IllegalArgumentException("Precio no valido");
        }

        BienDeAlquiler nuevoBien = new BienDeAlquiler();
        nuevoBien.setModelo(modelo);
        nuevoBien.setClasificacion(clasificacion);
        nuevoBien.setPrecioRentaPorDia(precioRentaPorDia);
        
        nuevoBien.setEstado(0);


    }

    public void ActualizarBienDeAlquiler(String folio, BienDeAlquiler bienActualizado) {

    }

    public void EliminarBienDeAlquiler(String folio){
        
    }

}
