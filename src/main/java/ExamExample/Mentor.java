/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamExample;

/**
 *
 * @author johan
 */
public class Mentor {
    private int idMentor;
    private String nombre;
    
    public Mentor(int idMentor, String nombre){
        this.idMentor = idMentor;
        this.nombre = nombre;
    }

    public int getIdMentor() {
        return idMentor;
    }

    public void setIdMentor(int idMentor) {
        this.idMentor = idMentor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void Apoyar(){
        System.out.println( nombre + " esta apoyando al equipo ");
    }
    
    public void Abandonar(){
        System.out.println(nombre + " acaba de abandonar al equipo ");
    }

    @Override
    public String toString() {
        return idMentor + nombre;
    }
    
    
}
