/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Autos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public class Main {

    public static void main(String[] args) {
        Auto aut = new Auto ();
        
        aut.setId(1L);
        aut.setMarca("Renault");
        aut.setModelo("Duster");
        
        List<Propietario> listaPropietarios = new ArrayList<Propietario> ();
        
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        Propietario prop3 = new Propietario();
        
        prop1.setId(35L);
        prop1.setNombre("Johan");
        prop1.setApellido("Baltazar");
        
        prop2.setId(36L);
        prop2.setNombre("Valeria");
        prop2.setApellido("Rivera");
        
        prop3.setId(37L);
        prop3.setNombre("David");
        prop3.setApellido("Trinidad");
        
        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        listaPropietarios.add(prop3);
        
        aut.setListaPropietarios(listaPropietarios);
        
        System.out.println("el auto: "+ aut.getMarca() + " " + aut.getModelo() + 
                " Tiene como propietarios a:"+ aut.getListaPropietarios().toString());
    }
    
}
