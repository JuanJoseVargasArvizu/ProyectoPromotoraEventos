package com.promotoraEventos.InventarioYAgenda.AccesoDB;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.promotoraEventos.InventarioYAgenda.Entidades.BienDeAlquilerEntidad;
import com.promotoraEventos.InventarioYAgenda.Entidades.ReporteDeDañosEntidad;
import com.promotoraEventos.InventarioYAgenda.Entidades.AtributosCompuestos.ID_ReporteDeDaños;
import com.promotoraEventos.InventarioYAgenda.Repository.BienDeAlquilerRepository;
import com.promotoraEventos.InventarioYAgenda.Repository.ReporteDeDañosRepository;

@Controller 
@RequestMapping(name = "/reporteDeDaños")
public class ReporteDeDañosController {
    
    @Autowired
    ReporteDeDañosRepository reporteDeDañosRepository;

    @Autowired 
    BienDeAlquilerRepository bienDeAlquilerRepository;

     @PostMapping(path="/agregar")
    public @ResponseBody boolean AgregarReporte(
/* */                                           @RequestParam Integer id,
/* */                                           @RequestParam String folioBien,
/* */                                           @RequestParam String evento,
/* */                                           @RequestParam LocalDate Fecha,
/* */                                           @RequestParam String descripcion){

        BienDeAlquilerEntidad bienDeAlquiler = bienDeAlquilerRepository.findById(folioBien)
        .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID: " + folioBien));

        ReporteDeDañosEntidad nuevoReporte = new ReporteDeDañosEntidad();

        nuevoReporte.setBienDeAlquiler(bienDeAlquiler);
        nuevoReporte.setId(id);
        nuevoReporte.setDescripcion(descripcion);
        nuevoReporte.setEvento(evento);
        nuevoReporte.setFecha(Fecha);

        return true;
    }

    @GetMapping(path="/obtenerTodos")
    public @ResponseBody Iterable<ReporteDeDañosEntidad> ObtenerReportes(){
        return reporteDeDañosRepository.findAll();
    } 

    @GetMapping(path="/obtenerPorId")
    public @ResponseBody ReporteDeDañosEntidad ObtenerReportePorId(@RequestParam Integer id, @RequestParam String folioBien){

        // Comprobacion de que el bien existe (POSIBIBILIDAD DE CREAR METODO ExisteBien(String folio) boolean )
        BienDeAlquilerEntidad bienDeAlquiler = bienDeAlquilerRepository.findById(folioBien)
        .orElseThrow(() -> new RuntimeException("Registro no encontrado con ID: " + folioBien));

        ID_ReporteDeDaños idReporte = new ID_ReporteDeDaños(id,folioBien);

        return reporteDeDañosRepository.findById(idReporte).orElse(null);
    }


}
