/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExamExample;

/**
 *
 * @author johan
 */
public class Participantes {
    private String nombre;
    private String matricula;

    public Participantes(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void Unirse(){
        System.out.println(nombre + " se ha unido al equipo");
    }
    
    public void Cambiar(){
        System.out.println(nombre + " se ha cambiado de equipo");
    }
    
    public void Retirarse(){
        System.out.println(nombre + " se ha retirado del torneo por dolor de estomago");
    }

    @Override
    public String toString() {
        return nombre + matricula;
    }
    
    
}
