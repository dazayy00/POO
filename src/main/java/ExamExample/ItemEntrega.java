/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamExample;

/**
 *
 * @author johan
 */
public class ItemEntrega {
    private String item;
    
    public ItemEntrega(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void Crear(){
        System.out.println("creando entregable "+ item);
    }
    
    public void Eliminar(){
        System.out.println("Eliminando entregable "+ item);
    }
    
    @Override
    public String toString() {
        return item;
    }
    
}
