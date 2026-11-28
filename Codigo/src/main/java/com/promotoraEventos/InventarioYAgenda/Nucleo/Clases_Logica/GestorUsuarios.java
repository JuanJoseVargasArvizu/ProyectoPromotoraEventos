package com.promotoraEventos.InventarioYAgenda.Nucleo.Clases_Logica;



public class GestorUsuarios {

    public Usuario CrearUsuario(String nombre, String contraseña, String rol){
        
        if ( !(rol == "Administrador") && !(rol == "Tele operador") && !(rol == "Empleado") ) {
            throw new IllegalArgumentException("Rol no valido");
        }

        Usuario nuevoUsuario = new Usuario();
        nuevoUsuario.setNombre(nombre);
        nuevoUsuario.setRol(rol);
        nuevoUsuario.setContraseña(contraseña);

        return nuevoUsuario;
    }

    public boolean EliminarUsuario(Usuario usuario){
        if (usuario.getRol() == "Administrador") {
            return  false;
        }

        return true;

    }

    public Usuario ActualizarUsuario(Usuario usuarioActualizandose, String nombre, String contraseña, String rol){
        
        if ( !(rol == "Administrador") && !(rol == "Tele operador") && !(rol == "Empleado") ) {
            throw new IllegalArgumentException("Rol no valido");
        }
        
        usuarioActualizandose.setNombre(nombre);
        usuarioActualizandose.setContraseña(contraseña);
        usuarioActualizandose.setRol(rol);
        return usuarioActualizandose;
    }

}
