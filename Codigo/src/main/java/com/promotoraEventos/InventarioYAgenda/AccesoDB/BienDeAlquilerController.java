package com.promotoraEventos.InventarioYAgenda.AccesoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.promotoraEventos.InventarioYAgenda.Entidades.BienDeAlquilerEntidad;
import com.promotoraEventos.InventarioYAgenda.Repository.BienDeAlquilerRepository;

@Controller
@RequestMapping(path = "/bienDeAlquiler") 
public class BienDeAlquilerController  {
    
    @Autowired
    private BienDeAlquilerRepository bienDeAlquilerRepository;

    @PostMapping(path="/agregar")
    public @ResponseBody boolean AgregarBienDeAlquiler(@RequestParam String folio,
/* */                                           @RequestParam String modelo,
/* */                                           @RequestParam Integer clasificacion,
/* */                                           @RequestParam Double precioRentaPorDia){
        
        BienDeAlquilerEntidad nuevoBienDeAlquiler = new BienDeAlquilerEntidad();

        nuevoBienDeAlquiler.setFolio(folio);
        nuevoBienDeAlquiler.setModelo(modelo);
        nuevoBienDeAlquiler.setClasificacion(clasificacion);
        nuevoBienDeAlquiler.setPrecioRentaPorDia(precioRentaPorDia);
        nuevoBienDeAlquiler.setEstado(1);

        return true;
    }

    @GetMapping(path="/obtenerTodos")
    public @ResponseBody Iterable<BienDeAlquilerEntidad> ObtenerBienes(){
        return bienDeAlquilerRepository.findAll();
    } 

    @GetMapping(path="/obtenerPorId")
    public @ResponseBody BienDeAlquilerEntidad ObtenerBienPorId(@RequestParam String id){
        return bienDeAlquilerRepository.findById(id).orElse(null);
    }

}
