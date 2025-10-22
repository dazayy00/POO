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
public class PartidoFutbol0 {

    public static void main(String[] args) {
        System.out.println("... Nos creamos un ArrayList de objetos de la Clase PartidoFutbol ...");
        ArrayList<PartidoFutbol> partidos = new ArrayList<PartidoFutbol>();

        String nombreFichero = "partidos.txt";
        File fichero = new File(nombreFichero);
        Scanner s = null;

        try {
            System.out.println("... Leemos el contenido del fichero ...");
            s = new Scanner(fichero);

            while (s.hasNextLine()) {
                String linea = s.nextLine(); 
                String [] cortarString = linea.split("::");  
                PartidoFutbol partido = new PartidoFutbol(); 

                partido.setEquipoLocal(cortarString[0]);
                partido.setEquipoVisitante(cortarString[1]);
                partido.setGolesLocal(Integer.parseInt(cortarString[2]));
                partido.setGolesVisitante(Integer.parseInt(cortarString[3]));

                partidos.add(partido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try { if (s != null) s.close(); } 
            catch (Exception e2) { e2.printStackTrace(); }
        }

        System.out.println("... Guardados "+partidos.size()+" partidos de fútbol  ...");

        System.out.println("\n... Resultados de los partidos de Futbol ...");
        Iterator<PartidoFutbol> itrPartidos = partidos.iterator();
        while(itrPartidos.hasNext()){
            PartidoFutbol partido = itrPartidos.next();
            System.out.println(partido.getEquipoLocal() + " "
                + partido.getGolesLocal() + "-"
                + partido.getGolesVisitante() + " "
                + partido.getEquipoVisitante());
        }

        System.out.println("\n... Eliminamos los partidos de futbol cuyo resultado no sea un empate ...");
        itrPartidos = partidos.iterator();
        while(itrPartidos.hasNext()){
            PartidoFutbol partido = itrPartidos.next();
            if(partido.getGolesLocal() != partido.getGolesVisitante())
               itrPartidos.remove();
        }

        System.out.println("\n... Resultados de los partidos de Futbol con empate ...");
        itrPartidos = partidos.iterator();
        while(itrPartidos.hasNext()){
            PartidoFutbol partido = itrPartidos.next();
            System.out.println(partido.getEquipoLocal() + " "
                + partido.getGolesLocal() + "-"
                + partido.getGolesVisitante() + " "
                + partido.getEquipoVisitante());
        }

    }
    
}
