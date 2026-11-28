package com.promotoraEventos.InventarioYAgenda.AccesoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.promotoraEventos.InventarioYAgenda.Entidades.ClienteEntidad;
import com.promotoraEventos.InventarioYAgenda.Repository.ClienteRepository;

@Controller 
@RequestMapping(path="/cliente") 
public class ClienteController {
    
    @Autowired 
    private ClienteRepository clienteRepository;

    @PostMapping(path="/agregar")
    public @ResponseBody boolean AgregarCliente(@RequestParam String nombre,
/* */                                           @RequestParam String contacto,
/* */                                           @RequestParam double descuentoEnDecimales,
/* */                                           @RequestParam int tipo){
        ClienteEntidad nuevoCliente = new ClienteEntidad();
        nuevoCliente.setNombre(nombre);
        nuevoCliente.setContacto(contacto);
        nuevoCliente.setDescuentoEnDecimales(descuentoEnDecimales);
        clienteRepository.save(nuevoCliente);
        return true;
    }

    @GetMapping(path="/obtenerTodos")
    public @ResponseBody Iterable<ClienteEntidad> ObtenerClientes(){
        return clienteRepository.findAll();
    } 

    @GetMapping(path="/obtenerPorId")
    public @ResponseBody ClienteEntidad ObtenerClientePorId(@RequestParam Integer id){
        return clienteRepository.findById(id).orElse(null);
    }

}
