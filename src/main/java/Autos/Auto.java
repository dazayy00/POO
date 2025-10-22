/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autos;

import java.util.List;

/**
 *
 * @author johan
 */
public class Auto {
    private Long id;
    private String marca;
    private String modelo;
    //private Propietario prop;
    private List<Propietario> ListaPropietarios;
    
    public Auto(){
        
    }
    
    /*public Auto(Long id, String marca, String modelo, Propietario prop){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
    }*/
    
    public Auto(Long id, String marca, String modelo, List<Propietario> ListaPropietarios){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ListaPropietarios = ListaPropietarios;
    }
    
    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    
    public String getMarca(){
        return marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getModelo(){
        return modelo;
    }
     
    public void setModelo(String modelo){
         this.modelo = modelo;
    }
    
    public List<Propietario> getListaPropietarios(){
        return ListaPropietarios;
    }
    
    public void setListaPropietarios(List<Propietario> ListaPropietarios){
        this.ListaPropietarios = ListaPropietarios;
    }
    
    @Override
    public String toString(){
        return "Auto {" +
               "id- "+ id +
               "marca- "+ marca +
               "modelo- " + modelo +
               "ListaPropietarios- "+ ListaPropietarios +
               "}";
    }
    
    /*
     public Propietario getProp(){
        return prop;
    }
     
     public void setProp(Propitario prop){
        this.prop = prop;
     }
     */
}
