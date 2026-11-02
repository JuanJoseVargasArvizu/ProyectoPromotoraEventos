package com.promotoraEventos.InventarioYAgenda.Nucleo;

public class Elemento {

    enum EstadoElemento{
        DISPONIBLE, 
        MANTENIMIENTO, 
        OCUPADO
    }

    enum CategoriaElemento{
        MOBILIARIO,
        LUCES,
        COOLERS,
        SONIDO
    }

    private String m_folio;
    private String m_modelo;
    private CategoriaElemento m_categoria;
    private String m_descripcion;
    private EstadoElemento m_estado;
    private double m_costoPorDia;
    
    public Elemento(String folio, String modelo, CategoriaElemento categoria,
                    double costoPorDia){
        
        this.m_folio = folio;
        this.m_modelo = modelo;
        this.m_categoria = categoria;
        this.m_costoPorDia = costoPorDia;
        this.m_estado = EstadoElemento.DISPONIBLE;
    }

    public boolean EstaEnMantenimiento(){
        if(m_estado == EstadoElemento.MANTENIMIENTO){
            return true;
        }else{
            return false;
        }
    }

    public boolean EstaDisponible(){
        if(m_estado == EstadoElemento.DISPONIBLE){
            return true;
        }else{
            return false;
        }
    }

    public boolean EstaOcupado(){
        if(m_estado == EstadoElemento.OCUPADO){
            return true;
        }else{
            return false;
        }
    }

    public void PonerEnMantenimiento(){

        if (EstaOcupado()==true) {
            System.out.println("Esta ocupado");
        }else{
            this.m_estado = EstadoElemento.MANTENIMIENTO;
        }
    }

    public void EstablecerComoDisponible(){
        this.m_estado = EstadoElemento.DISPONIBLE;
    }

    public void EstablecerComoOcupado(){
        if (EstaEnMantenimiento() == true) {
            System.out.println("Esta en mantenimiento");
        }else{
            this.m_estado = EstadoElemento.OCUPADO;
        }
    }

    public String getFolio() {
        return m_folio;
    }
    
    public String getModelo() {
        return m_modelo;
    }
    public void setModelo(String modelo) {
        this.m_modelo = modelo;
    }
    public CategoriaElemento getCategoria() {
        return m_categoria;
    }
    public void setCategoria(CategoriaElemento categoria) {
        this.m_categoria = categoria;
    }
    public String getDescripcion() {
        return m_descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.m_descripcion = descripcion;
    }

    public double getCostoPorDia() {
        return m_costoPorDia;
    }
    
    public void setCostoPorDia(double costoPorDia) {
        if(costoPorDia>0){
            this.m_costoPorDia = costoPorDia;
        }
    }
}