package com.promotoraEventos.InventarioYAgenda.AccesoDB;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.promotoraEventos.InventarioYAgenda.Entidades.BienDeAlquilerEntidad;
import com.promotoraEventos.InventarioYAgenda.Entidades.BienesPrestados_ServicioDeRenta;
import com.promotoraEventos.InventarioYAgenda.Entidades.ClienteEntidad;
import com.promotoraEventos.InventarioYAgenda.Entidades.RegistroServicioDeRentaEntidad;
import com.promotoraEventos.InventarioYAgenda.Entidades.TarifasExtras;
import com.promotoraEventos.InventarioYAgenda.Repository.BienDeAlquilerRepository;
import com.promotoraEventos.InventarioYAgenda.Repository.BienesPrestados_ServicioDeRentaRepository;
import com.promotoraEventos.InventarioYAgenda.Repository.RegistroServicioDeRentaRepository;
import com.promotoraEventos.InventarioYAgenda.Repository.TarifasExtrasRepository;

@Controller 
@RequestMapping("/registroRenta")
public class RegistroDeRentaController {
    @Autowired
    private RegistroServicioDeRentaRepository registroServicioDeRentaRepository;

    @Autowired 
    private BienesPrestados_ServicioDeRentaRepository bienesPrestados_ServicioDeRentaRepository;

    @Autowired 
    private TarifasExtrasRepository tarifasExtrasRepository;

    @Autowired 
    private BienDeAlquilerRepository bienDeAlquilerRepository;
    
    @PostMapping(path="/agregar")
    public @ResponseBody boolean AgregarRegistro(
/* */                                           @RequestParam ClienteEntidad cliente,
/* */                                           @RequestParam String nombreEvento,
/* */                                           @RequestParam LocalDateTime inicioEvento,
/* */                                           @RequestParam LocalDateTime finalEvento,
/* */                                           @RequestParam LocalDateTime montaje,
/* */                                           @RequestParam LocalDateTime desmontaje,
/* */                                           @RequestParam Double tarifaOperativa){

        RegistroServicioDeRentaEntidad nuevoRegistro = new RegistroServicioDeRentaEntidad();
        nuevoRegistro.setCliente(cliente);
        nuevoRegistro.setEvento(nombreEvento);
        nuevoRegistro.setInicioEvento(inicioEvento);
        nuevoRegistro.setFinalEvento(finalEvento);
        nuevoRegistro.setMontaje(montaje);
        nuevoRegistro.setDesmontaje(desmontaje);
        nuevoRegistro.setTarifaOperativa(tarifaOperativa);
        registroServicioDeRentaRepository.save(nuevoRegistro);

        return true;
    }

    @GetMapping(path="/obtenerTodos")
    public @ResponseBody Iterable<RegistroServicioDeRentaEntidad> ObtenerRegistros(){
        return registroServicioDeRentaRepository.findAll();
    } 

    @GetMapping(path="/obtenerPorId")
    public @ResponseBody RegistroServicioDeRentaEntidad ObtenerRegistroPorId(@RequestParam Integer id){
        return registroServicioDeRentaRepository.findById(id).orElse(null);
    }

    @PostMapping(path="/agregarTarifaExtra")
    public @ResponseBody boolean AgregarTarifaExtra(@RequestParam Integer idRegistro,
                                                    @RequestParam Integer discriminante,
        /* */                                      @RequestParam Double tarifa){

        RegistroServicioDeRentaEntidad registro = registroServicioDeRentaRepository.findById(idRegistro)
        .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID: " + idRegistro));

        TarifasExtras tarifaExtra = new TarifasExtras();
        tarifaExtra.setRegistroServicioDeRentaEntidad(registro);
        tarifaExtra.setDiscriminante(discriminante);
        tarifaExtra.setTarifa(tarifa);

        tarifasExtrasRepository.save(tarifaExtra);
        return true;
    }

    @PostMapping(path = "/agregarBienPrestado")
    public @ResponseBody boolean AgregarBienPrestadoPorFolio(@RequestParam Integer idRegistro,@RequestParam String folio){
        
        RegistroServicioDeRentaEntidad registro = registroServicioDeRentaRepository.findById(idRegistro)
        .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID: " + idRegistro));

        BienDeAlquilerEntidad bienPrestado = bienDeAlquilerRepository.findById(folio)
        .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID: " + idRegistro));

        BienesPrestados_ServicioDeRenta nuevoBienPrestado = new BienesPrestados_ServicioDeRenta();
        nuevoBienPrestado.setBienDeAlquiler(bienPrestado);
        nuevoBienPrestado.setIdRegistro(registro);
        bienesPrestados_ServicioDeRentaRepository.save(nuevoBienPrestado);

        return true;
    }

}
