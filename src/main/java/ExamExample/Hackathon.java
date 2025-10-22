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
public class Hackathon {
    private String nombre;
    private String sede;
    
    private final List<Patrocinador> patrocinadores;
    private final List<Equipo> equipos;
    
    public Hackathon(String nombre, String sede){
        this.nombre = nombre;
        this.sede = sede;
        this.patrocinadores = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getSede(){
        return sede;
    }
    
    public void setSede(String sede){
        this.sede = sede;
    }
    
    public void IniciarTorneo(){
        System.out.println("El torneo inicio");
    }
    
    public void agregarPatrocinador(String nombre, String recurso, String premio, String servicio){
        Patrocinador nuevoPatrocinador = new Patrocinador(nombre, recurso, premio, servicio);
        this.patrocinadores.add(nuevoPatrocinador);
    }
    
    public void inscribirEquipo(Equipo equipo){
        this.equipos.add(equipo);
    }
    
    public void mostrarInfo() {
        System.out.println("Hackathon: " + nombre + " en " + sede);
        System.out.println("Equipos inscritos: " + equipos.size());
        for (Equipo equipo : equipos) {
            System.out.println("- " + equipo.getNombre());
        }
        System.out.println("Patrocinadores: " + patrocinadores.size());
        for (Patrocinador patrocinador : patrocinadores) {
            System.out.println("- " + patrocinador.getNombre());
            System.out.println("- " + patrocinador.getRecurso());
            System.out.println("- " + patrocinador.getPremio());
            System.out.println("- " + patrocinador.getServicio());
        }
    }
    
    public void FinalizarTorneo(){
        System.out.println("El torneo finalizo");
    }

    @Override
    public String toString() {
        return nombre + sede;
    }
    
}
