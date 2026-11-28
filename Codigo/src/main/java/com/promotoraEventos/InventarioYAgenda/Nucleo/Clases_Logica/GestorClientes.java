package com.promotoraEventos.InventarioYAgenda.Nucleo.Clases_Logica;

public class GestorClientes {

    
    public Cliente RegistrarNuevoCliente(String nombre, String contacto, double descuento, int tipo){
        Cliente nuevoCliente = new Cliente(nombre,contacto,descuento,tipo);
        return nuevoCliente;

    }

    public Cliente ActualizarDatosCliente(Cliente clienteActualizandose, String nombre, String contacto, double descuentoEnDecimales){

        
        if ( !(descuentoEnDecimales <= 1.0) && !(descuentoEnDecimales >= 0.0) ) {
        }else{
            throw new IllegalArgumentException("Descuento en decimales invalido");
        }

        clienteActualizandose.setDescuentoEnDecimales(descuentoEnDecimales);
        clienteActualizandose.setNombre(nombre);
        clienteActualizandose.setContacto(contacto);
        
        return clienteActualizandose;
    }

}
