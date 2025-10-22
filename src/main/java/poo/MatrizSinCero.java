/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author johan
 */
public class MatrizSinCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arrayListNumeros = new ArrayList<ArrayList<Integer>>();
        
        String nombreFichero = "numeros.txt";
        File fichero = new File(nombreFichero);
        Scanner s = null;
        
        try {
            System.out.println("... leemos el contenido del fichero ...");
            s = new Scanner(fichero);
            
            while(s.hasNextLine()){
                String linea = s.nextLine();
                String [] cortarString = linea.split( " ");
                ArrayList<Integer> numeros = new ArrayList<Integer>();
                
                for( int i=0; i<cortarString.length; i++){
                    numeros.add(Integer.parseInt(cortarString[i]));
                }
                
                arrayListNumeros.add(numeros);
            }
        } catch ( Exception e) {
            e.printStackTrace();
        } finally {
                try { if (s != null) s.close();} 
                catch (Exception e2) { e2.printStackTrace(); }
        }
        
        Iterator<ArrayList<Integer>> itrArrayListNumeros = arrayListNumeros.iterator();
        while(itrArrayListNumeros.hasNext()){
            ArrayList<Integer> numeros = itrArrayListNumeros.next();
            Iterator<Integer> itrNumeros = numeros.iterator();
            while(itrNumeros.hasNext()){
                int numero = itrNumeros.next();
                if (numero == 0 ) itrNumeros.remove();
            }
        }
        
        itrArrayListNumeros = arrayListNumeros.iterator();
        while(itrArrayListNumeros.hasNext()){
            ArrayList<Integer> numeros = itrArrayListNumeros.next();
            if (numeros.isEmpty()) itrArrayListNumeros.remove();
        }
        
        System.out.println("\n... Salida sin ceros ...");
        itrArrayListNumeros = arrayListNumeros.iterator();
        while(itrArrayListNumeros.hasNext()){
            ArrayList<Integer> numeros = itrArrayListNumeros.next();
            Iterator<Integer> itrNumeros = numeros.iterator();
            while(itrNumeros.hasNext()){
                int numero = itrNumeros.next();
                System.out.print(numero+" ");
            }
            System.out.println();
        }
    }
    
}
