/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Autos;

/**
 *
 * @author johan
 */
public class Auto {
    private Long id;
    private String marca;
    private String modelo;
    //private Propietario prop;
    
    public Auto(){
        
    }
    
    /*public Auto(Long id, String marca, String modelo, Propietario prop){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.prop = prop;
    }*/
    
    public Auto(Long id, String marca, String modelo){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Long getId(){
        return id;
    }
    
    public String marca(){
        return marca;
    }
    
    public String modelo(){
        return modelo;
    }
    
    /*public Propietario getProp(){
        return prop;
    }*/
}
