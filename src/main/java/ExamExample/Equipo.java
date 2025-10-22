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
public class Equipo {
    private String nombre;
    private Proyecto proyecto;
    private List<Participantes> participantess;
    private Mentor mentor;
    
    public Equipo(String nombre, String nombreProyecto) {
        this.nombre = nombre;
        this.proyecto = new Proyecto(nombreProyecto);
        this.participantess = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarParticipantes(Participantes participantes){
        this.participantess.add(participantes);
    }
    
    public void asignarMentor(Mentor mentor){
        this.mentor = mentor;
    }
    
    public void desarrollar(){
        System.out.println("El equipo "+ nombre + " esta desarrollando el proyecto " + proyecto.getNombre() + " y tiene como mentor a "+ mentor.getNombre());
    }
    
    @Override
    public String toString() {
        return nombre;
    }
}
