/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ZOO;

/**
 *
 * @author johan
 */
public class Prueba {
    public static void main(String[] args) {
        
        Zoologico chapultepec;
        
        chapultepec = new Zoologico();
        
        chapultepec.animales = new Animal[3];
        
        Animal a1 =  new Animal("Elefante");
        Animal a2 = new Animal("Gavilan");
        Animal a3 = new Animal("Lobo de siberia");
        
        chapultepec.animales[0] = a1;
        chapultepec.animales[1] = a2;
        chapultepec.animales[2] = a3;
        
        System.out.println("Aniamales en chapultepec: ");
        for(int i = 0; i < chapultepec.animales.length; i++){
            System.out.println("_ "+ chapultepec.animales[i].getNombre());
        }
        
    }
}
