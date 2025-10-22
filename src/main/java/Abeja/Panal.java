/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abeja;

/**
 *
 * @author johan
 */
public class Panal {
    public Abeja enjambre [];
    
    public Panal() {
        enjambre = new Abeja[2];
        
        enjambre[0] = new Abeja("Barry");
        enjambre[1] = new Abeja("Adam");    
    }
   
    public void mostrarAbejas(){
           System.out.println("Abejas en el panal:");
           for(int i = 0; i < enjambre.length; i++){
               System.out.println("- "+ enjambre[i].getNombre());
           }
    }
}
