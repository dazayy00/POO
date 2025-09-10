/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daz.oi.poo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author johan
 */
public class ArrayL {

    public static void main(String[] args) {
        ArrayList<String> nombreArrayList = new ArrayList<String>();

        for (int i=1; i<=10; i++){
            nombreArrayList.add("Elemento "+i); 
        }

        nombreArrayList.add(2, "Elemento 3");

        Iterator<String> nombreIterator = nombreArrayList.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento+" / ");
        }

        int numElementos = nombreArrayList.size();
        System.out.println("\n\nEl ArrayList tiene "+numElementos+" elementos");

        System.out.println("\n... Eliminamos el primer elemento del ArrayList ("+nombreArrayList.get(0)+")...");
        nombreArrayList.remove(0);

        System.out.println("\n... Eliminamos los elementos de ArrayList que sean iguales a \"Elemento 3\" ...");
        nombreIterator = nombreArrayList.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            if(elemento.equals("Elemento 3"))
                nombreIterator.remove(); 
        }

        System.out.println("\nImprimimos los elementos del ArrayList tras realizar las eliminaciones: ");
        nombreIterator = nombreArrayList.iterator();
        while(nombreIterator.hasNext()){
            String elemento = nombreIterator.next();
            System.out.print(elemento+" / ");
        }

        numElementos = nombreArrayList.size();
        System.out.println("\nNumero de elementos del ArrayList tras las eliminaciones = "+numElementos);

    }
    
}
