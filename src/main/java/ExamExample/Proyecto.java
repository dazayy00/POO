/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamExample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johan
 */
public class Proyecto {
    private String nombre;
    private List<ItemEntrega> entregables;
    
    public Proyecto(String nombre){
        this.nombre = nombre;
        this.entregables = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarEntregable(ItemEntrega item){
        this.entregables.add(item);
    }

    @Override
    public String toString() {
         return nombre;
    }
    
    
}
